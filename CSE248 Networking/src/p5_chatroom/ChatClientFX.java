package p5_chatroom;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClientFX extends Application {
    private BufferedReader in;
    private PrintWriter out;
    private TextArea messageArea;

    @Override
    public void start(Stage primaryStage) {
        // Set up the network connection in the background
        connectToServer();

        // GUI Setup
        primaryStage.setTitle("Chat Client");
        BorderPane pane = new BorderPane();
        messageArea = new TextArea();
        messageArea.setEditable(false);
        TextField inputField = new TextField();
        
        // Action on text input
        inputField.setOnAction(event -> {
            out.println(inputField.getText());
            inputField.setText("");
        });

        VBox vbox = new VBox(5, messageArea, inputField);
        pane.setCenter(vbox);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create a new Thread to read messages from the server
        new Thread(() -> {
            try {
                String messageFromServer;
                while ((messageFromServer = in.readLine()) != null) {
                    final String message = messageFromServer;
                    // Update the JavaFX components correctly
                    javafx.application.Platform.runLater(() -> {
                        messageArea.appendText(message + "\n");
                    });
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }).start();
    }

    private void connectToServer() {
        String serverAddress = "localhost";
        int serverPort = 12345;
        try {
            Socket socket = new Socket(serverAddress, serverPort);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void stop() {
        try {
            out.close();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
