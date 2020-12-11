module main {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.media;
    exports mainCV to javafx.graphics;
    exports controller to javafx.graphics;
    opens mainCV to javafx.fxml;
    opens controller to javafx.fxml;
}