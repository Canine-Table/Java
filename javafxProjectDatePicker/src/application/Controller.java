package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/** @author Table **/
public class Controller 
	{
	
		@FXML
		private DatePicker datePicker;
		@FXML
		private Label myLabel;
	
		public void selectDate()
			{
				LocalDate myDate = datePicker.getValue();
				String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMMM-DD-YYYY"));
				myLabel.setText(myFormattedDate.toString());
			}
	}