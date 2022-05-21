module td5prem.ihm {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens items_randomizer to javafx.fxml;
    exports items_randomizer;
}