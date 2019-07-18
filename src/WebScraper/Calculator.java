package WebScraper;

import java.util.HashMap;

import static WebScraper.Constants.*;

public class Calculator {
    WebScraper scrape = new WebScraper();

    HashMap<String,Float> benchmarkInfo = new HashMap<>();
    HashMap<String,Float> indexInfoYTD = new HashMap<>();
    HashMap<String,Float> indexInfo1Yr = new HashMap<>();
    Funds fund;

    public Calculator(Funds fund){
        this.fund = fund;
    }

    public double[] calculateWeightedIndex(){
//        switch (this.fund){
//            case AMERICAN_CENTURY:
//
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
                double[] listOfWeightedBenches = {
                        American2020Ytd,American2030Ytd,American2040Ytd,American2050Ytd,American2060Ytd,American20201Yr,American20301Yr,
                        American20401Yr,American20501Yr,American20601Yr
                };
                return listOfWeightedBenches;

        //}
    }

    public double weightBenchmarkYTD(double bond,double equity,double cash , double intl){
        double sum =
        benchmarkInfo.get("benchmarkBondYtd") * bond + benchmarkInfo.get("benchmarkEquityYtd")*equity+
                benchmarkInfo.get("benchmarkCashYtd")*cash + benchmarkInfo.get("benchmarkIntlYtd") * intl;
        return sum;
    }

    public double weightBenchmark1Yr(double bond,double equity,double cash , double intl){
        double sum =
                benchmarkInfo.get("benchmarkBond1Yr") * bond + benchmarkInfo.get("benchmarkEquity1Yr")*equity+
                        benchmarkInfo.get("benchmarkCash1Yr")*cash + benchmarkInfo.get("benchmarkIntl1Yr") * intl;
        return sum;
    }

    public void setBenchmarkInfo(){

        Float[] bond = scrape.getBenchmarkBond();
        Float[] equity = scrape.getBenchmarkEquity();
        Float[] cash = scrape.getBenchmarkCash();
        Float[] intl = scrape.getBenchmarkInternational();
        benchmarkInfo.put("benchmarkBondYtd",bond[0]);
        benchmarkInfo.put("benchmarkBond1Yr",bond[1]);
        benchmarkInfo.put("benchmarkEquityYtd",equity[0]);
        benchmarkInfo.put("benchmarkEquity1Yr",equity[1]);
        benchmarkInfo.put("benchmarkCashYtd",cash[0]);
        benchmarkInfo.put("benchmarkCash1Yr",cash[1]);
        benchmarkInfo.put("benchmarkIntlYtd",intl[0]);
        benchmarkInfo.put("benchmarkIntl1Yr",intl[1]);

    }

    public void runScrapeTargetDate(){

        switch(this.fund){

            case AMERICAN_CENTURY:

                for (String American : AmericanList) {
                    Float[] fundInfo = scrape.getAmericanCentury(American);
                    indexInfoYTD.put(American,fundInfo[0]);
                    indexInfo1Yr.put(American,fundInfo[1]);
                }


            case VANGUARD:

                for (String vanguard : VanguardList) {
                    Float[] fundInfo = scrape.getAmericanCentury(vanguard);
                    indexInfoYTD.put(vanguard,fundInfo[0]);
                    indexInfo1Yr.put(vanguard,fundInfo[1]);


                }


            case BLACKROCK:

                for (String blackrock : BlackrockList) {
                    Float[] fundInfo = scrape.getAmericanCentury(blackrock);
                    indexInfoYTD.put(blackrock,fundInfo[0]);
                    indexInfo1Yr.put(blackrock,fundInfo[1]);
                }


        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(Funds.AMERICAN_CENTURY);
        calc.setBenchmarkInfo();
        calc.runScrapeTargetDate();
        double[] list = calc.calculateWeightedIndex();
        for (double item : list){
            System.out.println(item);
        }

    }
}
