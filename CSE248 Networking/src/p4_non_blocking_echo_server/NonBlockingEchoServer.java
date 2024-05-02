package p4_non_blocking_echo_server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NonBlockingEchoServer {
    private static final int PORT = 3333;
    private static final int BUFFER_SIZE = 256;

    public static void main(String[] args) {
        try {
            // Open a selector
            Selector selector = Selector.open();

            // Open a server socket channel
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(PORT));
            serverChannel.configureBlocking(false);
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Server started on port " + PORT);

            while (true) {
                // Wait for an event
                if (selector.select() == 0) {
                    continue;
                }

                // Get all selected keys
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> iter = selectedKeys.iterator();

                while (iter.hasNext()) {
                    SelectionKey key = iter.next();

                    // Check if it's an accept event
                    if (key.isAcceptable()) {
                        register(selector, serverChannel);
                    }

                    // Check if it's a read event
                    if (key.isReadable()) {
                        answerWithEcho(key);
                    }

                    iter.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void register(Selector selector, ServerSocketChannel serverChannel) throws IOException {
        SocketChannel client = serverChannel.accept();
        client.configureBlocking(false);
        client.register(selector, SelectionKey.OP_READ);
        System.out.println("Connection Accepted: " + client.getLocalAddress());
    }

    private static void answerWithEcho(SelectionKey key) throws IOException {
        SocketChannel client = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
        int read = client.read(buffer);

        // Check if the connection was closed
        if (read == -1) {
            System.out.println("Connection closed by: " + client.getRemoteAddress());
            client.close();
            return;
        }

        buffer.flip();
        client.write(buffer);
        buffer.clear();
    }
}
