package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.StringBag;

public class FirstController implements Initializable {
	private static StringBag theBag;
	@FXML
	private TextField inputField;
	@FXML
	private TextField outputField;

	@FXML
	public void addToBag(ActionEvent e) {
		theBag.insert(inputField.getText());
		outputField.setText("You inserted " + inputField.getText());
		inputField.clear();
	}

	@FXML
	public void changeSceneButtonClicked(ActionEvent e) {
		try {
			Parent secondRoot = FXMLLoader.load(getClass().getResource("/view/Scene2.fxml"));
			Scene secondScene = new Scene(secondRoot);
			Stage stage2 = (Stage) ((Node) e.getSource()).getScene().getWindow();
			stage2.setScene(secondScene);
			stage2.show();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = StringBag.getInstance(1000);
	}
}
