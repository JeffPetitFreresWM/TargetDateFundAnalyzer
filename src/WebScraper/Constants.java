package WebScraper;

public class Constants {
    /**
     * Keeps all of the constants being used including URLS, Names of Index funds, etc. When adding
     * new Index funds or altering the benchmark, this is where you will add in the new URLs/ funds.
     */

    /**
     * constants for all of the URLS
     */

                            /////////////////////////////////// NAMES OF FUNDS //////////////////////////////////

    public enum Funds{

        AMERICAN_CENTURY, VANGUARD, TROWE_PRICE, BLACKROCK;

    }
                            /////////////////////////////////// BENCHMARKS //////////////////////////////////////

    public  static final String EQUITY = "https://investor.vanguard.com/mutual-funds/profile/performance/vitsx";
    public static final String BOND = "https://investor.vanguard.com/mutual-funds/profile/performance/vbtix";
    public static final String INTERNATIONAL = "https://investor.vanguard.com/mutual-funds/profile/performance/vtsnx";
    public static final String CASH = "https://investor.vanguard.com/mutual-funds/profile/performance/vmfxx";

    public static final String[] Benchmarks = {EQUITY,BOND,INTERNATIONAL,CASH};

                            ///////////////////////////////////AMERICAN CENTURY//////////////////////////////////
    public static final String AMERICAN_CENTURY_2020 = "https://www.americancentury.com/content/direct/en/products/all-funds/fund-list/one-choice-2020-portfolio.html#performance";
    public static final String AMERICAN_CENTURY_2030 = "https://www.americancentury.com/content/direct/en/products/all-funds/fund-list/one-choice-2030-portfolio.html";
    public static final String AMERICAN_CENTURY_2040 = "https://www.americancentury.com/content/direct/en/products/all-funds/fund-list/one-choice-2040-portfolio.html";
    public static final String AMERICAN_CENTURY_2050 = "https://www.americancentury.com/content/direct/en/products/all-funds/fund-list/one-choice-2050-portfolio.html";
    public static final String AMERICAN_CENTURY_2060 = "https://www.americancentury.com/content/direct/en/products/all-funds/fund-list/one-choice-2060-portfolio.html";

    public static final String[] AmericanList = {AMERICAN_CENTURY_2020,AMERICAN_CENTURY_2030,AMERICAN_CENTURY_2040,AMERICAN_CENTURY_2050,AMERICAN_CENTURY_2060};

    public static final double AMERICANCENTURY2020EQUITY = .3624;
    public static final double AMERICANCENTURY2030EQUITY = .4096;
    public static final double AMERICANCENTURY2040EQUITY = .4985;
    public static final double AMERICANCENTURY2050EQUITY = .5837;
    public static final double AMERICANCENTURY2060EQUITY = .6164;

    public static final double AMERICANCENTURY2020CASH = .095;
    public static final double AMERICANCENTURY2030CASH = .05;
    public static final double AMERICANCENTURY2040CASH = .045;
    public static final double AMERICANCENTURY2050CASH = 0;
    public static final double AMERICANCENTURY2060CASH = 0;

    public static final double AMERICANCENTURY2020BOND = 0.445;
    public static final double AMERICANCENTURY2030BOND = 0.3875;
    public static final double AMERICANCENTURY2040BOND = 0.2675;
    public static final double AMERICANCENTURY2050BOND = 0.195;
    public static final double AMERICANCENTURY2060BOND = 0.15;

    public static final double AMERICANCENTURY2020INTL = .0976;
    public static final double AMERICANCENTURY2030INTL = .1529;
    public static final double AMERICANCENTURY2040INTL = .189;
    public static final double AMERICANCENTURY2050INTL = .2213;
    public static final double AMERICANCENTURY2060INTL = .2336;







                            //////////////////////////////////// BLACKROCK ///////////////////////////////////////
    public static final String BLACKROCK_2020 = "https://www.blackrock.com/us/individual/products/227826/blackrock-lifepath-index-2020-portfoliocl-k-fund";
    public static final String BLACKROCK_2030 = "https://www.blackrock.com/us/individual/products/227839/blackrock-lifepath-index-2030-portfoliocl-k-fund";
    public static final String BLACKROCK_2040 = "https://www.blackrock.com/us/individual/products/227847/blackrock-lifepath-index-2040-portfoliocl-k-fund";
    public static final String BLACKROCK_2050 = "https://www.blackrock.com/us/individual/products/227852/blackrock-lifepath-index-2050-portfoliocl-k-fund";
    public static final String BLACKROCK_2060 = "https://www.blackrock.com/us/individual/products/282489/lifepath-index-2060-class-k-fund";

    public static final String[] BlackrockList = {BLACKROCK_2020,BLACKROCK_2030,BLACKROCK_2040,BLACKROCK_2050,BLACKROCK_2060};


                            //////////////////////////////////// VANGUARD ////////////////////////////////////////
    public static final String VANGUARD_2020 = "https://investor.vanguard.com/mutual-funds/profile/performance/vtwnx";
    public static final String VANGUARD_2030 = "https://investor.vanguard.com/mutual-funds/profile/performance/vthrx";
    public static final String VANGUARD_2040 = "https://investor.vanguard.com/mutual-funds/profile/performance/vforx";
    public static final String VANGUARD_2050 = "https://investor.vanguard.com/mutual-funds/profile/performance/vfifx";
    public static final String VANGUARD_2060 = "https://investor.vanguard.com/mutual-funds/profile/performance/vttsx";

    public static final String[] VanguardList = {VANGUARD_2020,VANGUARD_2030,VANGUARD_2040,VANGUARD_2050,VANGUARD_2060};


}
