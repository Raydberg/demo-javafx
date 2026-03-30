module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;
    requires org.controlsfx.controls;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.auth;
    opens com.example.demo.auth to javafx.fxml;
}