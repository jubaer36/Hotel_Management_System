module org.example.hotel_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.hotel_management_system to javafx.fxml;
    exports org.example.hotel_management_system;
}