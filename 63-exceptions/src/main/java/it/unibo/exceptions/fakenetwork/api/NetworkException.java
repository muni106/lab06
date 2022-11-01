package it.unibo.exceptions.fakenetwork.api;

import java.io.IOException;

public class NetworkException extends IOException{

    /**
     * create an Exception whose message is "Network error: no response".
     */
    public NetworkException(){
        super("Network error: no response");
    }

    /**
     * create a message "Network error while sending message: <message>"
     */
    public NetworkException(final String message){
        super("Network error while sending message: " + message);
    }

}
