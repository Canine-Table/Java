module helloJavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
