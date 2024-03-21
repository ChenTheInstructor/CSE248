package controller;

import java.io.IOException;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.StringBag;

public class FirstSceneController {
	private StringBag theBag = Main.getBag();

	@FXML
	private TextField inputField;
	@FXML
	private TextField outputField;

	public void changeSceneButtonClicked(ActionEvent e) {
		try {
			Parent secondRoot = FXMLLoader.load(getClass().getResource("/view/SecondFXML.fxml"));
			Scene secondScene = new Scene(secondRoot);
			Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
			window.setScene(secondScene);
			window.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void addToBag(ActionEvent e) {
		theBag.insert(inputField.getText());
		outputField.setText("You inserted: " + inputField.getText());
		inputField.clear();
	}

}
