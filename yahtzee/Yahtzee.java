/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import chat.FXMLChatController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author andjoe0304
 */
public class Yahtzee extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        Model model = new Model();
        
        stage.setScene(scene);
        stage.show();
        
        
        stage.setOnCloseRequest((new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent arg0) {
                                arg0.consume();
                try
                {
                    FXMLChatController.closeStage();
                }
                catch(Exception ex)
                {
                    System.out.print(ex.getMessage()+"\r\n");
                }

            }
        }));
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
