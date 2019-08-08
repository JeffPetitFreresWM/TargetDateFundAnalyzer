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

    private HashMap<Integer,Text> textmap = new HashMap<Integer,Text>();

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
        textmap.put(20,info2020);
        textmap.put(30,info2030);
        textmap.put(40,info2040);
        textmap.put(50,info2050);
        textmap.put(60,info2060);
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

    void populateText(String[] fundlist, String[] benchytd, String[] bench1yr){

        for (int i =20, j = 0; j < fundlist.length; j++,i+=10){

            textmap.get(i).setText("One Year: " + indexInfo1Yr.get(fundlist[j]) +
                    "\nYear To Date: " + indexInfoYTD.get(fundlist[j]) +
                    "\nBenchmark One Year: " + Math.round(benchmarkInfo.get(bench1yr[j]) * 100.0) / 100.0 +
                    "\nBenchmark Year To Date: " + Math.round(benchmarkInfo.get(benchytd[j]) * 100.0) / 100.0);
        }
    }

    void setAllText(){

        switch (dropdown.getValue()) {
            case "American Century":

                Title.setText("American Century Performance Analysis");
                populateText(AmericanList,AmericanBenchYtdList,AmericanBench1yrList);
                break;

            case "Vanguard":
                Title.setText("Vanguard Performance Analysis");
                populateText(VanguardList,VanguardYtdList,Vanguard1yrList);
                break;

            case "BlackRock":
                Title.setText("BlackRock Performance Analysis");
                populateText(BlackrockList,BlackRockYtdList,BlackRock1yrList);
                break;

            case "TRowe Price":
                Title.setText("TRowe Price Performance Analysis");
                populateText(TRoweList,TroweYtdList,TRowe1yrList);
                break;

            case "PIMCO":
                Title.setText("PIMCO Performance Analysis");
                populateText(PimcoList,PIMCOYtdList,PIMCO1yrList);
                break;

            case "TIAA":
                Title.setText("TIAA Performance Analysis");
                populateText(TIAAList,TIAAYtdList,TIAA1yrList);
                break;
            case "Allianz":
                Title.setText("Allianz Performance Analysis");
                populateText(AllianzList,AllianzYtdList,Allianz1yrList);
                break;
            case "JP Morgan":
                Title.setText("JP Morgan Performance Analysis");
                populateText(JpMorganList,JPMorganYtdList,JPMorgan1yrList);
                break;

            case "MFS":
                Title.setText("MFS Performance Analysis");
                populateText(MFSList,MFSYtdList,MFS1yrList);
                break;
        }

    }

    private void labelAdder(double yvalue, double compyvalue, XYChart.Data<Number,Number> data){

            Text label = new Text(String.format("%.2g%n",(yvalue-compyvalue)));
            label.setTranslateY(label.getLayoutBounds().getHeight()/-1);
            data.setNode(label);


    }

    private void populateData(XYChart.Series<Number, Number> benchmarkYtd,
                              XYChart.Series<Number, Number> fundYtd,
                              XYChart.Series<Number, Number> benchmark1Yr,
                              XYChart.Series<Number, Number> fund1Yr,
                              ArrayList<Double> ytd,
                              ArrayList<Double> yr,
                              ArrayList<Float> indexytd,
                              ArrayList<Float> index1yr,
                              String[] fundlist,
                              LineChart<Number, Number> lineGraph){
        ytd = calc.getBenchmarklistytd();
        yr = calc.getBenchmarklist1yr();
        listPopulate(ytd,yr,indexytd,index1yr,fundlist);
        for (int xvalue = 2020, counter = 0;  counter < fundlist.length; counter++,xvalue+=10){

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
    }

    private void listPopulate(ArrayList<Double> ytd,
            ArrayList<Double> yr,
            ArrayList<Float> indexytd,
            ArrayList<Float> index1yr,
                              String[] fundlist){

        for (String item : fundlist){
            indexytd.add(indexInfoYTD.get(item));
            index1yr.add(indexInfo1Yr.get(item));

        }

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
        ArrayList<Double> ytd = new ArrayList<>();
        ArrayList<Double> yr = new ArrayList<>();
        ArrayList<Float> indexytd = new ArrayList<>();
        ArrayList<Float> index1yr = new ArrayList<>();

        switch (dropdown.getValue()){
            case "American Century":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, AmericanList,lineGraph);

                break;

            case "Vanguard":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, VanguardList,lineGraph);

                break;

            case "JP Morgan":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, JpMorganList,lineGraph);

                break;

            case "BlackRock":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, BlackrockList,lineGraph);

                break;

            case "TRowe Price":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, TRoweList,lineGraph);

                break;


            case "PIMCO":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, PimcoList,lineGraph);

                break;

            case "Allianz":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, AllianzList,lineGraph);

                break;


            case "MFS":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, MFSList,lineGraph);

                break;



            case "TIAA":

                populateData(benchmarkYtd,fundYtd,benchmark1Yr,fund1Yr,ytd,yr,indexytd,index1yr, TIAAList,lineGraph);

                break;


        }


    }
}
