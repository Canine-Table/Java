package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller implements Initializable
	{
	
			
		@FXML
 		Button office365;

		@FXML
 		Button textEditors;
	
		@FXML
 		Button searchEngines;
	
		@FXML
 		Button eclipse;

		@FXML
 		Button jetBrains;

		@FXML
 		Button visualStudios;

		@FXML
 		Button controlPanel;

		@FXML
 		Button managementConsole;

		@FXML
        Button adobe;

		@FXML
        Button shortcuts;
		
		@FXML
        Button settings;
		
		@FXML
		BorderPane myBorderPane;
		
		@FXML
		StackPane myStackPane;
		
		
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
		{

		}

	}