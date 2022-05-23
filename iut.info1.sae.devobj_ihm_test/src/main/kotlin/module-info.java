module projet.echecmartien {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens projet.echecmartien to javafx.fxml;
    exports projet.echecmartien;
}