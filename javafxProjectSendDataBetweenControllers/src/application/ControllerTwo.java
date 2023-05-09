/**
 * 
 */
package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/** @author Table **/
public class ControllerTwo 
	{
		
		@FXML
		private Label usernameLabel;
		@FXML
		private Label passwordLabel;

		public void displayUsername(String username)
			{
				usernameLabel.setText("Hello "+username+", it is nice to meet you!");
			}

		public void displayPassword(String password)
			{
				passwordLabel.setText("Your password is "+password+".");
			}
	}