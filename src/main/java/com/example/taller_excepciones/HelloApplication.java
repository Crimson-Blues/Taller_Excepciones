package com.example.taller_excepciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//%
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
            if(HelloApplication.class.getResource("bonjour-viewh.fxml") == null){
                throw new FXMLNotFoundException("Revisa bien el nombre del FXML");
            }
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bonjour-viewh.fxml"));

        }catch (FXMLNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch();
    }
}