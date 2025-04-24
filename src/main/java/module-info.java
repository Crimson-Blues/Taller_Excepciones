module com.example.taller_excepciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taller_excepciones to javafx.fxml;
    exports com.example.taller_excepciones;
}