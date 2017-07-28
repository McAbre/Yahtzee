/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author andjoe0304
 */
public class Client {
    private String host;
    private int port;
    
    public Client(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    public String getHost(){
        return host;
    }
}
