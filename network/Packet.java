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
public class Packet {
    private String sender;
    private String gameName;
    private String message;
    
    private final int type;
    
    /*
    message = type,sender,gameName,message
    */
    
    public Packet(String message){
        this.message = message;
        
        type = getType(message);
    }
    
    private int getType(String message){
        int type = Integer.parseInt(message.charAt(0)+"");
        return type;
    }
    
    
}
