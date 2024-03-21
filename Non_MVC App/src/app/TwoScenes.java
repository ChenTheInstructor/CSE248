package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TwoScenes extends Application {
	private Stage theStage;
	private Scene scene1, scene2;
	private Label lblScene1, lblScene2;
	private VBox pane1, pane2;
	private Button btnScene1, btnScene2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		theStage = primaryStage;

		btnScene1 = new Button("To Scene 2");
		btnScene2 = new Button("To Scene 1");

		btnScene1.setOnAction(e -> {
			buttonClicked(e);
		});

		btnScene2.setOnAction(e -> {
			buttonClicked(e);
		});

		lblScene1 = new Label("Scene 1");
		lblScene2 = new Label("Scene 2");
		
		lblScene1.setStyle("-fx-font-size: 20; -fx-text-fill: red");
		lblScene2.setStyle("-fx-font-size: 20; -fx-text-fill: black");

		pane1 = new VBox(20);
		pane2 = new VBox(20);
		
		pane1.setAlignment(Pos.CENTER);
		pane2.setAlignment(Pos.CENTER);

		pane1.setStyle("-fx-background-color: blue; -fx-padding: 10px");
		pane2.setStyle("-fx-background-color: red; -fx-padding: 10px");

		pane1.getChildren().addAll(lblScene1, btnScene1);
		pane2.getChildren().addAll(lblScene2, btnScene2);

		scene1 = new Scene(pane1, 400, 200);
		scene2 = new Scene(pane2, 400, 200);
		primaryStage.setTitle("Hello!");
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	private void buttonClicked(ActionEvent e) {
		if (e.getSource() == btnScene1) {
			theStage.setScene(scene2);
		} else {
			theStage.setScene(scene1);
		}
	}

}
