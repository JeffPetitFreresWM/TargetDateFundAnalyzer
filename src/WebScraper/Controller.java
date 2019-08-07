package WebScraper;

import java.awt.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.beans.binding.ObjectExpression;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
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
import javafx.scene.control.Label;


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
        lineGraph.getData().clear();
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
            for (String key : benchmarkInfo.keySet()){
                System.out.println(key);
            }

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

    private void labelAdder(double yvalue, double compyvalue, XYChart.Data<Number,Number> data){

            Text label = new Text(String.format("%.2g%n",(yvalue-compyvalue)));
            label.setTranslateY(label.getLayoutBounds().getHeight()/-1);
            data.setNode(label);


    }


    void populateGraph(){
        XYChart.Series<Number, Number> benchmarkYtd = new XYChart.Series<>();
        benchmarkYtd.setName("Benchmark YTD");
        XYChart.Series<Number, Number> fundYtd = new XYChart.Series<>();
        fundYtd.setName("Fund Ytd");
        XYChart.Series<Number, Number> benchmark1Yr = new XYChart.Series<>();
        benchmark1Yr.setName("Benchmark 1Yr");
        XYChart.Series<Number, Number> fund1Yr = new XYChart.Series<>();
        fund1Yr.setName("Fund 1Yr");
        ArrayList<Double> ytd;
        ArrayList<Double> yr;
        ArrayList<Float> indexytd;
        ArrayList<Float> index1yr;
        switch (dropdown.getValue()){
            case "American Century":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(AMERICAN_CENTURY_2020));
                indexytd.add(indexInfoYTD.get(AMERICAN_CENTURY_2030));
                indexytd.add(indexInfoYTD.get(AMERICAN_CENTURY_2040));
                indexytd.add(indexInfoYTD.get(AMERICAN_CENTURY_2050));
                indexytd.add(indexInfoYTD.get(AMERICAN_CENTURY_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(AMERICAN_CENTURY_2020));
                index1yr.add(indexInfo1Yr.get(AMERICAN_CENTURY_2030));
                index1yr.add(indexInfo1Yr.get(AMERICAN_CENTURY_2040));
                index1yr.add(indexInfo1Yr.get(AMERICAN_CENTURY_2050));
                index1yr.add(indexInfo1Yr.get(AMERICAN_CENTURY_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }

                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);


                break;

            case "Vanguard":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(VANGUARD_2020));
                indexytd.add(indexInfoYTD.get(VANGUARD_2030));
                indexytd.add(indexInfoYTD.get(VANGUARD_2040));
                indexytd.add(indexInfoYTD.get(VANGUARD_2050));
                indexytd.add(indexInfoYTD.get(VANGUARD_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(VANGUARD_2020));
                index1yr.add(indexInfo1Yr.get(VANGUARD_2030));
                index1yr.add(indexInfo1Yr.get(VANGUARD_2040));
                index1yr.add(indexInfo1Yr.get(VANGUARD_2050));
                index1yr.add(indexInfo1Yr.get(VANGUARD_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);

                break;

            case "JP Morgan":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(JPMORGAN_2020));
                indexytd.add(indexInfoYTD.get(JPMORGAN_2030));
                indexytd.add(indexInfoYTD.get(JPMORGAN_2040));
                indexytd.add(indexInfoYTD.get(JPMORGAN_2050));
                indexytd.add(indexInfoYTD.get(JPMORGAN_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(JPMORGAN_2020));
                index1yr.add(indexInfo1Yr.get(JPMORGAN_2030));
                index1yr.add(indexInfo1Yr.get(JPMORGAN_2040));
                index1yr.add(indexInfo1Yr.get(JPMORGAN_2050));
                index1yr.add(indexInfo1Yr.get(JPMORGAN_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);

            case "BlackRock":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(BLACKROCK_2020));
                indexytd.add(indexInfoYTD.get(BLACKROCK_2030));
                indexytd.add(indexInfoYTD.get(BLACKROCK_2040));
                indexytd.add(indexInfoYTD.get(BLACKROCK_2050));
                indexytd.add(indexInfoYTD.get(BLACKROCK_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(BLACKROCK_2020));
                index1yr.add(indexInfo1Yr.get(BLACKROCK_2030));
                index1yr.add(indexInfo1Yr.get(BLACKROCK_2040));
                index1yr.add(indexInfo1Yr.get(BLACKROCK_2050));
                index1yr.add(indexInfo1Yr.get(BLACKROCK_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);

            case "TRowe Price":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(TROWE_2020));
                indexytd.add(indexInfoYTD.get(TROWE_2030));
                indexytd.add(indexInfoYTD.get(TROWE_2040));
                indexytd.add(indexInfoYTD.get(TROWE_2050));
                indexytd.add(indexInfoYTD.get(TROWE_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(TROWE_2020));
                index1yr.add(indexInfo1Yr.get(TROWE_2030));
                index1yr.add(indexInfo1Yr.get(TROWE_2040));
                index1yr.add(indexInfo1Yr.get(TROWE_2050));
                index1yr.add(indexInfo1Yr.get(TROWE_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);


            case "PIMCO":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(PIMCO_2020));
                indexytd.add(indexInfoYTD.get(PIMCO_2030));
                indexytd.add(indexInfoYTD.get(PIMCO_2040));
                indexytd.add(indexInfoYTD.get(PIMCO_2050));

                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(PIMCO_2020));
                index1yr.add(indexInfo1Yr.get(PIMCO_2030));
                index1yr.add(indexInfo1Yr.get(PIMCO_2040));
                index1yr.add(indexInfo1Yr.get(PIMCO_2050));


                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);

            case "Allianz":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(ALLIANZGI_2020));
                indexytd.add(indexInfoYTD.get(ALLIANZGI_2030));
                indexytd.add(indexInfoYTD.get(ALLIANZGI_2040));
                indexytd.add(indexInfoYTD.get(ALLIANZGI_2050));

                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(ALLIANZGI_2020));
                index1yr.add(indexInfo1Yr.get(ALLIANZGI_2030));
                index1yr.add(indexInfo1Yr.get(ALLIANZGI_2040));
                index1yr.add(indexInfo1Yr.get(ALLIANZGI_2050));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);


            case "MFS":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(MFS_2020));
                indexytd.add(indexInfoYTD.get(MFS_2030));
                indexytd.add(indexInfoYTD.get(MFS_2040));
                indexytd.add(indexInfoYTD.get(MFS_2050));
                indexytd.add(indexInfoYTD.get(MFS_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(MFS_2020));
                index1yr.add(indexInfo1Yr.get(MFS_2030));
                index1yr.add(indexInfo1Yr.get(MFS_2040));
                index1yr.add(indexInfo1Yr.get(MFS_2050));
                index1yr.add(indexInfo1Yr.get(MFS_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);



            case "TIAA":
                ytd = calc.getBenchmarklistytd();
                yr = calc.getBenchmarklist1yr();
                indexytd = new ArrayList<>();
                indexytd.add(indexInfoYTD.get(TIAA_2020));
                indexytd.add(indexInfoYTD.get(TIAA_2030));
                indexytd.add(indexInfoYTD.get(TIAA_2040));
                indexytd.add(indexInfoYTD.get(TIAA_2050));
                indexytd.add(indexInfoYTD.get(TIAA_2060));
                index1yr = new ArrayList<>();
                index1yr.add(indexInfo1Yr.get(TIAA_2020));
                index1yr.add(indexInfo1Yr.get(TIAA_2030));
                index1yr.add(indexInfo1Yr.get(TIAA_2040));
                index1yr.add(indexInfo1Yr.get(TIAA_2050));
                index1yr.add(indexInfo1Yr.get(TIAA_2060));

                for (int xvalue = 2020, counter = 0;  xvalue <= 2060; counter++,xvalue+=10){
                    XYChart.Data<Number,Number> benchmarkytd = new XYChart.Data<Number,Number>(xvalue,ytd.get(counter));
                    XYChart.Data<Number,Number> fundytd = new XYChart.Data<>(xvalue,indexytd.get(counter));
                    if (indexytd.get(counter) > ytd.get(counter)){
                        labelAdder(indexytd.get(counter),ytd.get(counter),fundytd);
                    }
                    else{
                        labelAdder(indexytd.get(counter),ytd.get(counter),benchmarkytd);
                    }
                    benchmarkYtd.getData().add(benchmarkytd);
                    fundYtd.getData().add(fundytd);


                    XYChart.Data<Number,Number> benchmark1yr = new XYChart.Data<>(xvalue,yr.get(counter));
                    XYChart.Data<Number,Number> fund1yr = new XYChart.Data<>(xvalue,index1yr.get(counter));
                    if (index1yr.get(counter) > yr.get(counter)){
                        labelAdder(index1yr.get(counter),yr.get(counter),fund1yr);
                    }
                    else{
                        labelAdder(index1yr.get(counter),yr.get(counter),benchmark1yr);
                    }
                    benchmark1Yr.getData().add(benchmark1yr);
                    fund1Yr.getData().add(fund1yr);

                }
                lineGraph.getData().add(benchmarkYtd);
                lineGraph.getData().add(fundYtd);
                lineGraph.getData().add(benchmark1Yr);
                lineGraph.getData().add(fund1Yr);





        }


    }
}
