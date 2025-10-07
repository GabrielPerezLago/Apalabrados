module com.gabriel.apalabrados.apalabrados {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens com.gabriel.apalabrados.apalabrados to javafx.fxml;
    exports com.gabriel.apalabrados;
}