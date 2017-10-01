package protocol;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Max
 */
public class Message implements Serializable{

    private String message;
    private int type;
    private Object object;
    
    //message types
    public static final int MESSAGE = 1; 
    public static final int TURN = 2; 
    public static final int PLAY = 3; 
    public static final int RULES = 4;
    public static final int EXIT = 5;
    public static final int CARDS = 6;
    public static final int REMATCH = 7;
    
    public Message(String message, int type, Object object) {
        this.message = message;
        this.type = type;
        this.object = object;
    }
    
    public String getMessage() {
        return message;
    }
    
    public int getType() {
        return type;
    }
    
    public Object getObject() {
        return object;
    }
}