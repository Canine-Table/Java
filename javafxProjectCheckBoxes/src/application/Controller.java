package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;

/** @author Table **/
public class Controller 
	{
		@FXML
		private Label myLabel;
		@FXML
		public ImageView myImageView;
		@FXML
		private CheckBox myCheckBox;

		public void onoff(ActionEvent evt)
			{
				try 
					{
						if(myCheckBox.isSelected())
							{
								myLabel.setText("On");
								myImageView.setImage(new Image("C:\\Users\\Table\\eclipse-workspace\\Eclipse IDE for Java Developers\\Eclipse-Workspace-JavaFX\\javafxProjectCheckBoxes\\src\\application\\on.png"));
							}
						else
							{
								myLabel.setText("Off");
								myImageView.setImage(new Image("C:\\Users\\Table\\eclipse-workspace\\Eclipse IDE for Java Developers\\Eclipse-Workspace-JavaFX\\javafxProjectCheckBoxes\\src\\application\\off.png"));
							}
					} catch(NullPointerException e) 
						{
							System.out.println(""+e.fillInStackTrace());
						}
			}
	}