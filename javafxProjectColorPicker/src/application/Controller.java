package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/** @author Table **/
public class Controller 
	{		
		@FXML
		private Label myLabel;
		@FXML
		private ColorPicker colorPicker;
		@FXML
		private AnchorPane myAnchorPane;
		
		public void colorChoice(ActionEvent evt)
			{
				Color myColor = colorPicker.getValue();
				myAnchorPane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
				myLabel.setText(myColor.toString());
			}
	}