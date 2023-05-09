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
@SuppressWarnings("unused")
public class Controller 
	{
		public void invokeAction()
		{
			System.exit(0);
		}
	
		public void sayhello()
			{
				System.out.println("hi");
			}
	}