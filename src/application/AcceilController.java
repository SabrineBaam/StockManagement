package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AcceilController {
	
	
	public void AddProduct(ActionEvent event) {
		
		 Stage AddProductstage = new Stage();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("AddProduct.fxml"));
			
			Scene AddProduct = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			AddProductstage.setScene(AddProduct);
			AddProductstage.show();
			AddProductstage.setTitle("Add Product");        
		    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		    AddProductstage.setX((primScreenBounds.getWidth() - AddProductstage.getWidth()) / 2);
		    AddProductstage.setY((primScreenBounds.getHeight() - AddProductstage.getHeight()) / 2);
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
       
		
	}
	
	public void UpdateProduct(ActionEvent event) {
		
		 Stage UpdateProductStage = new Stage();
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("UpdateProduct.fxml"));
				
				Scene UpdateProduct = new Scene(root);
				//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				UpdateProductStage.setScene(UpdateProduct);
				UpdateProductStage.show();
				UpdateProductStage.setTitle("Update Product");        
			    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
			    UpdateProductStage.setX((primScreenBounds.getWidth() - UpdateProductStage.getWidth()) / 2);
			    UpdateProductStage.setY((primScreenBounds.getHeight() - UpdateProductStage.getHeight()) / 2);
			} catch (IOException e) {
				e.printStackTrace();
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Attention");
				alert.setHeaderText("erreur");
				alert.setContentText(e.getMessage());
				alert.showAndWait();
			}
	       
		
	}
	
	public void DeleteProduct(ActionEvent event) {
		
		Stage DeleteProductStage = new Stage();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteProduct.fxml"));
			
			Scene DeleteProduct = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			DeleteProductStage.setScene(DeleteProduct);
			DeleteProductStage.show();
			DeleteProductStage.setTitle("Delete Product");        
		    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		    DeleteProductStage.setX((primScreenBounds.getWidth() - DeleteProductStage.getWidth()) / 2);
		    DeleteProductStage.setY((primScreenBounds.getHeight() - DeleteProductStage.getHeight()) / 2);
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		
	}
	public void SearchProduct(ActionEvent event) {
		
		Stage ProductListStage = new Stage();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SearchProduct.fxml"));
			
			Scene SearchProduct = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ProductListStage.setScene(SearchProduct);
			ProductListStage.show();
			ProductListStage.setTitle("Searching");        
		    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		    ProductListStage.setX((primScreenBounds.getWidth() - ProductListStage.getWidth()) / 2);
		    ProductListStage.setY((primScreenBounds.getHeight() - ProductListStage.getHeight()) / 2);
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		
	}
	public void ProductList(ActionEvent event) {
		
		Stage ProductListStage = new Stage();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ProductList.fxml"));
			
			Scene ProductList = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ProductListStage.setScene(ProductList);
			ProductListStage.show();
			ProductListStage.setTitle("Product List");        
		    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		    ProductListStage.setX((primScreenBounds.getWidth() - ProductListStage.getWidth()) / 2);
		    ProductListStage.setY((primScreenBounds.getHeight() - ProductListStage.getHeight()) / 2);
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		
	}

}
