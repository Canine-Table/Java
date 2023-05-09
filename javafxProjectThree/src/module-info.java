module javafxProjectThree {
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
