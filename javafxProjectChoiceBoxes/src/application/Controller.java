package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/** @author Table **/
public class Controller implements Initializable
	{
		@FXML
		private ChoiceBox<String> myChoiceBox;
		@FXML
		private Label myLabel;
		private static final String[] MY_CHOICES = {"Pizza","Bread","Salad","Candy"};
		
		public void selectedChoice(ActionEvent evt)
			{
				myLabel.setText(new String(myChoiceBox.getValue()));
			}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
			{
				myChoiceBox.getItems().setAll(MY_CHOICES);
				myChoiceBox.setOnAction(this::selectedChoice);
				/**( :: is a method reference operator )**/
			}
	}