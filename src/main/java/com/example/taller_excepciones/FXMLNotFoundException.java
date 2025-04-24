package com.example.taller_excepciones;

public class FXMLNotFoundException extends Exception{
    FXMLNotFoundException(){
        super();
    }

    FXMLNotFoundException(String msg){
        super(msg);
    }

    FXMLNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }

    FXMLNotFoundException(Throwable cause){
        super(cause);
    }
}
