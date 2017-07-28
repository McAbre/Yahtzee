/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andjoe0304
 */
public class Server {
    
    private String ipAddress;
    
    public Server(int port){
        try {
            this.ipAddress = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        startServer();
    }
    
    private void startServer(){
        
    }
    
}
