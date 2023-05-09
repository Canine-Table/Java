package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller implements Initializable
	{
		@FXML
		Label myLabel;
		@FXML
		private ListView<String> myListVliew;
		String[] myFood = {"pizza","bread","candy","pasta","corn","salad"};
		String currentFood;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1)
			{
				myListVliew.getItems().addAll(myFood);
				
				myListVliew.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<>() 
				{
					@Override
					public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) 
						{
							currentFood = myListVliew.getSelectionModel().getSelectedItem();
							myLabel.setText(currentFood);
						}
				});
			}
	}