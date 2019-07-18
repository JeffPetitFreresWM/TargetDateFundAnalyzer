package WebScraper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ComboBox<?> dropdown;

    @FXML
    private Button analyzeButton;

    @FXML
    private LineChart<?, ?> lineGraph;

    @FXML
    private VBox info2020;

    @FXML
    private VBox info2030;

    @FXML
    private VBox info2040;

    @FXML
    private VBox info2050;

    @FXML
    private VBox info2060;

    @FXML
    void analyze(ActionEvent event) {

    }

}
