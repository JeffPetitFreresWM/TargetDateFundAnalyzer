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
    public static final String[] Fundslist = {"American Century","Vanguard","TRowe Price","BlackRock","Allianz","MFS","TIAA", "JP Morgan", "PIMCO"};
                            /////////////////////////////////// BENCHMARKS //////////////////////////////////////

    public static final String EQUITY = "https://investor.vanguard.com/mutual-funds/profile/performance/vitsx";
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

    public static  final String[] AmericanBenchYtdList = {
            "American2020BenchYtd",
            "American2030BenchYtd",
            "American2040BenchYtd",
            "American2050BenchYtd",
            "American2060BenchYtd"
    };

    public static  final String[] AmericanBench1yrList = {
            "American2020Bench1Yr",
            "American2030Bench1Yr",
            "American2040Bench1Yr",
            "American2050Bench1Yr",
            "American2060Bench1Yr"
    };


    public static final double AMERICANCENTURY2020EQUITY = .3624;
    public static final double AMERICANCENTURY2030EQUITY = .4096;
    public static final double AMERICANCENTURY2040EQUITY = .4985;
    public static final double AMERICANCENTURY2050EQUITY = .5837;
    public static final double AMERICANCENTURY2060EQUITY = .6164;

    public static final double[] AmericanCenturyEquityList = {
            AMERICANCENTURY2020EQUITY,
            AMERICANCENTURY2030EQUITY,
            AMERICANCENTURY2040EQUITY,
            AMERICANCENTURY2050EQUITY,
            AMERICANCENTURY2060EQUITY,
    };

    public static final double AMERICANCENTURY2020CASH = .095;
    public static final double AMERICANCENTURY2030CASH = .05;
    public static final double AMERICANCENTURY2040CASH = .045;
    public static final double AMERICANCENTURY2050CASH = 0;
    public static final double AMERICANCENTURY2060CASH = 0;

    public static final double[] AmericanCenturyCashList = {
            AMERICANCENTURY2020CASH,
            AMERICANCENTURY2030CASH,
            AMERICANCENTURY2040CASH,
            AMERICANCENTURY2050CASH,
            AMERICANCENTURY2060CASH,
    };

    public static final double AMERICANCENTURY2020BOND = 0.445;
    public static final double AMERICANCENTURY2030BOND = 0.3875;
    public static final double AMERICANCENTURY2040BOND = 0.2675;
    public static final double AMERICANCENTURY2050BOND = 0.195;
    public static final double AMERICANCENTURY2060BOND = 0.15;

    public static final double[] AmericanCenturyBondList = {
            AMERICANCENTURY2020BOND,
            AMERICANCENTURY2030BOND,
            AMERICANCENTURY2040BOND,
            AMERICANCENTURY2050BOND,
            AMERICANCENTURY2060BOND,
    };

    public static final double AMERICANCENTURY2020INTL = .0976;
    public static final double AMERICANCENTURY2030INTL = .1529;
    public static final double AMERICANCENTURY2040INTL = .189;
    public static final double AMERICANCENTURY2050INTL = .2213;
    public static final double AMERICANCENTURY2060INTL = .2336;

    public static final double[] AmericanCenturyINTLList = {
            AMERICANCENTURY2020INTL,
            AMERICANCENTURY2030INTL,
            AMERICANCENTURY2040INTL,
            AMERICANCENTURY2050INTL,
            AMERICANCENTURY2060INTL,
    };







                            //////////////////////////////////// BLACKROCK ///////////////////////////////////////
    public static final String BLACKROCK_2020 = "https://www.blackrock.com/us/individual/products/227826/blackrock-lifepath-index-2020-portfoliocl-k-fund";
    public static final String BLACKROCK_2030 = "https://www.blackrock.com/us/individual/products/227839/blackrock-lifepath-index-2030-portfoliocl-k-fund";
    public static final String BLACKROCK_2040 = "https://www.blackrock.com/us/individual/products/227847/blackrock-lifepath-index-2040-portfoliocl-k-fund";
    public static final String BLACKROCK_2050 = "https://www.blackrock.com/us/individual/products/227852/blackrock-lifepath-index-2050-portfoliocl-k-fund";
    public static final String BLACKROCK_2060 = "https://www.blackrock.com/us/individual/products/282489/lifepath-index-2060-class-k-fund";

    public static final String[] BlackrockList = {BLACKROCK_2020,BLACKROCK_2030,BLACKROCK_2040,BLACKROCK_2050,BLACKROCK_2060};

    public static  final String[] BlackRockYtdList = {
            "BlackRock2020BenchYtd",
            "BlackRock2030BenchYtd",
            "BlackRock2040BenchYtd",
            "BlackRock2050BenchYtd",
            "BlackRock2060BenchYtd",

    };



    public static  final String[] BlackRock1yrList = {
            "BlackRock2020Bench1Yr",
            "BlackRock2030Bench1Yr",
            "BlackRock2040Bench1Yr",
            "BlackRock2050Bench1Yr",
            "BlackRock2060Bench1Yr"
    };

    public static final double BLACKROCK2020EQUITY = .2938;
    public static final double BLACKROCK2030EQUITY = .4379;
    public static final double BLACKROCK2040EQUITY = .5531;
    public static final double BLACKROCK2050EQUITY = .6041;
    public static final double BLACKROCK2060EQUITY = .6052;

    public static final double[] BlackRockEquityList = {
            BLACKROCK2020EQUITY,
            BLACKROCK2030EQUITY,
            BLACKROCK2040EQUITY,
            BLACKROCK2050EQUITY,
            BLACKROCK2060EQUITY,
    };


    public static final double BLACKROCK2020CASH = 0;
    public static final double BLACKROCK2030CASH = 0;
    public static final double BLACKROCK2040CASH = 0;
    public static final double BLACKROCK2050CASH = 0;
    public static final double BLACKROCK2060CASH = 0;

    public static final double[] BLACKROCKCashList = {
            BLACKROCK2020CASH,
            BLACKROCK2030CASH,
            BLACKROCK2040CASH,
            BLACKROCK2050CASH,
            BLACKROCK2060CASH,
    };


    public static final double BLACKROCK2020BOND = .5611;
    public static final double BLACKROCK2030BOND = .3153;
    public static final double BLACKROCK2040BOND = .112;
    public static final double BLACKROCK2050BOND = .0128;
    public static final double BLACKROCK2060BOND = .0181;

    public static final double[] BlackRockBondList = {
            BLACKROCK2020BOND,
            BLACKROCK2030BOND,
            BLACKROCK2040BOND,
            BLACKROCK2050BOND,
            BLACKROCK2060BOND,
    };


    public static final double BLACKROCK2020INTL = .1385;
    public static final double BLACKROCK2030INTL = .2451;
    public static final double BLACKROCK2040INTL = .3329;
    public static final double BLACKROCK2050INTL = .3793;
    public static final double BLACKROCK2060INTL = .3808;

    public static final double[] BlackRockIntlList = {
            BLACKROCK2020INTL,
            BLACKROCK2030INTL,
            BLACKROCK2040INTL,
            BLACKROCK2050INTL,
            BLACKROCK2060INTL,
    };




                            //////////////////////////////////// VANGUARD ////////////////////////////////////////
    public static final String VANGUARD_2020 = "https://investor.vanguard.com/mutual-funds/profile/performance/vtwnx";
    public static final String VANGUARD_2030 = "https://investor.vanguard.com/mutual-funds/profile/performance/vthrx";
    public static final String VANGUARD_2040 = "https://investor.vanguard.com/mutual-funds/profile/performance/vforx";
    public static final String VANGUARD_2050 = "https://investor.vanguard.com/mutual-funds/profile/performance/vfifx";
    public static final String VANGUARD_2060 = "https://investor.vanguard.com/mutual-funds/profile/performance/vttsx";

    public static final String[] VanguardList = {VANGUARD_2020,VANGUARD_2030,VANGUARD_2040,VANGUARD_2050,VANGUARD_2060};

    public static  final String[] VanguardYtdList = {
            "Vanguard2020BenchYtd",
            "Vanguard2030BenchYtd",
            "Vanguard2040BenchYtd",
            "Vanguard2050BenchYtd",
            "Vanguard2060BenchYtd",

    };

    public static  final String[] Vanguard1yrList = {
            "Vanguard2020Bench1Yr",
            "Vanguard2030Bench1Yr",
            "Vanguard2040Bench1Yr",
            "Vanguard2050Bench1Yr",
            "Vanguard2060Bench1Yr"
    };


    public static final double VANGUARD2020EQUITY = .313;
    public static final double VANGUARD2030EQUITY = .417;
    public static final double VANGUARD2040EQUITY = .503;
    public static final double VANGUARD2050EQUITY = .541;
    public static final double VANGUARD2060EQUITY = .541;

    public static final double[] VanguardEquityList = {
            VANGUARD2020EQUITY,
            VANGUARD2030EQUITY,
            VANGUARD2040EQUITY,
            VANGUARD2050EQUITY,
            VANGUARD2060EQUITY,

    };

    public static final double VANGUARD2020CASH = .065;
    public static final double VANGUARD2030CASH = 0;
    public static final double VANGUARD2040CASH = 0;
    public static final double VANGUARD2050CASH = 0;
    public static final double VANGUARD2060CASH = 0;

    public static final double[] VanguardCashList = {
            VANGUARD2020CASH,
            VANGUARD2030CASH,
            VANGUARD2040CASH,
            VANGUARD2050CASH,
            VANGUARD2060CASH,
    };

    public static final double VANGUARD2020BOND = .413;
    public static final double VANGUARD2030BOND = .308;
    public static final double VANGUARD2040BOND = .162;
    public static final double VANGUARD2050BOND = .1;
    public static final double VANGUARD2060BOND = .1;

    public static final double[] VanguardBondList = {
            VANGUARD2020BOND,
            VANGUARD2030BOND,
            VANGUARD2040BOND,
            VANGUARD2050BOND,
            VANGUARD2060BOND,
    };


    public static final double VANGUARD2020INTL = .209;
    public static final double VANGUARD2030INTL = .275;
    public static final double VANGUARD2040INTL = .335;
    public static final double VANGUARD2050INTL = .359;
    public static final double VANGUARD2060INTL = .359;

    public static final double[] VanguardIntlList = {
            VANGUARD2020INTL,
            VANGUARD2030INTL,
            VANGUARD2040INTL,
            VANGUARD2050INTL,
            VANGUARD2060INTL,
    };


                        ////////////////////////////// TROWE //////////////////////////////////////////

    public static final String TROWE_2020 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRBX#content-summary";
    public static final String TROWE_2030 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRCX#content-summary";
    public static final String TROWE_2040 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRDX#content-summary";
    public static final String TROWE_2050 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRMX#content-summary";
    public static final String TROWE_2060 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRLX#content-summary";

    public static final String[] TRoweList = {TROWE_2020,TROWE_2030,TROWE_2040,TROWE_2050,TROWE_2060};

    public static  final String[] TroweYtdList = {
            "TRowe2020BenchYtd",
            "TRowe2030BenchYtd",
            "TRowe2040BenchYtd",
            "TRowe2050BenchYtd",
            "TRowe2060BenchYtd",

    };

    public static  final String[] TRowe1yrList = {
            "TRowe2020Bench1Yr",
            "TRowe2030Bench1Yr",
            "TRowe2040Bench1Yr",
            "TRowe2050Bench1Yr",
            "TRowe2060Bench1Yr"
    };

    public static final double TROWE2020EQUITY = .377;
    public static final double TROWE2030EQUITY = .4773;
    public static final double TROWE2040EQUITY = .5487;
    public static final double TROWE2050EQUITY = .5708;
    public static final double TROWE2060EQUITY = .5743;

    public static final double[] TroweEquitylList = {
            TROWE2020EQUITY,
            TROWE2030EQUITY,
            TROWE2040EQUITY,
            TROWE2050EQUITY,
            TROWE2060EQUITY,

    };

    public static final double TROWE2020CASH = .005;
    public static final double TROWE2030CASH = .0093;
    public static final double TROWE2040CASH = .0014;
    public static final double TROWE2050CASH = .0176;
    public static final double TROWE2060CASH = .0149;

    public static final double[] TroweCashlList = {
            TROWE2020CASH,
            TROWE2030CASH,
            TROWE2040CASH,
            TROWE2050CASH,
            TROWE2060CASH,

    };

    public static final double TROWE2020BOND = .4284;
    public static final double TROWE2030BOND = .2629;
    public static final double TROWE2040BOND = .1428;
    public static final double TROWE2050BOND = .1028;
    public static final double TROWE2060BOND = .1018;

    public static final double[] TroweBondList = {
            TROWE2020BOND,
            TROWE2030BOND,
            TROWE2040BOND,
            TROWE2050BOND,
            TROWE2060BOND,

    };

    public static final double TROWE2020INTL = .1896;
    public static final double TROWE2030INTL = .2505;
    public static final double TROWE2040INTL = .2945;
    public static final double TROWE2050INTL = .3089;
    public static final double TROWE2060INTL = .3089;

    public static final double[] TroweIntlList = {
            TROWE2020INTL,
            TROWE2030INTL,
            TROWE2040INTL,
            TROWE2050INTL,
            TROWE2060INTL,

    };


                    ///////////////////////// JPMORAGAN /////////////////////////////////////////
    public static final String JPMORGAN_2020 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2020-fund-r6-46641u796#/performance";
    public static final String JPMORGAN_2030 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2030-fund-r6-46641u770#/performance";
    public static final String JPMORGAN_2040 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2040-fund-r6-46641u754#/performance";
    public static final String JPMORGAN_2050 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2050-fund-r6-46641u739#/performance";
    public static final String JPMORGAN_2060 = "https://am.jpmorgan.com/us/en/asset-management/gim/per/products/d/jpmorgan-smartretirement-2060-fund-r6-48127b565#/performance";

    public static final String[] JpMorganList = {JPMORGAN_2020,JPMORGAN_2030,JPMORGAN_2040,JPMORGAN_2050,JPMORGAN_2060};

    public static  final String[] JPMorganYtdList = {
            "JPMorgan2020BenchYtd",
            "JPMorgan2030BenchYtd",
            "JPMorgan2040BenchYtd",
            "JPMorgan2050BenchYtd",
            "JPMorgan2060BenchYtd",

    };

    public static  final String[] JPMorgan1yrList = {
            "JPMorgan2020Bench1Yr",
            "JPMorgan2030Bench1Yr",
            "JPMorgan2040Bench1Yr",
            "JPMorgan2050Bench1Yr",
            "JPMorgan2060Bench1Yr"
    };

    public static final double JPMORGAN2020EQUITY = .282;
    public static final double JPMORGAN2030EQUITY = .409;
    public static final double JPMORGAN2040EQUITY = .499;
    public static final double JPMORGAN2050EQUITY = .517;
    public static final double JPMORGAN2060EQUITY = .517;

    public static final double[] JpMorganEquityList = {
            JPMORGAN2020EQUITY,
            JPMORGAN2030EQUITY,
            JPMORGAN2040EQUITY,
            JPMORGAN2050EQUITY,
            JPMORGAN2060EQUITY,
    };

    public static final double JPMORGAN2020CASH = .02;
    public static final double JPMORGAN2030CASH = 0;
    public static final double JPMORGAN2040CASH = 0;
    public static final double JPMORGAN2050CASH = 0;
    public static final double JPMORGAN2060CASH = 0;

    public static final double[] JpMorganCashList = {
            JPMORGAN2020CASH,
            JPMORGAN2030CASH,
            JPMORGAN2040CASH,
            JPMORGAN2050CASH,
            JPMORGAN2060CASH,
    };


    public static final double JPMORGAN2020BOND = .484;
    public static final double JPMORGAN2030BOND = .297;
    public static final double JPMORGAN2040BOND = .152;
    public static final double JPMORGAN2050BOND = .125;
    public static final double JPMORGAN2060BOND = .125;

    public static final double[] JpMorganBondList = {
            JPMORGAN2020BOND,
            JPMORGAN2030BOND,
            JPMORGAN2040BOND,
            JPMORGAN2050BOND,
            JPMORGAN2060BOND,
    };

    public static final double JPMORGAN2020INTL = .214;
    public static final double JPMORGAN2030INTL = .295;
    public static final double JPMORGAN2040INTL = .349;
    public static final double JPMORGAN2050INTL = .359;
    public static final double JPMORGAN2060INTL = .359;

    public static final double[] JpMorganIntlList = {
            JPMORGAN2020INTL,
            JPMORGAN2030INTL,
            JPMORGAN2040INTL,
            JPMORGAN2050INTL,
            JPMORGAN2060INTL,
    };


                        ///////////////////////  MFS ////////////////////////////////
    public static final String MFS_2020 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFLKX-mfs-lifetime-2020-fund-share-R6.html#tab-overview";
    public static final String MFS_2030 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MLTKX-mfs-lifetime-reg-2030-fund.html#tab-overview";
    public static final String MFS_2040 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MLFKX-mfs-lifetime-reg-2040-fund.html#tab-overview";
    public static final String MFS_2050 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFFKX-mfs-lifetime-reg-2050-fund.html#tab-overview";
    public static final String MFS_2060 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFJKX-mfs-lifetime-reg-2060-fund.html#tab-overview";

    public static final String[] MFSList = {MFS_2020,MFS_2030,MFS_2040,MFS_2050,MFS_2060};

    public static  final String[] MFSYtdList = {
            "MFS2020BenchYtd",
            "MFS2030BenchYtd",
            "MFS2040BenchYtd",
            "MFS2050BenchYtd",
            "MFS2060BenchYtd",
    };

    public static  final String[] MFS1yrList = {
            "MFS2020Bench1Yr",
            "MFS2030Bench1Yr",
            "MFS2040Bench1Yr",
            "MFS2050Bench1Yr",
            "MFS2060Bench1Yr",

    };


    public static final double MFS2020EQUITY = .2613;
    public static final double MFS2030EQUITY = .5046;
    public static final double MFS2040EQUITY = .6444;
    public static final double MFS2050EQUITY = .67;
    public static final double MFS2060EQUITY = .67;

    public static final double[] MFSEquityList = {
            MFS2020EQUITY,
            MFS2030EQUITY,
            MFS2040EQUITY,
            MFS2050EQUITY,
            MFS2060EQUITY,
    };

    public static final double MFS2020CASH = .02;
    public static final double MFS2030CASH = 0;
    public static final double MFS2040CASH = 0;
    public static final double MFS2050CASH = 0;
    public static final double MFS2060CASH = 0;

    public static final double[] MFSCashList = {
            MFS2020CASH,
            MFS2030CASH,
            MFS2040CASH,
            MFS2050CASH,
            MFS2060CASH,
    };

    public static final double MFS2020BOND = .6807;
    public static final double MFS2030BOND = .3467;
    public static final double MFS2040BOND = .105;
    public static final double MFS2050BOND = .05;
    public static final double MFS2060BOND = .05;

    public static final double[] MFSBondList = {
            MFS2020BOND,
            MFS2030BOND,
            MFS2040BOND,
            MFS2050BOND,
            MFS2060BOND,
    };

    public static final double MFS2020INTL = .058;
    public static final double MFS2030INTL = .1487;
    public static final double MFS2040INTL = .2507;
    public static final double MFS2050INTL = .28;
    public static final double MFS2060INTL = .028;

    public static final double[] MFSIntlList = {
            MFS2020INTL,
            MFS2030INTL,
            MFS2040INTL,
            MFS2050INTL,
            MFS2060INTL,
    };

                        ///////////////////////// PIMCO (NO 2060 YET) /////////////////////////
    public static final String PIMCO_2020 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2020-fund/inst";
    public static final String PIMCO_2030 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2030-fund/inst";
    public static final String PIMCO_2040 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2040-fund/inst";
    public static final String PIMCO_2050 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2050-fund/inst";
    public static final String[] PimcoList = {PIMCO_2020,PIMCO_2030,PIMCO_2040,PIMCO_2050};

    public static  final String[] PIMCOYtdList = {
            "PIMCO2020BenchYtd",
            "PIMCO2030BenchYtd",
            "PIMCO2040BenchYtd",
            "PIMCO2050BenchYtd",
            "PIMCO2060BenchYtd",
    };

    public static  final String[] PIMCO1yrList = {
            "PIMCO2020Bench1Yr",
            "PIMCO2030Bench1Yr",
            "PIMCO2040Bench1Yr",
            "PIMCO2050Bench1Yr",
            "PIMCO2060Bench1Yr",

    };

    public static final double PIMCO2020EQUITY = .2777;
    public static final double PIMCO2030EQUITY = .407;
    public static final double PIMCO2040EQUITY = .5028;
    public static final double PIMCO2050EQUITY = .5515;

    public static final double[] PimcoEquityList = {
            PIMCO2020EQUITY,
            PIMCO2030EQUITY,
            PIMCO2040EQUITY,
            PIMCO2050EQUITY,

    };

    public static final double PIMCO2020CASH = 0;
    public static final double PIMCO2030CASH = 0;
    public static final double PIMCO2040CASH = 0;
    public static final double PIMCO2050CASH = 0;

    public static final double[] PimcoCashlist = {
            PIMCO2020CASH,
            PIMCO2030CASH,
            PIMCO2040CASH,
            PIMCO2050CASH,

    };

    public static final double PIMCO2020BOND = .5588;
    public static final double PIMCO2030BOND = .3739;
    public static final double PIMCO2040BOND = .2229;
    public static final double PIMCO2050BOND = .1393;

    public static final double[] PimcoBondList = {
            PIMCO2020BOND,
            PIMCO2030BOND,
            PIMCO2040BOND,
            PIMCO2050BOND,

    };

    public static final double PIMCO2020INTL = .1618;
    public static final double PIMCO2030INTL = .2193;
    public static final double PIMCO2040INTL = .2735;
    public static final double PIMCO2050INTL = .3047;

    public static final double[] PimcoIntlList = {
            PIMCO2020INTL,
            PIMCO2030INTL,
            PIMCO2040INTL,
            PIMCO2050INTL,

    };


                    ////////////////////////// TIAA //////////////////////////////////////

    public static final String TIAA_2020 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2020-fund?shareclass=Institutional";
    public static final String TIAA_2030 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2030-fund?shareclass=Institutional";
    public static final String TIAA_2040 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2040-fund?shareclass=Institutional";
    public static final String TIAA_2050 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2050-fund?shareclass=Institutional";
    public static final String TIAA_2060 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2060-fund?shareclass=Institutional";

    public static final String[] TIAAList = {TIAA_2020,TIAA_2030,TIAA_2040,TIAA_2050,TIAA_2060};

    public static  final String[] TIAAYtdList = {
            "TIAA2020BenchYtd",
            "TIAA2030BenchYtd",
            "TIAA2040BenchYtd",
            "TIAA2050BenchYtd",
            "TIAA2060BenchYtd",
    };

    public static  final String[] TIAA1yrList = {
            "TIAA2020Bench1Yr",
            "TIAA2030Bench1Yr",
            "TIAA2040Bench1Yr",
            "TIAA2050Bench1Yr",
            "TIAA2060Bench1Yr",

    };

    public static final double TIAA2020EQUITY = .377;
    public static final double TIAA2030EQUITY = .501;
    public static final double TIAA2040EQUITY = .625;
    public static final double TIAA2050EQUITY = .682;
    public static final double TIAA2060EQUITY = .696;

    public static final double[] TIAAEquityList = {
            TIAA2020EQUITY,
            TIAA2030EQUITY,
            TIAA2040EQUITY,
            TIAA2050EQUITY,
            TIAA2060EQUITY,

    };

    public static final double TIAA2020CASH = 0;
    public static final double TIAA2030CASH = 0;
    public static final double TIAA2040CASH = 0;
    public static final double TIAA2050CASH = 0;
    public static final double TIAA2060CASH = 0;

    public static final double[] TIAACashList = {
            TIAA2020CASH,
            TIAA2030CASH,
            TIAA2040CASH,
            TIAA2050CASH,
            TIAA2060CASH,

    };

    public static final double TIAA2020BOND = .477;
    public static final double TIAA2030BOND = .3;
    public static final double TIAA2040BOND = .121;
    public static final double TIAA2050BOND = .04;
    public static final double TIAA2060BOND = .015;

    public static final double[] TIAABondList = {
            TIAA2020BOND,
            TIAA2030BOND,
            TIAA2040BOND,
            TIAA2050BOND,
            TIAA2060BOND,

    };


    public static final double TIAA2020INTL = .144;
    public static final double TIAA2030INTL = .197;
    public static final double TIAA2040INTL = .251;
    public static final double TIAA2050INTL = .275;
    public static final double TIAA2060INTL = .281;

    public static final double[] TIAAIntlList = {
            TIAA2020INTL,
            TIAA2030INTL,
            TIAA2040INTL,
            TIAA2050INTL,
            TIAA2060INTL,

    };


                    ///////////////////////////// AllianzGI //////////////////////

    public static final String ALLIANZGI_2020 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2020-fund-r-aglrx";
    public static final String ALLIANZGI_2030 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2030-fund-r-ablrx";
    public static final String ALLIANZGI_2040 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2040-fund-r-avsrx";
    public static final String ALLIANZGI_2050 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2050-fund-r-asnrx";

    public static final String[] AllianzList = {ALLIANZGI_2020,ALLIANZGI_2030,ALLIANZGI_2040,ALLIANZGI_2050};

    public static  final String[] AllianzYtdList = {
            "Allianz2020BenchYtd",
            "Allianz2030BenchYtd",
            "Allianz2040BenchYtd",
            "Allianz2050BenchYtd",
            "Allianz2060BenchYtd",
    };

    public static  final String[] Allianz1yrList = {
            "Allianz2020Bench1Yr",
            "Allianz2030Bench1Yr",
            "Allianz2040Bench1Yr",
            "Allianz2050Bench1Yr",
            "Allianz2060Bench1Yr",

    };


    public static final double ALLIANZGI2020EQUITY = .283585;
    public static final double ALLIANZGI2030EQUITY = .341936;
    public static final double ALLIANZGI2040EQUITY = .26925;
    public static final double ALLIANZGI2050EQUITY = .238433;

    public static final double[] AllianzEquityList = {
           ALLIANZGI2020EQUITY,
           ALLIANZGI2030EQUITY,
           ALLIANZGI2040EQUITY,
           ALLIANZGI2050EQUITY,

    };


    public static final double ALLIANZGI2020CASH = .108829;
    public static final double ALLIANZGI2030CASH = .120809;
    public static final double ALLIANZGI2040CASH = .05279;
    public static final double ALLIANZGI2050CASH = .029816;

    public static final double[] AllianzCashList = {
            ALLIANZGI2020CASH,
            ALLIANZGI2030CASH,
            ALLIANZGI2040CASH,
            ALLIANZGI2050CASH,

    };

    public static final double ALLIANZGI2020BOND = .395362;
    public static final double ALLIANZGI2030BOND = .238355;
    public static final double ALLIANZGI2040BOND = .100695;
    public static final double ALLIANZGI2050BOND = .0485;

    public static final double[] AllianzBondList = {
            ALLIANZGI2020BOND,
            ALLIANZGI2030BOND,
            ALLIANZGI2040BOND,
            ALLIANZGI2050BOND,

    };

    public static final double ALLIANZGI2020INTL = .160819;
    public static final double ALLIANZGI2030INTL = .248817;
    public static final double ALLIANZGI2040INTL = .530495;
    public static final double ALLIANZGI2050INTL = .637114;

    public static final double[] AllianzIntlList = {
            ALLIANZGI2020INTL,
            ALLIANZGI2030INTL,
            ALLIANZGI2040INTL,
            ALLIANZGI2050INTL,

    };













}
