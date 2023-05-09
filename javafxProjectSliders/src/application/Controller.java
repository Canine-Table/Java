/**
 * 
 */
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

/** @author Table **/
public class Controller implements Initializable
	{
		@FXML
		Slider mySlider;
		@FXML
		Label myLabel;
		
		int myTemp;

		public void changeValue(ActionEvent evt)
			{

			}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
			{
				mySlider.valueProperty().addListener(new ChangeListener<Number>()
					{

						@Override
						public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) 
							{
								myTemp = (int)mySlider.getValue();
								myLabel.setText(Integer.toString(myTemp)+"℃");
							}
					});
			}
	}