/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author andjoe0304
 */
public class FXMLChatController implements Initializable{

    @FXML
    TextArea chatTextArea;
    
    @FXML
    ChoiceBox choiceBox;
    
    @FXML
    ListView chatUsersList;
    
    private ObservableList<String> chatUsers;
    
    private Stage stage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chatUsers = FXCollections.observableArrayList();
        chatUsersList.setItems(chatUsers);
    }
    
    public static void closeStage() {
        
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
}
