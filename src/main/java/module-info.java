module app.tree {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens app.tree to javafx.fxml;
    exports app.tree;
}