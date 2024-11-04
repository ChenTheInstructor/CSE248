package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.StringBag;

public class App extends Application {
//	private final static int MAX_SIZE = 1000;
//	private static StringBag theBag;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		theBag = StringBag.getInstance(MAX_SIZE);
		Parent root = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
