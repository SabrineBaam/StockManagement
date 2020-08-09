package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class UpdateProductController {
	
	@FXML
	private TextField txtID;
	@FXML
	private TextField txtRef;
	@FXML
	private TextField txtQuantity;
	
	public void UpdateProduct(ActionEvent event) {
		try {
			
			Functions.UpdateProduct(Integer.valueOf(txtID.getText()), txtRef.getText(), Integer.valueOf(txtQuantity.getText()));
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Well Done");
			alert.setContentText("Quantity Updated");
			alert.showAndWait();
		}
		catch (Exception e){
			
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
			
		}
		
		
	}

}
