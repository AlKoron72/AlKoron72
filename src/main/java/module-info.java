module com.example.fuckshit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.fuckshit to javafx.fxml;
    exports com.example.fuckshit;
}