package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/** @author Table **/
public class Controller
	{
		@FXML
		private TextField myTextField;
		@FXML
		private Button myButton;
		@FXML
		private Label myLabel;
		
		int age;
		
		public void submitResponse(ActionEvent evt)
			{
				try
					{
						age = Integer.parseInt(myTextField.getText());
						
						if(age >= 18) 
							{
								myLabel.setText("You are now signed up.");
							}
						else
							{
								myLabel.setText("You must be 18 or older to create an account.");
							}
						
					} catch(NumberFormatException e)
						{
							myLabel.setText("Error! "+e.fillInStackTrace());
						} catch(Exception e)
							{
								myLabel.setText("Critical Error!! "+e.fillInStackTrace());
							}
			}
	}