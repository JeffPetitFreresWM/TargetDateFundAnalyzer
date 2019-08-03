package WebScraper;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import static WebScraper.Constants.*;
import static WebScraper.Constants.JPMORGAN_2060;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> dropdown;

    @FXML
    private Button analyzeButton;

    @FXML
    private LineChart<Number, Number> lineGraph;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private VBox heading2020;

    @FXML
    private Text info2020;

    @FXML
    private VBox heading2030;

    @FXML
    private Text Title;

    @FXML
    private Text info2030;

    @FXML
    private VBox heading2040;

    @FXML
    private Text info2040;

    @FXML
    private VBox heading2050;

    @FXML
    private Text info2050;

    @FXML
    private VBox heading2060;

    @FXML
    private Text info2060;

    @FXML
    private ProgressIndicator progressbar;


    private Calculator calc;
    private HashMap<String,Double> benchmarkInfo;
    private HashMap<String,Float> indexInfo1Yr;
    private HashMap<String,Float> indexInfoYTD;
    private String chosenFund;

    @FXML
    void analyze(ActionEvent event) {
        progressbar.setVisible(true);
        progressbar.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
        calc = new Calculator(dropdown.getValue());

        Task<Void> task = new Task<Void>(){
            @Override
            public  Void call(){
                calc.runCalc();
                benchmarkInfo = calc.calculateWeightedIndex();
                indexInfo1Yr= calc.getIndexInfo1Yr();
                indexInfoYTD = calc.getIndexInfoYTD();
                return null;
            }

        };
        task.setOnSucceeded(e ->{


            setAllText();
            progressbar.setVisible(false);
            populateGraph();


        });

        new Thread(task).start();

    }


    @FXML
    void initialize() {

        progressbar.setVisible(false);
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        Fundslist
                );
        dropdown.getItems().addAll(options);
        xAxis.setAutoRanging(false);
        yAxis.setAutoRanging(false);
        xAxis.setLowerBound(2015);
        xAxis.setUpperBound(2065);
        xAxis.setTickUnit(10);
        yAxis.setUpperBound(20);
        yAxis.setLowerBound(0);
        yAxis.setTickUnit(1);


    }

    void setAllText(){
        switch (dropdown.getValue()) {
            case "American Century":

                Title.setText("American Century Performance Analysis");
                info2020.setText("One Year: " + indexInfo1Yr.get(AMERICAN_CENTURY_2020) +
                        "\nYear To Date: " + indexInfoYTD.get(AMERICAN_CENTURY_2020) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("American2020Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("American2020BenchYtd") * 100.0) / 100.0);

                info2030.setText("One Year: " + indexInfo1Yr.get(AMERICAN_CENTURY_2030) +
                        "\nYear To Date: " + indexInfoYTD.get(AMERICAN_CENTURY_2030) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("American2030Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("American2030BenchYtd") * 100.0) / 100.0);

                info2040.setText("One Year: " + indexInfo1Yr.get(AMERICAN_CENTURY_2040) +
                        "\nYear To Date: " + indexInfoYTD.get(AMERICAN_CENTURY_2040) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("American2040Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("American2040BenchYtd") * 100.0) / 100.0);

                info2050.setText("Year One Year: " + indexInfo1Yr.get(AMERICAN_CENTURY_2050) +
                        "\nYear To Date: " + indexInfoYTD.get(AMERICAN_CENTURY_2050) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("American2050Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("American2050BenchYtd") * 100) / 100.0);

                info2060.setText("One Year: " + indexInfo1Yr.get(AMERICAN_CENTURY_2060) +
                        "\nYear To Date: " + indexInfoYTD.get(AMERICAN_CENTURY_2060) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("American2060Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("American2060BenchYtd") * 100.0) / 100.0);
                break;

            case "Vanguard":
                Title.setText("Vanguard Performance Analysis");
                info2020.setText("One Year: " + indexInfo1Yr.get(VANGUARD_2020) +
                        "\nYear To Date: " + indexInfoYTD.get(VANGUARD_2020) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("Vanguard2020Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("Vanguard2020BenchYtd") * 100.0) / 100.0);

                info2030.setText("One Year: " + indexInfo1Yr.get(VANGUARD_2030) +
                        "\nYear To Date: " + indexInfoYTD.get(VANGUARD_2030) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("Vanguard2030Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("Vanguard2030BenchYtd") * 100.0) / 100.0);

                info2040.setText("One Year: " + indexInfo1Yr.get(VANGUARD_2040) +
                        "\nYear To Date: " + indexInfoYTD.get(VANGUARD_2040) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("Vanguard2040Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("Vanguard2040BenchYtd") * 100.0) / 100.0);

                info2050.setText("Year One Year: " + indexInfo1Yr.get(VANGUARD_2050) +
                        "\nYear To Date: " + indexInfoYTD.get(VANGUARD_2050) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("Vanguard2050Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("Vanguard2050BenchYtd") * 100) / 100.0);

                info2060.setText("One Year: " + indexInfo1Yr.get(VANGUARD_2060) +
                        "\nYear To Date: " + indexInfoYTD.get(VANGUARD_2060) +
                        "\nBenchmark One Year: " + Math.round(benchmarkInfo.get("Vanguard2060Bench1Yr") * 100.0) / 100.0 +
                        "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get("Vanguard2060BenchYtd") * 100.0) / 100.0);
                break;


        }

    }

    void populateGraph(){
        XYChart.Series<Number, Number> benchmarkYtd = new XYChart.Series<>();
        switch (dropdown.getValue()){
            case "American Century":

                benchmarkYtd.setName("Benchmark YTD");
                benchmarkYtd.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("American2020BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("American2030BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("American2040BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("American2050BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("American2060BenchYtd")));

                lineGraph.getData().add(benchmarkYtd);

                XYChart.Series<Number, Number> benchmark1Yr = new XYChart.Series<>();
                benchmark1Yr.setName("Benchmark 1Yr");
                benchmark1Yr.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("American2020Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("American2030Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("American2040Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("American2050Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("American2060Bench1Yr")));
                lineGraph.getData().add(benchmark1Yr);

                XYChart.Series<Number, Number> fundYtd = new XYChart.Series<>();
                fundYtd.setName("Fund Ytd");
                fundYtd.getData().add(new XYChart.Data<>(2020, indexInfoYTD.get(AMERICAN_CENTURY_2020)));
                fundYtd.getData().add(new XYChart.Data<>(2030, indexInfoYTD.get(AMERICAN_CENTURY_2030)));
                fundYtd.getData().add(new XYChart.Data<>(2040, indexInfoYTD.get(AMERICAN_CENTURY_2040)));
                fundYtd.getData().add(new XYChart.Data<>(2050, indexInfoYTD.get(AMERICAN_CENTURY_2050)));
                fundYtd.getData().add(new XYChart.Data<>(2060, indexInfoYTD.get(AMERICAN_CENTURY_2060)));
                lineGraph.getData().add(fundYtd);

                XYChart.Series<Number, Number> fund1Yr = new XYChart.Series<>();
                fund1Yr.setName("Fund 1Yr");
                fund1Yr.getData().add(new XYChart.Data<>(2020, indexInfo1Yr.get(AMERICAN_CENTURY_2020)));
                fund1Yr.getData().add(new XYChart.Data<>(2030, indexInfo1Yr.get(AMERICAN_CENTURY_2030)));
                fund1Yr.getData().add(new XYChart.Data<>(2040, indexInfo1Yr.get(AMERICAN_CENTURY_2040)));
                fund1Yr.getData().add(new XYChart.Data<>(2050, indexInfo1Yr.get(AMERICAN_CENTURY_2050)));
                fund1Yr.getData().add(new XYChart.Data<>(2060, indexInfo1Yr.get(AMERICAN_CENTURY_2060)));
                lineGraph.getData().add(fund1Yr);

                break;

            case "Vanguard":
                benchmarkYtd = new XYChart.Series<>();
                benchmarkYtd.setName("Benchmark YTD");
                benchmarkYtd.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("Vanguard2020BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("Vanguard2030BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("Vanguard2040BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("Vanguard2050BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("Vanguard2060BenchYtd")));
                lineGraph.getData().add(benchmarkYtd);

                benchmark1Yr = new XYChart.Series<>();
                benchmark1Yr.setName("Benchmark 1Yr");
                benchmark1Yr.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("Vanguard2020Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("Vanguard2030Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("Vanguard2040Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("Vanguard2050Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("Vanguard2060Bench1Yr")));
                lineGraph.getData().add(benchmark1Yr);

                fundYtd = new XYChart.Series<>();
                fundYtd.setName("Fund Ytd");
                fundYtd.getData().add(new XYChart.Data<>(2020, indexInfoYTD.get(VANGUARD_2020)));
                fundYtd.getData().add(new XYChart.Data<>(2030, indexInfoYTD.get(VANGUARD_2030)));
                fundYtd.getData().add(new XYChart.Data<>(2040, indexInfoYTD.get(VANGUARD_2040)));
                fundYtd.getData().add(new XYChart.Data<>(2050, indexInfoYTD.get(VANGUARD_2050)));
                fundYtd.getData().add(new XYChart.Data<>(2060, indexInfoYTD.get(VANGUARD_2060)));
                lineGraph.getData().add(fundYtd);

                fund1Yr = new XYChart.Series<>();
                fund1Yr.setName("Fund 1Yr");
                fund1Yr.getData().add(new XYChart.Data<>(2020, indexInfo1Yr.get(VANGUARD_2020)));
                fund1Yr.getData().add(new XYChart.Data<>(2030, indexInfo1Yr.get(VANGUARD_2030)));
                fund1Yr.getData().add(new XYChart.Data<>(2040, indexInfo1Yr.get(VANGUARD_2040)));
                fund1Yr.getData().add(new XYChart.Data<>(2050, indexInfo1Yr.get(VANGUARD_2050)));
                fund1Yr.getData().add(new XYChart.Data<>(2060, indexInfo1Yr.get(VANGUARD_2060)));
                lineGraph.getData().add(fund1Yr);
                break;

            case "JP Morgan":
                benchmarkYtd = new XYChart.Series<>();
                benchmarkYtd.setName("Benchmark YTD");
                benchmarkYtd.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("JPMorgan2020BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("JPMorgan2030BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("JPMorgan2040BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("JPMorgan2050BenchYtd")));
                benchmarkYtd.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("JPMorgan2060BenchYtd")));
                lineGraph.getData().add(benchmarkYtd);

                benchmark1Yr = new XYChart.Series<>();
                benchmark1Yr.setName("Benchmark 1Yr");
                benchmark1Yr.getData().add(new XYChart.Data<>(2020, benchmarkInfo.get("JPMorgan2020Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2030, benchmarkInfo.get("JPMorgan2030Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2040, benchmarkInfo.get("JPMorgan2040Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2050, benchmarkInfo.get("JPMorgan2050Bench1Yr")));
                benchmark1Yr.getData().add(new XYChart.Data<>(2060, benchmarkInfo.get("JPMorgan2060Bench1Yr")));
                lineGraph.getData().add(benchmark1Yr);

                fundYtd = new XYChart.Series<>();
                fundYtd.setName("Fund Ytd");
                fundYtd.getData().add(new XYChart.Data<>(2020, indexInfoYTD.get(JPMORGAN_2020)));
                fundYtd.getData().add(new XYChart.Data<>(2030, indexInfoYTD.get(JPMORGAN_2030)));
                fundYtd.getData().add(new XYChart.Data<>(2040, indexInfoYTD.get(JPMORGAN_2040)));
                fundYtd.getData().add(new XYChart.Data<>(2050, indexInfoYTD.get(JPMORGAN_2050)));
                fundYtd.getData().add(new XYChart.Data<>(2060, indexInfoYTD.get(JPMORGAN_2060)));
                lineGraph.getData().add(fundYtd);

                fund1Yr = new XYChart.Series<>();
                fund1Yr.setName("Fund 1Yr");
                fund1Yr.getData().add(new XYChart.Data<>(2020, indexInfo1Yr.get(JPMORGAN_2020)));
                fund1Yr.getData().add(new XYChart.Data<>(2030, indexInfo1Yr.get(JPMORGAN_2030)));
                fund1Yr.getData().add(new XYChart.Data<>(2040, indexInfo1Yr.get(JPMORGAN_2040)));
                fund1Yr.getData().add(new XYChart.Data<>(2050, indexInfo1Yr.get(JPMORGAN_2050)));
                fund1Yr.getData().add(new XYChart.Data<>(2060, indexInfo1Yr.get(JPMORGAN_2060)));
                lineGraph.getData().add(fund1Yr);
        }


    }
}
