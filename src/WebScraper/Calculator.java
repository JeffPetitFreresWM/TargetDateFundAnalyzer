package WebScraper;

import javafx.concurrent.Task;

import java.util.HashMap;

import static WebScraper.Constants.*;
import static WebScraper.Constants.BLACKROCK_2060;


public class Calculator {

    WebScraper scrape = new WebScraper();
    HashMap<String,Float> benchmarkInfo = new HashMap<>();
    HashMap<String,Float> indexInfoYTD = new HashMap<>();
    HashMap<String,Float> indexInfo1Yr = new HashMap<>();
    String fund;

    public Calculator(String fund){

        scrape.setDriver();
        this.fund = fund;

    }

    public HashMap<String,Double> calculateWeightedIndex(){
        HashMap<String,Double> mapOfWeightedBenchmarks = new HashMap<>();
        switch (this.fund){
            case "American Century":

                double American2020Ytd = weightBenchmarkYTD(AMERICANCENTURY2020BOND,AMERICANCENTURY2020EQUITY,AMERICANCENTURY2020CASH,AMERICANCENTURY2020INTL);
                double American20201Yr = weightBenchmark1Yr(AMERICANCENTURY2020BOND,AMERICANCENTURY2020EQUITY,AMERICANCENTURY2020CASH,AMERICANCENTURY2020INTL);
                double American2030Ytd = weightBenchmarkYTD(AMERICANCENTURY2030BOND,AMERICANCENTURY2030EQUITY,AMERICANCENTURY2030CASH,AMERICANCENTURY2030INTL);
                double American20301Yr = weightBenchmark1Yr(AMERICANCENTURY2030BOND,AMERICANCENTURY2030EQUITY,AMERICANCENTURY2030CASH,AMERICANCENTURY2030INTL);
                double American2040Ytd = weightBenchmarkYTD(AMERICANCENTURY2040BOND,AMERICANCENTURY2040EQUITY,AMERICANCENTURY2040CASH,AMERICANCENTURY2040INTL);
                double American20401Yr = weightBenchmark1Yr(AMERICANCENTURY2040BOND,AMERICANCENTURY2040EQUITY,AMERICANCENTURY2040CASH,AMERICANCENTURY2040INTL);
                double American2050Ytd = weightBenchmarkYTD(AMERICANCENTURY2050BOND,AMERICANCENTURY2050EQUITY,AMERICANCENTURY2050CASH,AMERICANCENTURY2050INTL);
                double American20501Yr = weightBenchmark1Yr(AMERICANCENTURY2050BOND,AMERICANCENTURY2050EQUITY,AMERICANCENTURY2050CASH,AMERICANCENTURY2050INTL);
                double American2060Ytd = weightBenchmarkYTD(AMERICANCENTURY2060BOND,AMERICANCENTURY2060EQUITY,AMERICANCENTURY2060CASH,AMERICANCENTURY2060INTL);
                double American20601Yr = weightBenchmark1Yr(AMERICANCENTURY2060BOND,AMERICANCENTURY2060EQUITY,AMERICANCENTURY2060CASH,AMERICANCENTURY2060INTL);

                mapOfWeightedBenchmarks.put("American2020BenchYtd",American2020Ytd);
                mapOfWeightedBenchmarks.put("American2030BenchYtd",American2030Ytd);
                mapOfWeightedBenchmarks.put("American2040BenchYtd",American2040Ytd);
                mapOfWeightedBenchmarks.put("American2050BenchYtd",American2050Ytd);
                mapOfWeightedBenchmarks.put("American2060BenchYtd",American2060Ytd);
                mapOfWeightedBenchmarks.put("American2020Bench1Yr",American20201Yr);
                mapOfWeightedBenchmarks.put("American2030Bench1Yr",American20301Yr);
                mapOfWeightedBenchmarks.put("American2040Bench1Yr",American20401Yr);
                mapOfWeightedBenchmarks.put("American2050Bench1Yr",American20501Yr);
                mapOfWeightedBenchmarks.put("American2060Bench1Yr",American20601Yr);

                return mapOfWeightedBenchmarks;

            case "BlackRock":
                double BlackRock2020Ytd = weightBenchmarkYTD(BLACKROCK2020BOND,BLACKROCK2020EQUITY,BLACKROCK2020CASH,BLACKROCK2020INTL);
                double BlackRock20201Yr = weightBenchmark1Yr(BLACKROCK2020BOND,BLACKROCK2020EQUITY,BLACKROCK2020CASH,BLACKROCK2020INTL);
                double BlackRock2030Ytd = weightBenchmarkYTD(BLACKROCK2030BOND,BLACKROCK2030EQUITY,BLACKROCK2030CASH,BLACKROCK2030INTL);
                double BlackRock20301Yr = weightBenchmark1Yr(BLACKROCK2030BOND,BLACKROCK2030EQUITY,BLACKROCK2030CASH,BLACKROCK2030INTL);
                double BlackRock2040Ytd = weightBenchmarkYTD(BLACKROCK2040BOND,BLACKROCK2040EQUITY,BLACKROCK2040CASH,BLACKROCK2040INTL);
                double BlackRock20401Yr = weightBenchmark1Yr(BLACKROCK2040BOND,BLACKROCK2040EQUITY,BLACKROCK2040CASH,BLACKROCK2040INTL);
                double BlackRock2050Ytd = weightBenchmarkYTD(BLACKROCK2050BOND,BLACKROCK2050EQUITY,BLACKROCK2050CASH,BLACKROCK2050INTL);
                double BlackRock20501Yr = weightBenchmark1Yr(BLACKROCK2050BOND,BLACKROCK2050EQUITY,BLACKROCK2050CASH,BLACKROCK2050INTL);
                double BlackRock2060Ytd = weightBenchmarkYTD(BLACKROCK2060BOND,BLACKROCK2060EQUITY,BLACKROCK2060CASH,BLACKROCK2060INTL);
                double BlackRock20601Yr = weightBenchmark1Yr(BLACKROCK2060BOND,BLACKROCK2060EQUITY,BLACKROCK2060CASH,BLACKROCK2060INTL);
                mapOfWeightedBenchmarks.put("BlackRock2020BenchYtd",BlackRock2020Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2030BenchYtd",BlackRock2030Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2040BenchYtd",BlackRock2040Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2050BenchYtd",BlackRock2050Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2060BenchYtd",BlackRock2060Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2020Bench1Yr",BlackRock20201Yr);
                mapOfWeightedBenchmarks.put("BlackRock2030Bench1Yr",BlackRock20301Yr);
                mapOfWeightedBenchmarks.put("BlackRock2040Bench1Yr",BlackRock20401Yr);
                mapOfWeightedBenchmarks.put("BlackRock2050Bench1Yr",BlackRock20501Yr);
                mapOfWeightedBenchmarks.put("BlackRock2060Bench1Yr",BlackRock20601Yr);

                return mapOfWeightedBenchmarks;

            case "Vanguard":
                double Vanguard2020Ytd = weightBenchmarkYTD(VANGUARD2020BOND,VANGUARD2020EQUITY,VANGUARD2020CASH,VANGUARD2020INTL);
                double Vanguard20201Yr = weightBenchmark1Yr(VANGUARD2020BOND,VANGUARD2020EQUITY,VANGUARD2020CASH,VANGUARD2020INTL);
                double Vanguard2030Ytd = weightBenchmarkYTD(VANGUARD2030BOND,VANGUARD2030EQUITY,VANGUARD2030CASH,VANGUARD2030INTL);
                double Vanguard20301Yr = weightBenchmark1Yr(VANGUARD2030BOND,VANGUARD2030EQUITY,VANGUARD2030CASH,VANGUARD2030INTL);
                double Vanguard2040Ytd = weightBenchmarkYTD(VANGUARD2040BOND,VANGUARD2040EQUITY,VANGUARD2040CASH,VANGUARD2040INTL);
                double Vanguard20401Yr = weightBenchmark1Yr(VANGUARD2040BOND,VANGUARD2040EQUITY,VANGUARD2040CASH,VANGUARD2040INTL);
                double Vanguard2050Ytd = weightBenchmarkYTD(VANGUARD2050BOND,VANGUARD2050EQUITY,VANGUARD2050CASH,VANGUARD2050INTL);
                double Vanguard20501Yr = weightBenchmark1Yr(VANGUARD2050BOND,VANGUARD2050EQUITY,VANGUARD2050CASH,VANGUARD2050INTL);
                double Vanguard2060Ytd = weightBenchmarkYTD(VANGUARD2060BOND,VANGUARD2060EQUITY,VANGUARD2060CASH,VANGUARD2060INTL);
                double Vanguard20601Yr = weightBenchmark1Yr(VANGUARD2060BOND,VANGUARD2060EQUITY,VANGUARD2060CASH,VANGUARD2060INTL);
                mapOfWeightedBenchmarks.put("Vanguard2020BenchYtd",Vanguard2020Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2030BenchYtd",Vanguard2030Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2040BenchYtd",Vanguard2040Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2050BenchYtd",Vanguard2050Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2060BenchYtd",Vanguard2060Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2020Bench1Yr",Vanguard20201Yr);
                mapOfWeightedBenchmarks.put("Vanguard2030Bench1Yr",Vanguard20301Yr);
                mapOfWeightedBenchmarks.put("Vanguard2040Bench1Yr",Vanguard20401Yr);
                mapOfWeightedBenchmarks.put("Vanguard2050Bench1Yr",Vanguard20501Yr);
                mapOfWeightedBenchmarks.put("Vanguard2060Bench1Yr",Vanguard20601Yr);

                return mapOfWeightedBenchmarks;

        }
        return null;
    }

    public double weightBenchmarkYTD(double bond,double equity,double cash , double intl){
        double sum =
        benchmarkInfo.get("benchmarkBondYtd") * bond + benchmarkInfo.get("benchmarkEquityYtd")*equity+
                benchmarkInfo.get("benchmarkCashYtd")*cash + benchmarkInfo.get("benchmarkIntlYtd") * intl;
        return sum;
    }

    public double weightBenchmark1Yr(double bond,double equity,double cash , double intl){
        double sum =
                benchmarkInfo.get("benchmarkBond1Yr") * bond + benchmarkInfo.get("benchmarkEquity1Yr") * equity +
                        benchmarkInfo.get("benchmarkCash1Yr")*cash + benchmarkInfo.get("benchmarkIntl1Yr") * intl;
        return sum;
    }

    public void setBenchmarkInfo(){
        new Thread(() -> {
            Float[] bond = scrape.getBenchmarkBond();
            benchmarkInfo.put("benchmarkBondYtd",bond[0]);
            benchmarkInfo.put("benchmarkBond1Yr",bond[1]);


        }).start();
        new Thread(() -> {
            Float[] equity = scrape.getBenchmarkEquity();
            benchmarkInfo.put("benchmarkEquityYtd",equity[0]);
            benchmarkInfo.put("benchmarkEquity1Yr",equity[1]);


        }).start();

        new Thread(() -> {
            Float[] cash = scrape.getBenchmarkCash();

            benchmarkInfo.put("benchmarkCashYtd",cash[0]);
            benchmarkInfo.put("benchmarkCash1Yr",cash[1]);


        }).start();
        new Thread(() -> {

            Float[] intl = scrape.getBenchmarkInternational();
            benchmarkInfo.put("benchmarkIntlYtd",intl[0]);
            benchmarkInfo.put("benchmarkIntl1Yr",intl[1]);

        }).start();



    }

    public void runScrapeTargetDate(){

        switch(this.fund){

            case "American Century":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(AMERICAN_CENTURY_2020);
                    indexInfoYTD.put(AMERICAN_CENTURY_2020,fundInfo[0]);
                    indexInfo1Yr.put(AMERICAN_CENTURY_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(AMERICAN_CENTURY_2030);
                    indexInfoYTD.put(AMERICAN_CENTURY_2030,fundInfo[0]);
                    indexInfo1Yr.put(AMERICAN_CENTURY_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(AMERICAN_CENTURY_2040);
                    indexInfoYTD.put(AMERICAN_CENTURY_2040,fundInfo[0]);
                    indexInfo1Yr.put(AMERICAN_CENTURY_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(AMERICAN_CENTURY_2050);
                    indexInfoYTD.put(AMERICAN_CENTURY_2050,fundInfo[0]);
                    indexInfo1Yr.put(AMERICAN_CENTURY_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(AMERICAN_CENTURY_2060);
                    indexInfoYTD.put(AMERICAN_CENTURY_2060,fundInfo[0]);
                    indexInfo1Yr.put(AMERICAN_CENTURY_2060,fundInfo[1]);
                }).start();
                break;

            case "Vanguard":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2020);
                    indexInfoYTD.put(VANGUARD_2020,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(VANGUARD_2030);
                    indexInfoYTD.put(VANGUARD_2030,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(VANGUARD_2040);
                    indexInfoYTD.put(VANGUARD_2040,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(VANGUARD_2050);
                    indexInfoYTD.put(VANGUARD_2050,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(VANGUARD_2060);
                    indexInfoYTD.put(VANGUARD_2060,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2060,fundInfo[1]);
                }).start();
                break;

            case "BlackRock":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getVanguard(BLACKROCK_2020);
                    indexInfoYTD.put(BLACKROCK_2020,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(BLACKROCK_2030);
                    indexInfoYTD.put(BLACKROCK_2030,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(BLACKROCK_2040);
                    indexInfoYTD.put(BLACKROCK_2040,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(BLACKROCK_2050);
                    indexInfoYTD.put(BLACKROCK_2050,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(BLACKROCK_2060);
                    indexInfoYTD.put(BLACKROCK_2060,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2060,fundInfo[1]);
                }).start();
                break;
        }
    }

    public void runCalc(){
//        new Thread(() -> this.setBenchmarkInfo()).start();
//        new Thread(() -> this.runScrapeTargetDate()).start();
        this.setBenchmarkInfo();
        this.runScrapeTargetDate();
        //double[] list = this.calculateWeightedIndex();
//        for (double item : list){
//            System.out.println(item);
//        }
        scrape.close();

    }

    public HashMap<String,Float> getBenchmarkInfo(){
        return benchmarkInfo;
    }

    public HashMap<String,Float> getIndexInfoYTD(){
        return indexInfoYTD;
    }

    public HashMap<String,Float> getIndexInfo1Yr(){
        return indexInfo1Yr;
    }



    public static void main(String[] args) {

        Calculator calc = new Calculator("American Century");
        calc.runCalc();

    }
}
