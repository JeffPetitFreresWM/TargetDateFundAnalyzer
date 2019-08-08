package WebScraper;

import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.HashMap;

import static WebScraper.Constants.*;
import static WebScraper.Constants.ALLIANZGI2050INTL;


public class Calculator {

    WebScraper scrape = new WebScraper();
    HashMap<String,Float> benchmarkInfo = new HashMap<>();
    HashMap<String,Float> indexInfoYTD = new HashMap<>();
    HashMap<String,Float> indexInfo1Yr = new HashMap<>();
    ArrayList<Double> benchmarklistytd = new ArrayList<>();
    ArrayList<Double> benchmarklist1yr = new ArrayList<>();
    ArrayList<Float> indexlistytd = new ArrayList<>();
    ArrayList<Float> indexlist1yr = new ArrayList<>();
    HashMap<String,Double> mapOfWeightedBenchmarks = new HashMap<>();
    String fund;

    public Calculator(String fund){

        scrape.setDriver();
        this.fund = fund;

    }

    public void weightedBenchmarksHelper(double[] Bondlist, double[] EquityList, double[] CashList, double[] IntlList, String[] fund1yrlist, String[] fundytdlist){
        for (int i =0; i < Bondlist.length; i++){
            Double yrval = weightBenchmark1Yr(Bondlist[i],EquityList[i],CashList[i],IntlList[i]);
            Double ytdval = weightBenchmarkYTD(Bondlist[i],EquityList[i],CashList[i],IntlList[i]);
            mapOfWeightedBenchmarks.put(fund1yrlist[i],yrval);
            benchmarklist1yr.add(yrval);
            mapOfWeightedBenchmarks.put(fundytdlist[i],ytdval);
            benchmarklistytd.add(ytdval);
        }
    }

