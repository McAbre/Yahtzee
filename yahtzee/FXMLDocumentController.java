/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import chat.FXMLChatController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author andjoe0304
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private AnchorPane gamePane;
    
    @FXML
    private MenuBar menuBar;
    
    
    @FXML
    private void chatOpenAction(ActionEvent event) {
        System.out.println("Open chat");
        String chatName = " DEFAULT";
        
        
        //Parent root;
        FXMLLoader loader;
        try {
            //root = FXMLLoader.load(getClass().getResource("/chat/FXMLChat.fxml"));
            loader = new FXMLLoader(getClass().getResource("/chat/FXMLChat.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Chat " + chatName);
            Parent root = (Parent)loader.load();
            FXMLChatController c = (FXMLChatController)loader.getController();
            System.out.println("yahtzee.FXMLDocumentController.chatOpenAction() controller = " + c);
            c.setStage(stage);
            
            stage.setScene(new Scene(root, 450, 450));
            
            
            
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
