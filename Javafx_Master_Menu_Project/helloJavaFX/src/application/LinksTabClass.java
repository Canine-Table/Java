package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LinksTabClass {

Tab LinksTab;

public LinksTabClass(Tab  LinksTab) {
this.LinksTab = LinksTab;

}

public void open() { 

AnchorPane LinksAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(73, 158, 157)));
Button notePad = new Button();
notePad.setTranslateX(50); notePad.setTranslateY(50);
FileInputStream textEditorsBackgroundInputStream;
try { textEditorsBackgroundInputStream = new FileInputStream("bin/background/links.png");
	  Image textEditorsBackground = new Image(textEditorsBackgroundInputStream);
	  ImageView textEditorsBackgroundView = new ImageView(textEditorsBackground);
	  textEditorsBackgroundView.setTranslateY(6); textEditorsBackgroundView.setTranslateX(6);
	  LinksAnchorPane.getChildren().addAll(textEditorsBackgroundView,notePad);
 } catch (FileNotFoundException e) {}
LinksTab.setContent(LinksAnchorPane);
	}
}