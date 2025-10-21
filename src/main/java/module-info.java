module com.gabriel.apalabrados.apalabrados_dos {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;
    requires javafx.graphics;
    requires java.desktop;
    requires java.logging;


    opens com.gabriel.apalabrados.apalabrados_dos to javafx.fxml;
    exports com.gabriel.apalabrados.apalabrados_dos;
}