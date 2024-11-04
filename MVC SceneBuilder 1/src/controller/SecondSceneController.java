package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.StringBag;

public class SecondSceneController implements Initializable {
	private StringBag theBag;
	private int nElems;
	

    @FXML
    private TextArea outputArea;

    @FXML
    private Button showBag;

    @FXML
    void changeSceneButtonClicked(ActionEvent e) throws IOException {
    	Parent firstRoot = FXMLLoader.load(getClass().getResource("/view/FirstFXML.fxml"));
    	Scene firstScene = new Scene(firstRoot);
    	Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
    	window.setScene(firstScene);
    	window.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = Main.getBag();
		nElems = theBag.getNelems();
	}
	
	public void showBag(ActionEvent e) {
		for(int i = 0; i < nElems; i++) {
			outputArea.appendText(theBag.get(i) + "\n");
		}
	}

}
