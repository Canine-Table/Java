package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/** @author Table **/
public class Main extends Application 
	{
	
	
		Text fxText() 
			{
				Text fxText = new Text("Some Silly Text :D");
				fxText.setFont(Font.font("Verdana",50));
				fxText.setFill(Color.rgb(255, 255, 255));
				fxText.setX(50); fxText.setY(100);
				return fxText;
			}
		
		Line fxLine(int xStart, int yStart, int xEnd, int yEnd)
			{
				Line fxLine = new Line();
				fxLine.setStartX(xStart);
				fxLine.setStartY(yStart);
				fxLine.setEndX(xEnd);
				fxLine.setEndY(yEnd);
				fxLine.setStrokeWidth(10);
				fxLine.setStroke(Color.rgb(255, 255, 255));
				return fxLine;
			}
		Rectangle fxRectangle(int xStart, int yStart, int xWidth, int yHeight)
			{
				Rectangle fxRectangle = new Rectangle();
				fxRectangle.setX(xStart);
				fxRectangle.setY(yStart);
				fxRectangle.setHeight(yHeight);
				fxRectangle.setWidth(xWidth);
				fxRectangle.setStrokeWidth(10);
				fxRectangle.setFill(Color.rgb(0,0,255));
				fxRectangle.setStroke(Color.rgb(255,255,255));
				fxRectangle.setOpacity(1);
				return fxRectangle;
			}
		
		Polygon fxTryangle(double xOne, double yOne, double xTwo, double yTwo, double xThree, double yThree)
			{
				Polygon fxTryangle = new Polygon();
				fxTryangle.setStrokeWidth(10);
				fxTryangle.setFill(Color.rgb(255,0,255));
				fxTryangle.setStroke(Color.rgb(255,255,255));
				fxTryangle.getPoints().setAll(xOne,yOne,xTwo,yTwo,xThree,yThree);
				return fxTryangle;
			}
		Circle fxCircle(int xCenter, int yCenter, int circleRadius)
			{
				Circle fxCircle = new Circle();
				fxCircle.setCenterX(xCenter);
				fxCircle.setCenterY(yCenter);
				fxCircle.setStrokeWidth(10);
				fxCircle.setRadius(circleRadius);
				fxCircle.setStroke(Color.rgb(255,255,255));
				fxCircle.setFill(Color.rgb(255,0,0));
				return fxCircle;
			}
		ImageView fxImageView(double xStart, double yStart, String setImage)
			{
				ImageView fxImageView = new ImageView(new Image(setImage));
				fxImageView.setX(xStart);
				fxImageView.setY(yStart);
				return fxImageView;
			}
		@Override
		public void start(Stage primaryStage) throws Exception 
			{
				BorderPane rootNode = new BorderPane();
				Scene scene = new Scene(rootNode,1024,512,Color.rgb(0, 0, 0));
				primaryStage.getIcons().add(new Image("https://gluonhq.com/wp-content/uploads/2015/02/SceneBuilderLogo@2x.png"));
				primaryStage.setTitle("JavaFX");
				primaryStage.setScene(scene);
				primaryStage.setFullScreen(true);
				primaryStage.setFullScreenExitHint("You can't escape unless you give me all your money!");
				primaryStage.setResizable(false);
				primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
				rootNode.getChildren().add(fxLine(50,120,520,120));
				rootNode.getChildren().add(fxLine(30,150,540,150));
				rootNode.getChildren().add(fxRectangle(30,180,510,220));
				rootNode.getChildren().add(fxRectangle(30,180,510,220));		
				rootNode.getChildren().add(fxTryangle(565,395,565,180,900,275));
				rootNode.getChildren().add(fxCircle(644,284,62));
				rootNode.getChildren().add(fxImageView(150,162,"https://images.vexels.com/media/users/3/134615/isolated/preview/36d955206f05f36a3d4c053c2fea3937-joke-emoji-emoticon-by-vexels.png"));
				rootNode.getChildren().add(fxText());
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}