    public HashMap<String,Double> calculateWeightedIndex(){

        switch (this.fund){
            case "American Century":

                weightedBenchmarksHelper(AmericanCenturyBondList,AmericanCenturyEquityList,AmericanCenturyCashList,AmericanCenturyINTLList,AmericanBench1yrList,AmericanBenchYtdList);

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
                benchmarklistytd.add(BlackRock2020Ytd);
                mapOfWeightedBenchmarks.put("BlackRock2030BenchYtd",BlackRock2030Ytd);
                benchmarklistytd.add(BlackRock2030Ytd);
                benchmarklistytd.add(BlackRock2040Ytd);
                benchmarklistytd.add(BlackRock2050Ytd);
                benchmarklistytd.add(BlackRock2060Ytd);
                benchmarklist1yr.add(BlackRock20201Yr);
                benchmarklist1yr.add(BlackRock20301Yr);
                benchmarklist1yr.add(BlackRock20401Yr);
                benchmarklist1yr.add(BlackRock20501Yr);
                benchmarklist1yr.add(BlackRock20601Yr);
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
                System.out.println("Getting vanguard");
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
                benchmarklistytd.add(Vanguard2020Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2030BenchYtd",Vanguard2030Ytd);
                benchmarklistytd.add(Vanguard2030Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2040BenchYtd",Vanguard2040Ytd);
                benchmarklistytd.add(Vanguard2040Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2050BenchYtd",Vanguard2050Ytd);
                benchmarklistytd.add(Vanguard2050Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2060BenchYtd",Vanguard2060Ytd);
                benchmarklistytd.add(Vanguard2060Ytd);
                mapOfWeightedBenchmarks.put("Vanguard2020Bench1Yr",Vanguard20201Yr);
                benchmarklist1yr.add(Vanguard20201Yr);
                mapOfWeightedBenchmarks.put("Vanguard2030Bench1Yr",Vanguard20301Yr);
                benchmarklist1yr.add(Vanguard20301Yr);
                mapOfWeightedBenchmarks.put("Vanguard2040Bench1Yr",Vanguard20401Yr);
                benchmarklist1yr.add(Vanguard20401Yr);
                mapOfWeightedBenchmarks.put("Vanguard2050Bench1Yr",Vanguard20501Yr);
                benchmarklist1yr.add(Vanguard20501Yr);
                mapOfWeightedBenchmarks.put("Vanguard2060Bench1Yr",Vanguard20601Yr);
                benchmarklist1yr.add(Vanguard20601Yr);

                return mapOfWeightedBenchmarks;


            case "JPMorgan":
                double JPMorgan2020Ytd = weightBenchmarkYTD(JPMORGAN2020BOND,JPMORGAN2020EQUITY,JPMORGAN2020CASH,JPMORGAN2020INTL);
                double JPMorgan20201Yr = weightBenchmark1Yr(JPMORGAN2020BOND,JPMORGAN2020EQUITY,JPMORGAN2020CASH,JPMORGAN2020INTL);
                double JPMorgan2030Ytd = weightBenchmarkYTD(JPMORGAN2030BOND,JPMORGAN2030EQUITY,JPMORGAN2030CASH,JPMORGAN2030INTL);
                double JPMorgan20301Yr = weightBenchmark1Yr(JPMORGAN2030BOND,JPMORGAN2030EQUITY,JPMORGAN2030CASH,JPMORGAN2030INTL);
                double JPMorgan2040Ytd = weightBenchmarkYTD(JPMORGAN2040BOND,JPMORGAN2040EQUITY,JPMORGAN2040CASH,JPMORGAN2040INTL);
                double JPMorgan20401Yr = weightBenchmark1Yr(JPMORGAN2040BOND,JPMORGAN2040EQUITY,JPMORGAN2040CASH,JPMORGAN2040INTL);
                double JPMorgan2050Ytd = weightBenchmarkYTD(JPMORGAN2050BOND,JPMORGAN2050EQUITY,JPMORGAN2050CASH,JPMORGAN2050INTL);
                double JPMorgan20501Yr = weightBenchmark1Yr(JPMORGAN2050BOND,JPMORGAN2050EQUITY,JPMORGAN2050CASH,JPMORGAN2050INTL);
                double JPMorgan2060Ytd = weightBenchmarkYTD(JPMORGAN2060BOND,JPMORGAN2060EQUITY,JPMORGAN2060CASH,JPMORGAN2060INTL);
                double JPMorgan20601Yr = weightBenchmark1Yr(JPMORGAN2060BOND,JPMORGAN2060EQUITY,JPMORGAN2060CASH,JPMORGAN2060INTL);
                benchmarklistytd.add(JPMorgan2020Ytd);
                benchmarklistytd.add(JPMorgan2030Ytd);
                benchmarklistytd.add(JPMorgan2040Ytd);
                benchmarklistytd.add(JPMorgan2050Ytd);
                benchmarklistytd.add(JPMorgan2060Ytd);
                benchmarklist1yr.add(JPMorgan20201Yr);
                benchmarklist1yr.add(JPMorgan20301Yr);
                benchmarklist1yr.add(JPMorgan20401Yr);
                benchmarklist1yr.add(JPMorgan20501Yr);
                benchmarklist1yr.add(JPMorgan20601Yr);
                mapOfWeightedBenchmarks.put("JPMorgan2020BenchYtd",JPMorgan2020Ytd);
                mapOfWeightedBenchmarks.put("JPMorgan2030BenchYtd",JPMorgan2030Ytd);
                mapOfWeightedBenchmarks.put("JPMorgan2040BenchYtd",JPMorgan2040Ytd);
                mapOfWeightedBenchmarks.put("JPMorgan2050BenchYtd",JPMorgan2050Ytd);
                mapOfWeightedBenchmarks.put("JPMorgan2060BenchYtd",JPMorgan2060Ytd);
                mapOfWeightedBenchmarks.put("JPMorgan2020Bench1Yr",JPMorgan20201Yr);
                mapOfWeightedBenchmarks.put("JPMorgan2030Bench1Yr",JPMorgan20301Yr);
                mapOfWeightedBenchmarks.put("JPMorgan2040Bench1Yr",JPMorgan20401Yr);
                mapOfWeightedBenchmarks.put("JPMorgan2050Bench1Yr",JPMorgan20501Yr);
                mapOfWeightedBenchmarks.put("JPMorgan2060Bench1Yr",JPMorgan20601Yr);

                return mapOfWeightedBenchmarks;


            case "TRowe Price":
                double TRowe2020Ytd = weightBenchmarkYTD(TROWE2020BOND,TROWE2020EQUITY,TROWE2020CASH,TROWE2020INTL);
                double TRowe20201Yr = weightBenchmark1Yr(TROWE2020BOND,TROWE2020EQUITY,TROWE2020CASH,TROWE2020INTL);
                double TRowe2030Ytd = weightBenchmarkYTD(TROWE2030BOND,TROWE2030EQUITY,TROWE2030CASH,TROWE2030INTL);
                double TRowe20301Yr = weightBenchmark1Yr(TROWE2030BOND,TROWE2030EQUITY,TROWE2030CASH,TROWE2030INTL);
                double TRowe2040Ytd = weightBenchmarkYTD(TROWE2040BOND,TROWE2040EQUITY,TROWE2040CASH,TROWE2040INTL);
                double TRowe20401Yr = weightBenchmark1Yr(TROWE2040BOND,TROWE2040EQUITY,TROWE2040CASH,TROWE2040INTL);
                double TRowe2050Ytd = weightBenchmarkYTD(TROWE2050BOND,TROWE2050EQUITY,TROWE2050CASH,TROWE2050INTL);
                double TRowe20501Yr = weightBenchmark1Yr(TROWE2050BOND,TROWE2050EQUITY,TROWE2050CASH,TROWE2050INTL);
                double TRowe2060Ytd = weightBenchmarkYTD(TROWE2060BOND,TROWE2060EQUITY,TROWE2060CASH,TROWE2060INTL);
                double TRowe20601Yr = weightBenchmark1Yr(TROWE2060BOND,TROWE2060EQUITY,TROWE2060CASH,TROWE2060INTL);
                benchmarklist1yr.add(TRowe20201Yr);
                benchmarklist1yr.add(TRowe20301Yr);
                benchmarklist1yr.add(TRowe20401Yr);
                benchmarklist1yr.add(TRowe20501Yr);
                benchmarklist1yr.add(TRowe20601Yr);
                benchmarklistytd.add(TRowe2020Ytd);
                benchmarklistytd.add(TRowe2030Ytd);
                benchmarklistytd.add(TRowe2040Ytd);
                benchmarklistytd.add(TRowe2050Ytd);
                benchmarklistytd.add(TRowe2060Ytd);

                mapOfWeightedBenchmarks.put("TRowe2020BenchYtd",TRowe2020Ytd);
                mapOfWeightedBenchmarks.put("TRowe2030BenchYtd",TRowe2030Ytd);
                mapOfWeightedBenchmarks.put("TRowe2040BenchYtd",TRowe2040Ytd);
                mapOfWeightedBenchmarks.put("TRowe2050BenchYtd",TRowe2050Ytd);
                mapOfWeightedBenchmarks.put("TRowe2060BenchYtd",TRowe2060Ytd);
                mapOfWeightedBenchmarks.put("TRowe2020Bench1Yr",TRowe20201Yr);
                mapOfWeightedBenchmarks.put("TRowe2030Bench1Yr",TRowe20301Yr);
                mapOfWeightedBenchmarks.put("TRowe2040Bench1Yr",TRowe20401Yr);
                mapOfWeightedBenchmarks.put("TRowe2050Bench1Yr",TRowe20501Yr);
                mapOfWeightedBenchmarks.put("TRowe2060Bench1Yr",TRowe20601Yr);

                return mapOfWeightedBenchmarks;


            case "PIMCO":
                double PIMCO2020Ytd = weightBenchmarkYTD(PIMCO2020BOND,PIMCO2020EQUITY,PIMCO2020CASH,PIMCO2020INTL);
                double PIMCO20201Yr = weightBenchmark1Yr(PIMCO2020BOND,PIMCO2020EQUITY,PIMCO2020CASH,PIMCO2020INTL);
                double PIMCO2030Ytd = weightBenchmarkYTD(PIMCO2030BOND,PIMCO2030EQUITY,PIMCO2030CASH,PIMCO2030INTL);
                double PIMCO20301Yr = weightBenchmark1Yr(PIMCO2030BOND,PIMCO2030EQUITY,PIMCO2030CASH,PIMCO2030INTL);
                double PIMCO2040Ytd = weightBenchmarkYTD(PIMCO2040BOND,PIMCO2040EQUITY,PIMCO2040CASH,PIMCO2040INTL);
                double PIMCO20401Yr = weightBenchmark1Yr(PIMCO2040BOND,PIMCO2040EQUITY,PIMCO2040CASH,PIMCO2040INTL);
                double PIMCO2050Ytd = weightBenchmarkYTD(PIMCO2050BOND,PIMCO2050EQUITY,PIMCO2050CASH,PIMCO2050INTL);
                double PIMCO20501Yr = weightBenchmark1Yr(PIMCO2050BOND,PIMCO2050EQUITY,PIMCO2050CASH,PIMCO2050INTL);
                benchmarklistytd.add(PIMCO2020Ytd);
                benchmarklistytd.add(PIMCO2030Ytd);
                benchmarklistytd.add(PIMCO2040Ytd);
                benchmarklistytd.add(PIMCO2050Ytd);
                benchmarklist1yr.add(PIMCO20201Yr);
                benchmarklist1yr.add(PIMCO20301Yr);
                benchmarklist1yr.add(PIMCO20401Yr);
                benchmarklist1yr.add(PIMCO20501Yr);
                mapOfWeightedBenchmarks.put("PIMCO2020BenchYtd",PIMCO2020Ytd);
                mapOfWeightedBenchmarks.put("PIMCO2030BenchYtd",PIMCO2030Ytd);
                mapOfWeightedBenchmarks.put("PIMCO2040BenchYtd",PIMCO2040Ytd);
                mapOfWeightedBenchmarks.put("PIMCO2050BenchYtd",PIMCO2050Ytd);
                mapOfWeightedBenchmarks.put("PIMCO2020Bench1Yr",PIMCO20201Yr);
                mapOfWeightedBenchmarks.put("PIMCO2030Bench1Yr",PIMCO20301Yr);
                mapOfWeightedBenchmarks.put("PIMCO2040Bench1Yr",PIMCO20401Yr);
                mapOfWeightedBenchmarks.put("PIMCO2050Bench1Yr",PIMCO20501Yr);


                return mapOfWeightedBenchmarks;

            case "TIAA":
                double TIAA2020Ytd = weightBenchmarkYTD(TIAA2020BOND,TIAA2020EQUITY,TIAA2020CASH,TIAA2020INTL);
                double TIAA20201Yr = weightBenchmark1Yr(TIAA2020BOND,TIAA2020EQUITY,TIAA2020CASH,TIAA2020INTL);
                double TIAA2030Ytd = weightBenchmarkYTD(TIAA2030BOND,TIAA2030EQUITY,TIAA2030CASH,TIAA2030INTL);
                double TIAA20301Yr = weightBenchmark1Yr(TIAA2030BOND,TIAA2030EQUITY,TIAA2030CASH,TIAA2030INTL);
                double TIAA2040Ytd = weightBenchmarkYTD(TIAA2040BOND,TIAA2040EQUITY,TIAA2040CASH,TIAA2040INTL);
                double TIAA20401Yr = weightBenchmark1Yr(TIAA2040BOND,TIAA2040EQUITY,TIAA2040CASH,TIAA2040INTL);
                double TIAA2050Ytd = weightBenchmarkYTD(TIAA2050BOND,TIAA2050EQUITY,TIAA2050CASH,TIAA2050INTL);
                double TIAA20501Yr = weightBenchmark1Yr(TIAA2050BOND,TIAA2050EQUITY,TIAA2050CASH,TIAA2050INTL);
                double TIAA2060Ytd = weightBenchmarkYTD(TIAA2060BOND,TIAA2060EQUITY,TIAA2060CASH,TIAA2060INTL);
                double TIAA20601Yr = weightBenchmark1Yr(TIAA2060BOND,TIAA2060EQUITY,TIAA2060CASH,TIAA2060INTL);
                benchmarklist1yr.add(TIAA20201Yr);
                benchmarklist1yr.add(TIAA20301Yr);
                benchmarklist1yr.add(TIAA20401Yr);
                benchmarklist1yr.add(TIAA20501Yr);
                benchmarklist1yr.add(TIAA20601Yr);
                benchmarklistytd.add(TIAA2020Ytd);
                benchmarklistytd.add(TIAA2030Ytd);
                benchmarklistytd.add(TIAA2040Ytd);
                benchmarklistytd.add(TIAA2050Ytd);
                benchmarklistytd.add(TIAA2060Ytd);
                mapOfWeightedBenchmarks.put("TIAA2020BenchYtd",TIAA2020Ytd);
                mapOfWeightedBenchmarks.put("TIAA2030BenchYtd",TIAA2030Ytd);
                mapOfWeightedBenchmarks.put("TIAA2040BenchYtd",TIAA2040Ytd);
                mapOfWeightedBenchmarks.put("TIAA2050BenchYtd",TIAA2050Ytd);
                mapOfWeightedBenchmarks.put("TIAA2060BenchYtd",TIAA2060Ytd);
                mapOfWeightedBenchmarks.put("TIAA2020Bench1Yr",TIAA20201Yr);
                mapOfWeightedBenchmarks.put("TIAA2030Bench1Yr",TIAA20301Yr);
                mapOfWeightedBenchmarks.put("TIAA2040Bench1Yr",TIAA20401Yr);
                mapOfWeightedBenchmarks.put("TIAA2050Bench1Yr",TIAA20501Yr);
                mapOfWeightedBenchmarks.put("TIAA2060Bench1Yr",TIAA20601Yr);

                return mapOfWeightedBenchmarks;

            case "Allianz":
                double Allianz2020Ytd = weightBenchmarkYTD(ALLIANZGI2020BOND,ALLIANZGI2020EQUITY,ALLIANZGI2020CASH,ALLIANZGI2020INTL);
                double Allianz20201Yr = weightBenchmark1Yr(ALLIANZGI2020BOND,ALLIANZGI2020EQUITY,ALLIANZGI2020CASH,ALLIANZGI2020INTL);
                double Allianz2030Ytd = weightBenchmarkYTD(ALLIANZGI2030BOND,ALLIANZGI2030EQUITY,ALLIANZGI2030CASH,ALLIANZGI2030INTL);
                double Allianz20301Yr = weightBenchmark1Yr(ALLIANZGI2030BOND,ALLIANZGI2030EQUITY,ALLIANZGI2030CASH,ALLIANZGI2030INTL);
                double Allianz2040Ytd = weightBenchmarkYTD(ALLIANZGI2040BOND,ALLIANZGI2040EQUITY,ALLIANZGI2040CASH,ALLIANZGI2040INTL);
                double Allianz20401Yr = weightBenchmark1Yr(ALLIANZGI2040BOND,ALLIANZGI2040EQUITY,ALLIANZGI2040CASH,ALLIANZGI2040INTL);
                double Allianz2050Ytd = weightBenchmarkYTD(ALLIANZGI2050BOND,ALLIANZGI2050EQUITY,ALLIANZGI2050CASH,ALLIANZGI2050INTL);
                double Allianz20501Yr = weightBenchmark1Yr(ALLIANZGI2050BOND,ALLIANZGI2050EQUITY,ALLIANZGI2050CASH,ALLIANZGI2050INTL);
                benchmarklistytd.add(Allianz2020Ytd);
                benchmarklistytd.add(Allianz2030Ytd);
                benchmarklistytd.add(Allianz2040Ytd);
                benchmarklistytd.add(Allianz2050Ytd);
                benchmarklist1yr.add(Allianz20201Yr);
                benchmarklist1yr.add(Allianz20301Yr);
                benchmarklist1yr.add(Allianz20401Yr);
                benchmarklist1yr.add(Allianz20501Yr);
                mapOfWeightedBenchmarks.put("Allianz2020BenchYtd",Allianz2020Ytd);
                mapOfWeightedBenchmarks.put("Allianz2030BenchYtd",Allianz2030Ytd);
                mapOfWeightedBenchmarks.put("Allianz2040BenchYtd",Allianz2040Ytd);
                mapOfWeightedBenchmarks.put("Allianz2050BenchYtd",Allianz2050Ytd);

                mapOfWeightedBenchmarks.put("Allianz2020Bench1Yr",Allianz20201Yr);
                mapOfWeightedBenchmarks.put("Allianz2030Bench1Yr",Allianz20301Yr);
                mapOfWeightedBenchmarks.put("Allianz2040Bench1Yr",Allianz20401Yr);
                mapOfWeightedBenchmarks.put("Allianz2050Bench1Yr",Allianz20501Yr);


                return mapOfWeightedBenchmarks;
            default:
                return null;
        }

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
//        new Thread(() -> {
            Float[] bond = scrape.getBenchmarkBond();
            benchmarkInfo.put("benchmarkBondYtd",bond[0]);
            benchmarkInfo.put("benchmarkBond1Yr",bond[1]);
//
//
//        }).start();
//        new Thread(() -> {
            Float[] equity = scrape.getBenchmarkEquity();
            benchmarkInfo.put("benchmarkEquityYtd",equity[0]);
            benchmarkInfo.put("benchmarkEquity1Yr",equity[1]);


//        }).start();
//
//        new Thread(() -> {
            Float[] cash = scrape.getBenchmarkCash();

            benchmarkInfo.put("benchmarkCashYtd",cash[0]);
            benchmarkInfo.put("benchmarkCash1Yr",cash[1]);


//        }).start();
//        new Thread(() -> {

            Float[] intl = scrape.getBenchmarkInternational();
            benchmarkInfo.put("benchmarkIntlYtd",intl[0]);
            benchmarkInfo.put("benchmarkIntl1Yr",intl[1]);

//        }).start();



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
                    System.out.println("First thread");
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2020);
                    indexInfoYTD.put(VANGUARD_2020,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    System.out.println("SEcond thread");
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2030);
                    indexInfoYTD.put(VANGUARD_2030,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    System.out.println("third thread");
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2040);
                    indexInfoYTD.put(VANGUARD_2040,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    System.out.println("Fourth thread");
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2050);
                    indexInfoYTD.put(VANGUARD_2050,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    System.out.println("fifth thread");
                    Float[] fundInfo = scrape.getVanguard(VANGUARD_2060);
                    indexInfoYTD.put(VANGUARD_2060,fundInfo[0]);
                    indexInfo1Yr.put(VANGUARD_2060,fundInfo[1]);
                }).start();
                break;

            case "BlackRock":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getBlackRock(BLACKROCK_2020);
                    indexInfoYTD.put(BLACKROCK_2020,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getBlackRock(BLACKROCK_2030);
                    indexInfoYTD.put(BLACKROCK_2030,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getBlackRock(BLACKROCK_2040);
                    indexInfoYTD.put(BLACKROCK_2040,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getBlackRock(BLACKROCK_2050);
                    indexInfoYTD.put(BLACKROCK_2050,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getBlackRock(BLACKROCK_2060);
                    indexInfoYTD.put(BLACKROCK_2060,fundInfo[0]);
                    indexInfo1Yr.put(BLACKROCK_2060,fundInfo[1]);
                }).start();
                break;

            case "JPMorgan":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getJPMorgan(JPMORGAN_2020);
                    indexInfoYTD.put(JPMORGAN_2020,fundInfo[0]);
                    indexInfo1Yr.put(JPMORGAN_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getJPMorgan(JPMORGAN_2030);
                    indexInfoYTD.put(JPMORGAN_2030,fundInfo[0]);
                    indexInfo1Yr.put(JPMORGAN_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getJPMorgan(JPMORGAN_2040);
                    indexInfoYTD.put(JPMORGAN_2040,fundInfo[0]);
                    indexInfo1Yr.put(JPMORGAN_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAmericanCentury(JPMORGAN_2050);
                    indexInfoYTD.put(JPMORGAN_2050,fundInfo[0]);
                    indexInfo1Yr.put(JPMORGAN_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getJPMorgan(JPMORGAN_2060);
                    indexInfoYTD.put(JPMORGAN_2060,fundInfo[0]);
                    indexInfo1Yr.put(JPMORGAN_2060,fundInfo[1]);
                }).start();
                break;

            case "TRowe Price":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getTrowe(TROWE_2020);
                    indexInfoYTD.put(TROWE_2020,fundInfo[0]);
                    indexInfo1Yr.put(TROWE_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTrowe(TROWE_2030);
                    indexInfoYTD.put(TROWE_2030,fundInfo[0]);
                    indexInfo1Yr.put(TROWE_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTrowe(TROWE_2040);
                    indexInfoYTD.put(TROWE_2040,fundInfo[0]);
                    indexInfo1Yr.put(TROWE_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTrowe(TROWE_2050);
                    indexInfoYTD.put(TROWE_2050,fundInfo[0]);
                    indexInfo1Yr.put(TROWE_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTrowe(TROWE_2060);
                    indexInfoYTD.put(TROWE_2060,fundInfo[0]);
                    indexInfo1Yr.put(TROWE_2060,fundInfo[1]);
                }).start();
                break;

            case "PIMCO":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getPIMCO(PIMCO_2020);
                    indexInfoYTD.put(PIMCO_2020,fundInfo[0]);
                    indexInfo1Yr.put(PIMCO_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getPIMCO(PIMCO_2030);
                    indexInfoYTD.put(PIMCO_2030,fundInfo[0]);
                    indexInfo1Yr.put(PIMCO_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getPIMCO(PIMCO_2040);
                    indexInfoYTD.put(PIMCO_2040,fundInfo[0]);
                    indexInfo1Yr.put(PIMCO_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getPIMCO(PIMCO_2050);
                    indexInfoYTD.put(PIMCO_2050,fundInfo[0]);
                    indexInfo1Yr.put(PIMCO_2050,fundInfo[1]);
                }).start();

                break;

            case "TIAA":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getTiaa(TIAA_2020);
                    indexInfoYTD.put(TIAA_2020,fundInfo[0]);
                    indexInfo1Yr.put(TIAA_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTiaa(TIAA_2030);
                    indexInfoYTD.put(TIAA_2030,fundInfo[0]);
                    indexInfo1Yr.put(TIAA_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTiaa(TIAA_2040);
                    indexInfoYTD.put(TIAA_2040,fundInfo[0]);
                    indexInfo1Yr.put(TIAA_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTiaa(TIAA_2050);
                    indexInfoYTD.put(TIAA_2050,fundInfo[0]);
                    indexInfo1Yr.put(TIAA_2050,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getTiaa(TIAA_2060);
                    indexInfoYTD.put(TIAA_2060,fundInfo[0]);
                    indexInfo1Yr.put(TIAA_2060,fundInfo[1]);
                }).start();
                break;

            case "Allianz":

                new Thread(() -> {
                    Float[] fundInfo = scrape.getAllianz(ALLIANZGI_2020);
                    indexInfoYTD.put(ALLIANZGI_2020,fundInfo[0]);
                    indexInfo1Yr.put(ALLIANZGI_2020,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAllianz(ALLIANZGI_2030);
                    indexInfoYTD.put(ALLIANZGI_2030,fundInfo[0]);
                    indexInfo1Yr.put(ALLIANZGI_2030,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAllianz(ALLIANZGI_2040);
                    indexInfoYTD.put(ALLIANZGI_2040,fundInfo[0]);
                    indexInfo1Yr.put(ALLIANZGI_2040,fundInfo[1]);
                }).start();
                new Thread(() -> {
                    Float[] fundInfo = scrape.getAllianz(ALLIANZGI_2050);
                    indexInfoYTD.put(ALLIANZGI_2050,fundInfo[0]);
                    indexInfo1Yr.put(ALLIANZGI_2050,fundInfo[1]);
                }).start();

                break;
        }
    }

    public void runCalc(){
//        new Thread(() -> this.setBenchmarkInfo()).start();
//        new Thread(() -> this.runScrapeTargetDate()).start();
        this.runScrapeTargetDate();
        this.setBenchmarkInfo();
        //double[] list = this.calculateWeightedIndex();
//        for (double item : list){
//            System.out.println(item);
//        }
        scrape.close();

    }




    public ArrayList<Double> getBenchmarklistytd() {
        return benchmarklistytd;
    }
    public ArrayList<Double> getBenchmarklist1yr() {
        return benchmarklist1yr;
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
