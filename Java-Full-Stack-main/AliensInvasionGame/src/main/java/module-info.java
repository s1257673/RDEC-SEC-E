module com.example.aliensinvasiongame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.aliensinvasiongame to javafx.fxml;
    exports com.example.aliensinvasiongame;
}