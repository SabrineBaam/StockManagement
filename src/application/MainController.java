package application;

import java.sql.Connection;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private TextField txtUser;
	@FXML
	private PasswordField txtPassw;
	@FXML
	private Pane Login;
	@FXML
	private Label Statu;
	@FXML
	private AnchorPane Loginroot;
	@FXML
	public Button BtnCanc;
	
	public void Login(ActionEvent event) {
		boolean b = true;
		Object [][] o=null;
		read_db d=null;
		

		Connection con =Functions.dbConnect("jdbc:sqlserver://127.0.0.1;databaseName=StockManagement", "sa","SabrineBaam");
		try {
			//if(!con.isClosed()) statu.setText("connected");
			
			d=new read_db(b, o);
			
			d=Functions.read_from_db(con, "SELECT * FROM  Users WHERE Nom = '"+txtUser.getText()+"' And Password = '"+txtPassw.getText()+"'", 2);
			for(int i=0;i< d.val.length;i++) {
				if(d.val[i][0].equals(txtUser.getText())&& d.val[i][1].equals(txtPassw.getText())) {
					try {
					
						Parent root = FXMLLoader.load(getClass().getResource("Acceil.fxml"));
				        Scene Acceuil = new Scene(root);
				        Stage Acceuilstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				        Acceuilstage.setTitle("Acceuil");
				       // Acceuilstage.hide(); //optional
				        Acceuilstage.setScene(Acceuil);
				        Acceuilstage.show();  
				        
				        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
				        Acceuilstage.setX((primScreenBounds.getWidth() - Acceuilstage.getWidth()) / 2);
				        Acceuilstage.setY((primScreenBounds.getHeight() - Acceuilstage.getHeight()) / 2);
				        
						
			       			
					} catch(Exception e) {
						e.printStackTrace();
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Attention");
						alert.setHeaderText("erreur");
						alert.setContentText(e.getMessage());
						alert.showAndWait();
					}
				}
				else  {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Information Dialog");
					alert.setHeaderText(null);
					alert.setContentText("Nom utilisateur ou Mot de passe incorrect");
					alert.showAndWait();
					
				}
				
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Attention");
			alert.setHeaderText("erreur");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		
		
	}
	@FXML
	public void Cancel(ActionEvent event) {
		Stage LoginSatge= (Stage) BtnCanc.getScene().getWindow();
	 	LoginSatge.close();
	}
	 	
}
