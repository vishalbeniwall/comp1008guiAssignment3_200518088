module com.example.ben11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ben11 to javafx.fxml;
    exports com.example.ben11;
}