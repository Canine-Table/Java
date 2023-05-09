package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller implements Initializable
	{
		@FXML
		private Label myLabel;
		@FXML
		private Spinner<Integer> mySpinner;
		
		int currentValue;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
			{
			
			
				SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000);
				valueFactory.setValue(1);
				mySpinner.setValueFactory(valueFactory);

				mySpinner.valueProperty().addListener(new ChangeListener<Integer>()
					{
					
						@Override
						public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) 
							{
								currentValue = mySpinner.getValue();
								myLabel.setText(Integer.toString(valueFactory.getValue()));
							}						
					});
			}
	}