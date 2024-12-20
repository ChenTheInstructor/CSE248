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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.StringBag;

public class Controller2 implements Initializable {
	private StringBag theBag;
	private int nElems;

    @FXML
    private TextArea outputArea;

    @FXML
    void changeScene(ActionEvent event) {
    	try {
			Parent firstRoot = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
			Scene firstScene = new Scene(firstRoot);
			Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage1.setScene(firstScene);
			stage1.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void showBag(ActionEvent event) {
    	for(int i = 0; i < nElems; i++) {
    		outputArea.appendText(theBag.get(i) + "\n");
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = StringBag.getInstance(1000);
		nElems = theBag.getNelems();
	}

}
