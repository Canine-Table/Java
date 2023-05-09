package application;
	import java.awt.Desktop;
import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
	import java.io.IOException;
import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
import javafx.scene.control.Button;
	import javafx.scene.control.Tab;
import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
	import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Font;
public class TextEditorsTabClass { Tab textEditorTab;
	public TextEditorsTabClass(Tab textEditorTab) { this.textEditorTab = textEditorTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane textEditorAnchorPane = new AnchorPane(new Rectangle(700,550, Color.rgb(174, 204, 156)));	
			
			FileInputStream notepadfile = new FileInputStream("notepadButton.png");
		    Image notepadicon = new Image(notepadfile);
			Button notePad = new Button(" NotePad ", new ImageView(notepadicon)); notePad.setTranslateX(X); notePad.setTranslateY(Y+=25); notePad.setFont(new Font("Arial Rounded MT Bold", 24)); 
				notePad.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
				notePad.setMinWidth(300); 
				notePad.setMaxWidth(300);
				notePad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream notepadppfile = new FileInputStream("notepadppButton.png");
	    Image notepadppicon = new Image(notepadppfile);
			Button notePadPlusPlus = new Button(" NotePad++ ", new ImageView(notepadppicon)); notePadPlusPlus.setTranslateX(X); notePadPlusPlus.setTranslateY(Y+=70); notePadPlusPlus.setFont(new Font("Arial Rounded MT Bold", 24));
				notePadPlusPlus.setStyle("-fx-border-color: lime; -fx-text-fill: lime; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
				notePadPlusPlus.setMinWidth(300); 
				notePadPlusPlus.setMaxWidth(300);
				notePadPlusPlus.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad++.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream wordpadfile = new FileInputStream("wordpadButton.png");
	    Image wordpadicon = new Image(wordpadfile);
			Button wordPad = new Button(" WordPad ", new ImageView(wordpadicon)); wordPad.setTranslateX(X); wordPad.setTranslateY(Y+=70); wordPad.setFont(new Font("Arial Rounded MT Bold", 24));
				wordPad.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				wordPad.setMinWidth(300); 
				wordPad.setMaxWidth(300);
				wordPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\WordPad.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream notepad2file = new FileInputStream("notepad2Button.png");
		Image notepad2icon = new Image(notepad2file);
			Button notePad2 = new Button(" NotePad 2 ", new ImageView(notepad2icon)); notePad2.setTranslateX(X); notePad2.setTranslateY(Y+=70); notePad2.setFont(new Font("Arial Rounded MT Bold", 24));
				notePad2.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: indigo"); 
				notePad2.setMinWidth(300); 
				notePad2.setMaxWidth(300);
				notePad2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad 2.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream notepad2modfile = new FileInputStream("notepad2modButton.png");
		Image notepad2modicon = new Image(notepad2modfile);
			Button notePad2Mod = new Button(" NotePad 2 Mod ", new ImageView(notepad2modicon)); notePad2Mod.setTranslateX(X); notePad2Mod.setTranslateY(Y+=70); notePad2Mod.setFont(new Font("Arial Rounded MT Bold", 24));
				notePad2Mod.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				notePad2Mod.setMinWidth(300); 
				notePad2Mod.setMaxWidth(300);
				notePad2Mod.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad 2 Mod.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream sublimetextfile = new FileInputStream("sublimeButton.png");
		Image sublimetexticon = new Image(sublimetextfile);
			Button sublimeText = new Button(" Sublime Text ", new ImageView(sublimetexticon)); sublimeText.setTranslateX(X); sublimeText.setTranslateY(Y+=70); sublimeText.setFont(new Font("Arial Rounded MT Bold", 24));
				sublimeText.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				sublimeText.setMinWidth(300); 
				sublimeText.setMaxWidth(300);
				sublimeText.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sublime Text.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream stickynotesfile = new FileInputStream("stickyButton.png");
		Image stickynotesicon = new Image(stickynotesfile);
			Button stickyNotes = new Button(" Sticky Notes ", new ImageView(stickynotesicon)); stickyNotes.setTranslateX(X); stickyNotes.setTranslateY(Y+=70); stickyNotes.setFont(new Font("Arial Rounded MT Bold", 24));
				stickyNotes.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
				stickyNotes.setMinWidth(300); 
				stickyNotes.setMaxWidth(300);
				stickyNotes.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sticky Notes.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream scitefile = new FileInputStream("sciteButton.png");
		Image sciteicon = new Image(scitefile);
	 Y = 0; Button scite = new Button(" SciTe ", new ImageView(sciteicon)); scite.setTranslateX(X+=340); scite.setTranslateY(Y+=25); scite.setFont(new Font("Arial Rounded MT Bold", 24));
		   		scite.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
		   		scite.setMinWidth(300); 
				scite.setMaxWidth(300);
				scite.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Scite.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream cherrytreefile = new FileInputStream("cherrytreeButton.png");
		Image cherrytreeicon = new Image(cherrytreefile);
		    Button cherryTree = new Button(" Cherry Tree ", new ImageView(cherrytreeicon)); cherryTree.setTranslateX(X); cherryTree.setTranslateY(Y+=70); cherryTree.setFont(new Font("Arial Rounded MT Bold", 24));
				cherryTree.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
				cherryTree.setMinWidth(300); 
				cherryTree.setMaxWidth(300);
				cherryTree.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Cherry Tree.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream ankelpadfile = new FileInputStream("ankelpadButton.png");
		Image ankelpadicon = new Image(ankelpadfile);
			Button ankelPad = new Button(" AnkelPad ", new ImageView(ankelpadicon)); ankelPad.setTranslateX(X); ankelPad.setTranslateY(Y+=70); ankelPad.setFont(new Font("Arial Rounded MT Bold", 24));
				ankelPad.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				ankelPad.setMinWidth(300); 
				ankelPad.setMaxWidth(300);
				ankelPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\AnkelPad.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream hotKeypadfile = new FileInputStream("hotkeypadButton.png");
		Image hotKeypadicon = new Image(hotKeypadfile);
			Button hotKeyPad = new Button(" HotKeyPad ", new ImageView(hotKeypadicon)); hotKeyPad.setTranslateX(X); hotKeyPad.setTranslateY(Y+=70); hotKeyPad.setFont(new Font("Arial Rounded MT Bold", 24));
				hotKeyPad.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
				hotKeyPad.setMinWidth(300); 
				hotKeyPad.setMaxWidth(300);
				hotKeyPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Master Menu\\Editor Menu\\Text_Editor.exe");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
	    FileInputStream blacknotepadfile = new FileInputStream("blacknotepadButton.png");
		Image blacknotepadicon = new Image(blacknotepadfile);
			Button blackNotePad = new Button(" Black Notepad ", new ImageView(blacknotepadicon)); blackNotePad.setTranslateX(X); blackNotePad.setTranslateY(Y+=70); blackNotePad.setFont(new Font("Arial Rounded MT Bold", 24));
				blackNotePad.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				blackNotePad.setMinWidth(300); 
				blackNotePad.setMaxWidth(300);
				blackNotePad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Black NotePad.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream powershellisefile = new FileInputStream("powershelliseButton.png");
		Image powershelliseicon = new Image(powershellisefile);
			Button powerShellISE = new Button(" PowerShell ISE ", new ImageView(powershelliseicon)); powerShellISE.setTranslateX(X); powerShellISE.setTranslateY(Y+=70); powerShellISE.setFont(new Font("Arial Rounded MT Bold", 24));
				powerShellISE.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: mediumblue"); 
				powerShellISE.setMinWidth(300); 
				powerShellISE.setMaxWidth(300);
				powerShellISE.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\powerShell ISE.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream gvimfile = new FileInputStream("vimButton.png");
		Image gvimicon = new Image(gvimfile);
			Button gVim = new Button(" gVim ", new ImageView(gvimicon)); gVim.setTranslateX(X); gVim.setTranslateY(Y+=70); gVim.setFont(new Font("Arial Rounded MT Bold", 24));
				gVim.setStyle("-fx-border-color: Chartreuse; -fx-text-fill: Chartreuse; -fx-border-width: 4px; -fx-background-color: darkgreen"); 
				gVim.setMinWidth(300); 
				gVim.setMaxWidth(300);
				gVim.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\gVim.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

				  FileInputStream textEditorsBackgroundInputStream = new FileInputStream("notepadBackground.png");
				  Image textEditorsBackground = new Image(textEditorsBackgroundInputStream);
				  ImageView textEditorsBackgroundView = new ImageView(textEditorsBackground);
				  textEditorsBackgroundView.setTranslateY(6); textEditorsBackgroundView.setTranslateX(6); 
				  textEditorAnchorPane.getChildren().addAll( textEditorsBackgroundView, notePad, notePadPlusPlus,
				  wordPad, notePad2, notePad2Mod, sublimeText, stickyNotes, scite, cherryTree, ankelPad, hotKeyPad,
				  blackNotePad, powerShellISE, gVim ); textEditorTab.setContent(textEditorAnchorPane); } }