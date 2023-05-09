/**
 * 
 */
package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/** @author Table **/
public class Controller implements Initializable
	{
		@FXML
		private Label myLabel;
		@FXML
		private ProgressBar myLoadingBar;
		@FXML
		private Button launchButton;
		
		BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

		public void launchLoading()
			{
				if(progress.doubleValue() < 1)
					{
						progress = new BigDecimal(String.format("%.2f", progress.doubleValue()+ 0.1));
						myLoadingBar.setProgress(progress.doubleValue());
						myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue()*100))+"%");
					}
			}
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
			{
				myLoadingBar.setStyle("-fx-accent: '#FF00FF';");			
			}
	}