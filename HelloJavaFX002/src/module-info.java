module HelloJavaFX002 {
	requires javafx.controls;
	
	opens ThanhThuy.app to javafx.graphics, javafx.fxml;
}
