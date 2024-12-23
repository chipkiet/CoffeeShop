module org.example.coffeshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.coffeshop to javafx.fxml;
    exports org.example.coffeshop;
}