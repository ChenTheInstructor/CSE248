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

public class Controller1 implements Initializable {
	private StringBag theBag;

    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    @FXML
    void addToBag(ActionEvent event) {
    	theBag.insert(inputField.getText());
    	outputField.setText("String added to the Bag");
    	inputField.clear();
    }

    @FXML
    void changeScene(ActionEvent event) {
    	try {
			Parent secondRoot = FXMLLoader.load(getClass().getResource("/view/Scene2.fxml"));
			Scene secondScene = new Scene(secondRoot);
			Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage2.setScene(secondScene);
			stage2.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = StringBag.getInstance(1000);
	}

}
