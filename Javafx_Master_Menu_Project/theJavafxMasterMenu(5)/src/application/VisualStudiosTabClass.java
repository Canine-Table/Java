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
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
	import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Font;
public class VisualStudiosTabClass { Tab VisualStudiosTab;
	public VisualStudiosTabClass(Tab  VisualStudiosTab) { this.VisualStudiosTab = VisualStudiosTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane VisualStudiosAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(121, 85, 128)));
DropShadow shadow = new DropShadow();
shadow.setColor(Color.MEDIUMPURPLE);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);

		FileInputStream cmdfile = new FileInputStream("bin\\buttonIcon\\cmdButton.png");
		Image cmdicon = new Image(cmdfile);
			Button commandPrompt = new Button(" Cmd Prompt ", new ImageView(cmdicon)); commandPrompt.setTranslateX(X); commandPrompt.setTranslateY(Y+=25); commandPrompt.setFont(new Font("Arial Rounded MT Bold", 24)); 
				commandPrompt.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: black"); 
				commandPrompt.setMinWidth(300); 
				commandPrompt.setMaxWidth(300);
				commandPrompt.setEffect(shadow);
				commandPrompt.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Command Prompt.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream windowsterminalfile = new FileInputStream("bin\\buttonIcon\\terminalButton.png");
		Image windowsterminalicon = new Image(windowsterminalfile);
			Button windowsTerminal = new Button(" Terminal ", new ImageView(windowsterminalicon)); windowsTerminal.setTranslateX(X); windowsTerminal.setTranslateY(Y+=70); windowsTerminal.setFont(new Font("Arial Rounded MT Bold", 24));
				windowsTerminal.setStyle("-fx-border-color: green; -fx-text-fill: green; -fx-border-width: 4px;	-fx-background-color: black"); 
				windowsTerminal.setMinWidth(300);
				windowsTerminal.setMaxWidth(300);
				windowsTerminal.setEffect(shadow);
				windowsTerminal.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Windows Terminal.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream powershellfile = new FileInputStream("bin\\buttonIcon\\powershellButton.png");
		Image powershellicon = new Image(powershellfile);
			Button powerShell = new Button(" PowerShell ", new ImageView(powershellicon)); powerShell.setTranslateX(X); powerShell.setTranslateY(Y+=70); powerShell.setFont(new Font("Arial Rounded MT Bold", 24));
				powerShell.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: purple"); 
				powerShell.setMinWidth(300); 
				powerShell.setMaxWidth(300);
				powerShell.setEffect(shadow);
				powerShell.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerShell.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream powershellcorefile = new FileInputStream("bin\\buttonIcon\\powershellcoreButton.png");
		Image powershellcoreicon = new Image(powershellcorefile);
			Button powerShellCore = new Button(" PowerShell Core ", new ImageView(powershellcoreicon)); powerShellCore.setTranslateX(X); powerShellCore.setTranslateY(Y+=70); powerShellCore.setFont(new Font("Arial Rounded MT Bold", 24));
				powerShellCore.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				powerShellCore.setMinWidth(300); 
				powerShellCore.setMaxWidth(300);
				powerShellCore.setEffect(shadow);
				powerShellCore.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerShell Core.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream visualstudiosfile = new FileInputStream("bin\\buttonIcon\\vsButton.png");
		Image visualstudiosicon = new Image(visualstudiosfile);
			Button visualStudios = new Button(" Visual Studios ", new ImageView(visualstudiosicon)); visualStudios.setTranslateX(X); visualStudios.setTranslateY(Y+=70); visualStudios.setFont(new Font("Arial Rounded MT Bold", 24));
				visualStudios.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: darkviolet"); 
				visualStudios.setMinWidth(300);
				visualStudios.setMaxWidth(300);
				visualStudios.setEffect(shadow);
				visualStudios.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Visual Studios.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream visualstudiocodefile = new FileInputStream("bin\\buttonIcon\\vscodeButton.png");
		Image visualstudiocodeicon = new Image(visualstudiocodefile);
			Button visualStudioCode = new Button(" Code ", new ImageView(visualstudiocodeicon)); visualStudioCode.setTranslateX(X); visualStudioCode.setTranslateY(Y+=70); visualStudioCode.setFont(new Font("Arial Rounded MT Bold", 24));
				visualStudioCode.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				visualStudioCode.setMinWidth(300); 
				visualStudioCode.setMaxWidth(300);
				visualStudioCode.setEffect(shadow);
				visualStudioCode.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Visual Studio Code.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream pythonfile = new FileInputStream("bin\\buttonIcon\\pythonButton.png");
		Image pythonicon = new Image(pythonfile);
			Button python = new Button(" Python ", new ImageView(pythonicon)); python.setTranslateX(X); python.setTranslateY(Y+=70); python.setFont(new Font("Arial Rounded MT Bold", 24));
				python.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: blue"); 
				python.setMinWidth(300); 
				python.setMaxWidth(300);
				python.setEffect(shadow);
				python.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Python.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream nodejsfile = new FileInputStream("bin\\buttonIcon\\nodejsButton.png");
		Image nodejsicon = new Image(nodejsfile);
	Y = 0; 	Button nodeJS = new Button(" Node.js ", new ImageView(nodejsicon)); nodeJS.setTranslateX(X+=340); nodeJS.setTranslateY(Y+=25); nodeJS.setFont(new Font("Arial Rounded MT Bold", 24));
				nodeJS.setStyle("-fx-border-color: lime; -fx-text-fill: lime; -fx-border-width: 4px;	-fx-background-color: green"); 
				nodeJS.setMinWidth(300); 
				nodeJS.setMaxWidth(300);
				nodeJS.setEffect(shadow);
				nodeJS.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Node.js.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream blendfile = new FileInputStream("bin\\buttonIcon\\blendButton.png");
		Image blendicon = new Image(blendfile);
			Button blend = new Button(" Blend ", new ImageView(blendicon)); blend.setTranslateX(X); blend.setTranslateY(Y+=70); blend.setFont(new Font("Arial Rounded MT Bold", 24));
				blend.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
				blend.setMinWidth(300); 
				blend.setMaxWidth(300);
				blend.setEffect(shadow);
				blend.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Blend for Visual Studio 2022.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream unityhubfile = new FileInputStream("bin\\buttonIcon\\unityButton.png");
		Image unityhubicon = new Image(unityhubfile);
			Button unityHub = new Button(" Unity Hub ", new ImageView(unityhubicon)); unityHub.setTranslateX(X); unityHub.setTranslateY(Y+=70); unityHub.setFont(new Font("Arial Rounded MT Bold", 24));
				unityHub.setStyle("-fx-border-color: black; -fx-text-fill: black; -fx-border-width: 4px;	-fx-background-color: white"); 
				unityHub.setMinWidth(300); 
				unityHub.setMaxWidth(300);
				unityHub.setEffect(shadow);
				unityHub.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Unity Hub.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream cocosfile = new FileInputStream("bin\\buttonIcon\\cocosButton.png");
		Image cocosicon = new Image(cocosfile);
			Button cocos = new Button(" Cocos ", new ImageView(cocosicon)); cocos.setTranslateX(X); cocos.setTranslateY(Y+=70); cocos.setFont(new Font("Arial Rounded MT Bold", 24));
				cocos.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: gray"); 
				cocos.setMinWidth(300); 
				cocos.setMaxWidth(300);
				cocos.setEffect(shadow);
				cocos.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Cocos.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream epicgameslauncherfile = new FileInputStream("bin\\buttonIcon\\epicgameslauncherButton.png");
		Image epicgameslaunchericon = new Image(epicgameslauncherfile);
			Button epicGamesLauncher = new Button(" Epic Games ", new ImageView(epicgameslaunchericon)); epicGamesLauncher.setTranslateX(X); epicGamesLauncher.setTranslateY(Y+=70); epicGamesLauncher.setFont(new Font("Arial Rounded MT Bold", 24));
				epicGamesLauncher.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: brown"); 
				epicGamesLauncher.setMinWidth(300); 
				epicGamesLauncher.setMaxWidth(300);
				epicGamesLauncher.setEffect(shadow);
				epicGamesLauncher.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\EpicGamesLauncher.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream idlefile = new FileInputStream("bin\\buttonIcon\\idleButton.png");
		Image idleicon = new Image(idlefile);
			Button IDLE = new Button(" IDLE ", new ImageView(idleicon)); IDLE.setTranslateX(X); IDLE.setTranslateY(Y+=70); IDLE.setFont(new Font("Arial Rounded MT Bold", 24));
				IDLE.setStyle("-fx-border-color: blue; -fx-text-fill: blue; -fx-border-width: 4px;	-fx-background-color: yellow"); 
				IDLE.setMinWidth(300);
				IDLE.setMaxWidth(300);
				IDLE.setEffect(shadow);
				IDLE.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\IDLE.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream bashfile = new FileInputStream("bin\\buttonIcon\\bashButton.png");
		Image bashicon = new Image(bashfile);
			Button bash = new Button(" Bash Shell ", new ImageView(bashicon)); bash.setTranslateX(X); bash.setTranslateY(Y+=70); bash.setFont(new Font("Arial Rounded MT Bold", 24));
				bash.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: black"); 
				bash.setMinWidth(300); 
				bash.setMaxWidth(300);
				bash.setEffect(shadow);
				bash.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Git Bash.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		  FileInputStream VisualStudiosBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\vsBackground.png");
		  Image VisualStudiosBackground = new Image(VisualStudiosBackgroundInputStream);
		  ImageView VisualStudiosBackgroundView = new ImageView(VisualStudiosBackground);
		  VisualStudiosBackgroundView.setTranslateY(6); VisualStudiosBackgroundView.setTranslateX(6); 
		  VisualStudiosAnchorPane.getChildren().addAll( VisualStudiosBackgroundView, bash, blend, cocos, 
		  commandPrompt, epicGamesLauncher, IDLE, nodeJS, powerShell, powerShellCore, python, unityHub, 
		  visualStudios, visualStudioCode, windowsTerminal); VisualStudiosTab.setContent(VisualStudiosAnchorPane); } }