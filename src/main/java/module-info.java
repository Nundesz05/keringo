module com.example.keringo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keringo to javafx.fxml;
    exports com.example.keringo;
}