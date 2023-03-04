module ma.enset.full_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ma.enset.full_javafx to javafx.fxml;
    opens ma.enset.full_javafx.controller to javafx.fxml;
    opens ma.enset.full_javafx.entities to javafx.base;
    exports ma.enset.full_javafx;
}