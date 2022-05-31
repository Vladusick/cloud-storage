module ru.samoshchenko.cloud.storage.cloudapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samoshchenko.cloud.storage.cloudapplication to javafx.fxml;
    exports ru.samoshchenko.cloud.storage.cloudapplication;
}