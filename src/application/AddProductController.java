package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert.AlertType;

public class AddProductController {
	@FXML
	private TextField txtID;
	@FXML
	private TextField txtRef;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtEntreDate;
	@FXML
	private TextField txtExpDate;
	@FXML
	private TextField txtQuantity;
	@FXML
	private AnchorPane AddProduct;
	public static int ID=0;
	public void AddProduct(ActionEvent event) {
		
		
		try {
			
			Functions.AddProduct(ID, txtRef.getText(), txtName.getText(), txtEntreDate.getText(), txtExpDate.getText(), Integer.valueOf(txtQuantity.getText()));
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Well Done");
			alert.setContentText("Product Added");
			alert.showAndWait();
			AddProduct.setVisible(false);
			
		
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}

		
	}
	public void initialize() {
		int count=0;
		Connection conn =Functions.dbConnect("jdbc:sqlserver://127.0.0.1;databaseName=StockManagement", "sa", "SabrineBaam");
		Statement stmt;
		try {
			stmt = conn.createStatement();
			  String query = "select count(*) from Products";
		      //Executing the query
		      ResultSet rs = stmt.executeQuery(query);
		      //Retrieving the result
		      rs.next();
		      count = rs.getInt(1);
		      
		} catch (SQLException e1) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e1.getMessage());
			alert.showAndWait();
		}
		ID=count+1;
        txtID.setText(Integer.toString(ID));

    }

}

