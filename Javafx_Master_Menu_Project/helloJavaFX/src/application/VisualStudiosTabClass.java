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
import javafx.scene.text.Font;

public class VisualStudiosTabClass {

Tab VisualStudiosTab;

public VisualStudiosTabClass(Tab  VisualStudiosTab) {
this.VisualStudiosTab = VisualStudiosTab;

}

public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane VisualStudiosAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(121, 85, 128)));

		FileInputStream cmdfile = new FileInputStream("bin/button/cmd.png");
		Image cmdicon = new Image(cmdfile);
			Button commandPrompt = new Button(" Cmd Prompt ", new ImageView(cmdicon)); commandPrompt.setTranslateX(X); commandPrompt.setTranslateY(Y+=25); commandPrompt.setFont(new Font("Arial Rounded MT Bold", 24)); 
				commandPrompt.setStyle("-fx-border-color: navy; -fx-text-fill: navy; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
				commandPrompt.setMinWidth(300); 
				commandPrompt.setMaxWidth(300);
				
		FileInputStream windowsterminalfile = new FileInputStream("bin/button/terminal.png");
		Image windowsterminalicon = new Image(windowsterminalfile);
			Button windowsTerminal = new Button(" Terminal ", new ImageView(windowsterminalicon)); windowsTerminal.setTranslateX(X); windowsTerminal.setTranslateY(Y+=70); windowsTerminal.setFont(new Font("Arial Rounded MT Bold", 24));
				windowsTerminal.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
				windowsTerminal.setMinWidth(300); 
				windowsTerminal.setMaxWidth(300);
				
		FileInputStream powershellfile = new FileInputStream("bin/button/powershell.png");
		Image powershellicon = new Image(powershellfile);
			Button powerShell = new Button(" PowerShell ", new ImageView(powershellicon)); powerShell.setTranslateX(X); powerShell.setTranslateY(Y+=70); powerShell.setFont(new Font("Arial Rounded MT Bold", 24));
				powerShell.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				powerShell.setMinWidth(300); 
				powerShell.setMaxWidth(300);
				
		FileInputStream powershellcorefile = new FileInputStream("bin/button/powershellcore.png");
		Image powershellcoreicon = new Image(powershellcorefile);
			Button powerShellCore = new Button(" PowerShell Core ", new ImageView(powershellcoreicon)); powerShellCore.setTranslateX(X); powerShellCore.setTranslateY(Y+=70); powerShellCore.setFont(new Font("Arial Rounded MT Bold", 24));
				powerShellCore.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				powerShellCore.setMinWidth(300); 
				powerShellCore.setMaxWidth(300);
				
		FileInputStream visualstudiosfile = new FileInputStream("bin/button/vs.png");
		Image visualstudiosicon = new Image(visualstudiosfile);
			Button visualStudios = new Button(" Visual Studios ", new ImageView(visualstudiosicon)); visualStudios.setTranslateX(X); visualStudios.setTranslateY(Y+=70); visualStudios.setFont(new Font("Arial Rounded MT Bold", 24));
				visualStudios.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				visualStudios.setMinWidth(300); 
				visualStudios.setMaxWidth(300);
				
		FileInputStream visualstudiocodefile = new FileInputStream("bin/button/vscode.png");
		Image visualstudiocodeicon = new Image(visualstudiocodefile);
			Button visualStudioCode = new Button(" Code ", new ImageView(visualstudiocodeicon)); visualStudioCode.setTranslateX(X); visualStudioCode.setTranslateY(Y+=70); visualStudioCode.setFont(new Font("Arial Rounded MT Bold", 24));
				visualStudioCode.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				visualStudioCode.setMinWidth(300); 
				visualStudioCode.setMaxWidth(300);
				
		FileInputStream pythonfile = new FileInputStream("bin/button/python.png");
		Image pythonicon = new Image(pythonfile);
			Button python = new Button(" Python ", new ImageView(pythonicon)); python.setTranslateX(X); python.setTranslateY(Y+=70); python.setFont(new Font("Arial Rounded MT Bold", 24));
				python.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				python.setMinWidth(300); 
				python.setMaxWidth(300);
				
		FileInputStream nodejsfile = new FileInputStream("bin/button/nodejs.png");
		Image nodejsicon = new Image(nodejsfile);
	Y = 0; 	Button nodeJS = new Button(" Node.js ", new ImageView(nodejsicon)); nodeJS.setTranslateX(X+=340); nodeJS.setTranslateY(Y+=25); nodeJS.setFont(new Font("Arial Rounded MT Bold", 24));
				nodeJS.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
				nodeJS.setMinWidth(300); 
				nodeJS.setMaxWidth(300);
				
		FileInputStream blendfile = new FileInputStream("bin/button/blend.png");
		Image blendicon = new Image(blendfile);
			Button blend = new Button(" Blend ", new ImageView(blendicon)); blend.setTranslateX(X); blend.setTranslateY(Y+=70); blend.setFont(new Font("Arial Rounded MT Bold", 24));
				blend.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
				blend.setMinWidth(300); 
				blend.setMaxWidth(300);
				
		FileInputStream unityhubfile = new FileInputStream("bin/button/unity.png");
		Image unityhubicon = new Image(unityhubfile);
			Button unityHub = new Button(" Unity Hub ", new ImageView(unityhubicon)); unityHub.setTranslateX(X); unityHub.setTranslateY(Y+=70); unityHub.setFont(new Font("Arial Rounded MT Bold", 24));
				unityHub.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
				unityHub.setMinWidth(300); 
				unityHub.setMaxWidth(300);
				
		FileInputStream cocosfile = new FileInputStream("bin/button/cocos.png");
		Image cocosicon = new Image(cocosfile);
			Button cocos = new Button(" Cocos ", new ImageView(cocosicon)); cocos.setTranslateX(X); cocos.setTranslateY(Y+=70); cocos.setFont(new Font("Arial Rounded MT Bold", 24));
				cocos.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				cocos.setMinWidth(300); 
				cocos.setMaxWidth(300);
				
		FileInputStream epicgameslauncherfile = new FileInputStream("bin/button/epicgameslauncher.png");
		Image epicgameslaunchericon = new Image(epicgameslauncherfile);
			Button epicGamesLauncher = new Button(" Epic Games ", new ImageView(epicgameslaunchericon)); epicGamesLauncher.setTranslateX(X); epicGamesLauncher.setTranslateY(Y+=70); epicGamesLauncher.setFont(new Font("Arial Rounded MT Bold", 24));
				epicGamesLauncher.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
				epicGamesLauncher.setMinWidth(300); 
				epicGamesLauncher.setMaxWidth(300);
				
		FileInputStream idlefile = new FileInputStream("bin/button/idle.png");
		Image idleicon = new Image(idlefile);
			Button IDLE = new Button(" IDLE ", new ImageView(idleicon)); IDLE.setTranslateX(X); IDLE.setTranslateY(Y+=70); IDLE.setFont(new Font("Arial Rounded MT Bold", 24));
				IDLE.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				IDLE.setMinWidth(300); 
				IDLE.setMaxWidth(300);
				
		FileInputStream bashfile = new FileInputStream("bin/button/bash.png");
		Image bashicon = new Image(bashfile);
			Button bash = new Button(" Bash Shell ", new ImageView(bashicon)); bash.setTranslateX(X); bash.setTranslateY(Y+=70); bash.setFont(new Font("Arial Rounded MT Bold", 24));
				bash.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				bash.setMinWidth(300); 
				bash.setMaxWidth(300);
				
		  FileInputStream VisualStudiosBackgroundInputStream = new FileInputStream("bin/background/visual.png");
		  Image VisualStudiosBackground = new Image(VisualStudiosBackgroundInputStream);
		  ImageView VisualStudiosBackgroundView = new ImageView(VisualStudiosBackground);
		  VisualStudiosBackgroundView.setTranslateY(6); VisualStudiosBackgroundView.setTranslateX(6); 
		  VisualStudiosAnchorPane.getChildren().addAll( VisualStudiosBackgroundView, bash, blend, cocos, commandPrompt,
		  epicGamesLauncher, IDLE, nodeJS, powerShell, powerShellCore, python, unityHub, visualStudios, visualStudioCode, windowsTerminal  ); 

VisualStudiosTab.setContent(VisualStudiosAnchorPane);
	}
}