package p5_chatroom;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class ChatServer {
    private static final int PORT = 12345;
    private static ConcurrentMap<String, PrintWriter> clients = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(100);
        AtomicBoolean running = new AtomicBoolean(true);

        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Chat Server started on port " + PORT);

            while (running.get()) {
                try {
                    Socket client = server.accept();
                    pool.submit(new ClientHandler(client, running));
                } catch (IOException e) {
                    System.out.println("Accept failed: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not listen on port " + PORT + ": " + e.getMessage());
        } finally {
            pool.shutdown();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private String clientName;
        private AtomicBoolean running;

        public ClientHandler(Socket socket, AtomicBoolean running) {
            this.socket = socket;
            this.running = running;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                clientName = "Client[" + socket.getPort() + "]";
                clients.put(clientName, out);
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    for (PrintWriter writer : clients.values()) {
                        writer.println(clientName + ": " + inputLine);
                    }
                }
            } catch (IOException e) {
                System.out.println(clientName + " error: " + e.getMessage());
            } finally {
                if (clientName != null) {
                    clients.remove(clientName);
                    System.out.println(clientName + " has left.");
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("Couldn't close a socket, what's going on?");
                }
            }
        }
    }
}
