package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DeleteProductController {
	
	@FXML
	private TextField txtID;
	@FXML
	private TextField txtRef;
	
	
	public void DeleteProduct(ActionEvent event) {
		
		try {
			Alert alert0 = new Alert(AlertType.WARNING);
			alert0.setTitle("Warning");
			alert0.setHeaderText("Warning!");
			alert0.setContentText("Are you sure you want to Delete this Product");
			alert0.showAndWait();
			Functions.DeleteProduct(Integer.valueOf(txtID.getText()), txtRef.getText());
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Well Done");
			alert.setContentText("Product Deleted");
			alert.showAndWait();
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		
	}

}
