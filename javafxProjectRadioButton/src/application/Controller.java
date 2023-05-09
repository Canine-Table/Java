/**
 * 
 */
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/** @author Table **/
public class Controller 
	{
		@FXML
		private RadioButton pizza,salad,candy,bread,pasta;
		@FXML
		private Label myLabel;
		
		public void getFood(ActionEvent evt)
			{
				if(pizza.isSelected())
					{
						myLabel.setText("You selected "+pizza.getText()+".");
					}
				else if(salad.isSelected())
					{
						myLabel.setText("You selected a "+salad.getText()+".");
					}
				else if(candy.isSelected())
					{
						myLabel.setText("You selected "+candy.getText()+".");
					}
				else if(bread.isSelected())
					{
						myLabel.setText("You selected "+bread.getText()+".");
					}
				else if (pasta.isSelected())
					{
						myLabel.setText("You selected "+pasta.getText()+".");
					}
				else 
					{
						myLabel.setText("Please make your choice.");
					}
			}
	}
