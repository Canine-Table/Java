package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

/** @author Table **/
public class Main extends Application 
	{
	
		private double x;
		private double y;
		public Circle fxCircle;
		
		public void up(ActionEvent e)
			{
				//System.out.println("up");
				fxCircle.setCenterY(y-=5);
			}
			
		public void down(ActionEvent e)
			{
				//System.out.println("down");
				fxCircle.setCenterY(y+=5);

			}
		
		public void left(ActionEvent e)
			{
				//System.out.println("left");
				fxCircle.setCenterX(x-=5);

			}
		
		public void right(ActionEvent e)
			{
				//System.out.println("right");
				fxCircle.setCenterX(x+=5);

			}
		
		@Override
		public void start(Stage primaryStage) throws Exception 
			{
				Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}