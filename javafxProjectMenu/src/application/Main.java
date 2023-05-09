package application;
	
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

/** @author Table **/
@SuppressWarnings({"deprecation","unused"})
public class Main extends Application 
	{
		Runtime run = Runtime.getRuntime();
		
		@Override
		public void start(Stage primaryStage) throws Exception
			{
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/iconarchive/home-eco-friendly/48/Home-Pool-Eco-Friendly-icon.png"));
				String css = this.getClass().getResource("application.css").toExternalForm();
				Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));
				primaryStage.setTitle("Switching Scenes");
				Scene scene = new Scene(rootNode);
				scene.getStylesheets().add(css);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	
		public void word(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE"));
			}
		
		public void teams(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\Microsoft\\Teams\\current\\Teams.exe"));
			}
		
		public void powerPoint(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE"));
			}
		
		public void infoPath(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\Office15\\INFOPATH.EXE"));
			}
		
		public void access(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\MSACCESS.EXE"));
			}
		
		public void oneDrive(ActionEvent evt) throws IOException
			{
//
			}
		
		public void excel(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE"));
			}
		
		public void powerBI(ActionEvent evt) throws IOException
			{
//
			}
		
		public void oneNote(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\ONENOTE.EXE"));
			}
		
		public void sway(ActionEvent evt) throws IOException
			{
//
			}		

		public void publisher(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\MSPUB.EXE"));
			}	
		
		public void powerApps(ActionEvent evt) throws IOException
			{
//
			}
		
		public void outook(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE"));
			}	
		
		public void powerAutomate(ActionEvent evt) throws IOException
		{
//
		}	
		
		public void skype(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Microsoft Office\\root\\Office16\\lync.exe"));
			}	
		
		
		
		
		
		public void notePad(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Windows\\system32\\notepad.exe"));
			}
		
		public void sciTE(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\AutoHotkey\\SciTE\\SciTE.exe"));
			}		

		public void notePadPP(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Notepad++\\notepad++.exe"));
			}

		public void cherryTree(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\CherryTree\\mingw64\\bin\\cherrytree.exe"));
			}
		
		public void wordPad(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe"));
			}
		
		public void ankelPad(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\PortableApps\\AkelPadPortable\\AkelPadPortable.exe"));
			}
		
		public void notePad2(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\PortableApps\\Notepad2Portable\\Notepad2Portable.exe"));
			}

		public void hotKeyPad(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Master Menu\\Editor Menu\\Text_Editor.exe"));
			}

		public void notePad2Mod(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\PortableApps\\Notepad2-modPortable\\Notepad2-modPortable.exe"));
			}

		public void blackNotePad(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\WindowsApps\\55809savaged.BlackNotepad_1.0.9.0_neutral__p2aarvyam9pfc\\BlackNotepad\\BlackNotepad.exe"));
			}

		public void sublimeText(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Sublime Text\\sublime_text.exe"));
			}
				
		public void stickyNotes(ActionEvent evt) throws IOException
			{
//
			}
		
		public void adventure(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Adventure\\Adventure.exe"));
			}
		
		public void gVim(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Vim\\vim82\\gvim.exe"));
			}
		
		public void balabolka(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files (x86)\\Balabolka\\balabolka.exe"));
			}
		
		public void CandCPP(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\cpp-2022-09\\eclipse\\eclipse.exe"));
			}
		
		public void RCPandRAP(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\Adventure\\Adventure.exe"));
			}
		
		public void EmbeddedCandCPP(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\embedcpp-2022-09\\eclipse\\eclipse.exe"));
			}
		
		public void JavaandDSL(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\dsl-2022-09\\eclipse\\eclipse.exe"));
			}
		
		public void computing(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\parallel-2022-09\\eclipse\\eclipse.exe"));
			}
		
		public void java(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\java-2022-092\\eclipse\\eclipse.exe"));
			}
		
		public void modelingTools(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\modeling-2022-09\\eclipse\\eclipse.exe"));
			}
		
		public void JavaandtheWeb(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\jee-2022-09\\eclipse\\eclipse.exe"));
			}

		public void php(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\php-2022-09\\eclipse\\eclipse.exe"));
			}

		public void scout(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\eclipse\\scout-2022-09\\eclipse\\eclipse.exe"));
			}

		

		
		
		
		
		
		
		
		
		
		
		public void cLion(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\CLion\\ch-0\\221.5080.224\\bin\\clion64.exe"));
			}

		public void dotCover(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Installations\\dotCover221\\dotCover.Shell.exe"));
			}
			
		public void intelijIdea(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.2.3\\bin\\idea64.exe"));
			}
		
		public void dotMemory(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Installations\\dotMemory221\\dotMemory.UI.64.exe"));
			}
		
		public void rider(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\Rider\\ch-0\\221.5591.20\\bin\\rider64.exe"));
			}
			
		public void dotPeek(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Installations\\dotPeek221\\dotPeek64.exe"));
			}
		
		public void rubyMine(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\RubyMine\\ch-0\\221.5080.196\\bin\\rubymine64.exe"));
			}
		
		public void dataGrip(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\datagrip\\ch-0\\221.5591.9\\bin\\datagrip64.exe"));
			}
		
		public void dotTrace(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Installations\\dotTrace221\\dotTrace64.exe"));
			}
		
		public void phpStorm(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\PhpStorm\\ch-0\\221.5080.224\\bin\\phpstorm64.exe"));
			}
		
		public void dataSpell(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("\"C:\\Users\\Table\\AppData\\Local\\JetBrains\\DataSpell 2022.1\\bin\\dataspell64.exe\""));
			}
		
		public void pyCharm(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Program Files\\JetBrains\\PyCharm Community Edition 2022.2.3\\bin\\pycharm64.exe"));
			}
		
		public void goLand(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\Goland\\ch-0\\221.5080.224\\bin\\goland64.exe"));
			}
			
		public void webStorm(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\apps\\WebStorm\\ch-0\\221.5080.193\\bin\\webstorm64.exe"));
			}
		
		public void toolBox(ActionEvent evt) throws IOException
			{
				Process process = run.exec(new String("C:\\Users\\Table\\AppData\\Local\\JetBrains\\Toolbox\\bin\\jetbrains-toolbox.exe"));
			}
		
		
				
		
		
	}