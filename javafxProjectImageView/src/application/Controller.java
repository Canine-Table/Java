package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** @author Table **/
public class Controller
	{
		@FXML
		private ImageView fxImageView;
		@FXML
		private Button fxSwitchButton;

		public void displayImage()
			{
				Image myImage = new Image("C:\\Users\\Table\\eclipse-workspace\\Eclipse IDE for Java Developers\\Eclipse-Workspace-JavaFX\\javafxProjectImageView\\src\\application\\Two.jpg");
				fxImageView.setImage(myImage);
			}
	}