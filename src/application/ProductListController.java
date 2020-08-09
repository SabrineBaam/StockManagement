package application;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleStringProperty;

public class ProductListController {
	
	@SuppressWarnings("rawtypes")
	private ObservableList<ObservableList> data;
	
	
	@FXML
    private TableView tabView;
	

	
	public void initialize() {
		
		Functions.ProductList(tabView, data);
	}
	
	
	
       
        
	}


