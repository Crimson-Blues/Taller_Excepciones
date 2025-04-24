package com.example.taller_excepciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Creadores:
//Juan Diego Cardenas M 2416437
//Liseth Natalia Rivera  2223510
//Juan David Lopez 2243077
public class TestDivision extends Application {
    //Metodo original
    /*
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("Resultado: " + (a / b));
    }
//1.a Al ejecutar el código se lanza una excepción de tipo java.lang.ArithmeticException con mensaje " / by zero"
//1.b La consola muestra el tipo de error, junto con su mensaje y el metodo y linea en el que ocurre:
//"Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.example.taller_excepciones/com.example.taller_excepciones.TestDivision.main(TestDivision.java:7)"


*/
    //2. Metodo mejorado con try-catch
    /*
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se puede dividir entre cero :(");
        }

    }
    */

    //3. Solicitar dos numeros y capturar dos excepciones
    /*
    public static int Division() throws ArithmeticException, InputMismatchException{
        try{
            int a = (new Scanner(System.in).nextInt());
            int b = (new Scanner(System.in).nextInt());
            return a/b;
        }catch(InputMismatchException IMe){
            System.out.println("Sólo se permite ingresar numeros");
        }catch(ArithmeticException Ae){
            System.out.println("Error: " + Ae.getMessage());
            System.out.println("No le sabes a la división :c");
        }

        return -1;

    }

    public static void main(String[] args){
        System.out.println(Division());
    }

     */

    //4. Adición de bloque finally
    public static int Division() throws ArithmeticException, InputMismatchException{
        try{
            int a = (new Scanner(System.in).nextInt());
            int b = (new Scanner(System.in).nextInt());
            return a/b;
        }catch(InputMismatchException IMe){
            System.out.println("Sólo se permite ingresar numeros");
        }catch(ArithmeticException Ae){
            System.out.println("Error: " + Ae.getMessage());
            System.out.println("No le sabes a la división :c");
        }finally {
            System.out.println("Operación finalizada");
        }

        return 0;

    }
    //5. Creacion e implementacion de error propio
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


