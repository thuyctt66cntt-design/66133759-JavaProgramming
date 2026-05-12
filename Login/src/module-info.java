module Login {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens ThanhThuy.app to javafx.graphics, javafx.fxml;
}
