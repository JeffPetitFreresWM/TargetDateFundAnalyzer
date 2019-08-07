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

    public static final double BLACKROCK2020EQUITY = .2938;
    public static final double BLACKROCK2030EQUITY = .4379;
    public static final double BLACKROCK2040EQUITY = .5531;
    public static final double BLACKROCK2050EQUITY = .6041;
    public static final double BLACKROCK2060EQUITY = .6052;

    public static final double BLACKROCK2020CASH = 0;
    public static final double BLACKROCK2030CASH = 0;
    public static final double BLACKROCK2040CASH = 0;
    public static final double BLACKROCK2050CASH = 0;
    public static final double BLACKROCK2060CASH = 0;

    public static final double BLACKROCK2020BOND = .5611;
    public static final double BLACKROCK2030BOND = .3153;
    public static final double BLACKROCK2040BOND = .112;
    public static final double BLACKROCK2050BOND = .0128;
    public static final double BLACKROCK2060BOND = .0181;

    public static final double BLACKROCK2020INTL = .1385;
    public static final double BLACKROCK2030INTL = .2451;
    public static final double BLACKROCK2040INTL = .3329;
    public static final double BLACKROCK2050INTL = .3793;
    public static final double BLACKROCK2060INTL = .3808;






                            //////////////////////////////////// VANGUARD ////////////////////////////////////////
    public static final String VANGUARD_2020 = "https://investor.vanguard.com/mutual-funds/profile/performance/vtwnx";
    public static final String VANGUARD_2030 = "https://investor.vanguard.com/mutual-funds/profile/performance/vthrx";
    public static final String VANGUARD_2040 = "https://investor.vanguard.com/mutual-funds/profile/performance/vforx";
    public static final String VANGUARD_2050 = "https://investor.vanguard.com/mutual-funds/profile/performance/vfifx";
    public static final String VANGUARD_2060 = "https://investor.vanguard.com/mutual-funds/profile/performance/vttsx";

    public static final String[] VanguardList = {VANGUARD_2020,VANGUARD_2030,VANGUARD_2040,VANGUARD_2050,VANGUARD_2060};


    public static final double VANGUARD2020EQUITY = .313;
    public static final double VANGUARD2030EQUITY = .417;
    public static final double VANGUARD2040EQUITY = .503;
    public static final double VANGUARD2050EQUITY = .541;
    public static final double VANGUARD2060EQUITY = .541;

    public static final double VANGUARD2020CASH = .065;
    public static final double VANGUARD2030CASH = 0;
    public static final double VANGUARD2040CASH = 0;
    public static final double VANGUARD2050CASH = 0;
    public static final double VANGUARD2060CASH = 0;

    public static final double VANGUARD2020BOND = .413;
    public static final double VANGUARD2030BOND = .308;
    public static final double VANGUARD2040BOND = .162;
    public static final double VANGUARD2050BOND = .1;
    public static final double VANGUARD2060BOND = .1;

    public static final double VANGUARD2020INTL = .209;
    public static final double VANGUARD2030INTL = .275;
    public static final double VANGUARD2040INTL = .335;
    public static final double VANGUARD2050INTL = .359;
    public static final double VANGUARD2060INTL = .359;



                        ////////////////////////////// TROWE //////////////////////////////////////////

    public static final String TROWE_2020 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRBX#content-summary";
    public static final String TROWE_2030 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRCX#content-summary";
    public static final String TROWE_2040 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRDX#content-summary";
    public static final String TROWE_2050 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRMX#content-summary";
    public static final String TROWE_2060 = "https://www.troweprice.com/personal-investing/tools/fund-research/TRRLX#content-summary";

    public static final double TROWE2020EQUITY = .377;
    public static final double TROWE2030EQUITY = .4773;
    public static final double TROWE2040EQUITY = .5487;
    public static final double TROWE2050EQUITY = .5708;
    public static final double TROWE2060EQUITY = .5743;

    public static final double TROWE2020CASH = .005;
    public static final double TROWE2030CASH = .0093;
    public static final double TROWE2040CASH = .0014;
    public static final double TROWE2050CASH = .0176;
    public static final double TROWE2060CASH = .0149;

    public static final double TROWE2020BOND = .4284;
    public static final double TROWE2030BOND = .2629;
    public static final double TROWE2040BOND = .1428;
    public static final double TROWE2050BOND = .1028;
    public static final double TROWE2060BOND = .1018;

    public static final double TROWE2020INTL = .1896;
    public static final double TROWE2030INTL = .2505;
    public static final double TROWE2040INTL = .2945;
    public static final double TROWE2050INTL = .3089;
    public static final double TROWE2060INTL = .3089;


                    ///////////////////////// JPMORAGAN /////////////////////////////////////////
    public static final String JPMORGAN_2020 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2020-fund-r6-46641u796#/performance";
    public static final String JPMORGAN_2030 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2030-fund-r6-46641u770#/performance";
    public static final String JPMORGAN_2040 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2040-fund-r6-46641u754#/performance";
    public static final String JPMORGAN_2050 = "https://am.jpmorgan.com/us/en/asset-management/gim/adv/products/d/jpmorgan-smartretirement-2050-fund-r6-46641u739#/performance";
    public static final String JPMORGAN_2060 = "https://am.jpmorgan.com/us/en/asset-management/gim/per/products/d/jpmorgan-smartretirement-2060-fund-r6-48127b565#/performance";

    public static final double JPMORGAN2020EQUITY = .282;
    public static final double JPMORGAN2030EQUITY = .409;
    public static final double JPMORGAN2040EQUITY = .499;
    public static final double JPMORGAN2050EQUITY = .517;
    public static final double JPMORGAN2060EQUITY = .517;

    public static final double JPMORGAN2020CASH = .02;
    public static final double JPMORGAN2030CASH = 0;
    public static final double JPMORGAN2040CASH = 0;
    public static final double JPMORGAN2050CASH = 0;
    public static final double JPMORGAN2060CASH = 0;

    public static final double JPMORGAN2020BOND = .484;
    public static final double JPMORGAN2030BOND = .297;
    public static final double JPMORGAN2040BOND = .152;
    public static final double JPMORGAN2050BOND = .125;
    public static final double JPMORGAN2060BOND = .125;

    public static final double JPMORGAN2020INTL = .214;
    public static final double JPMORGAN2030INTL = .295;
    public static final double JPMORGAN2040INTL = .349;
    public static final double JPMORGAN2050INTL = .359;
    public static final double JPMORGAN2060INTL = .359;


                        ///////////////////////  MFS ////////////////////////////////
    public static final String MFS_2020 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFLKX-mfs-lifetime-2020-fund-share-R6.html#tab-overview";
    public static final String MFS_2030 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MLTKX-mfs-lifetime-reg-2030-fund.html#tab-overview";
    public static final String MFS_2040 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MLFKX-mfs-lifetime-reg-2040-fund.html#tab-overview";
    public static final String MFS_2050 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFFKX-mfs-lifetime-reg-2050-fund.html#tab-overview";
    public static final String MFS_2060 = "https://www.mfs.com/en-us/individual-investor/product-strategies/mutual-funds/MFJKX-mfs-lifetime-reg-2060-fund.html#tab-overview";

    public static final double MFS2020EQUITY = .2613;
    public static final double MFS2030EQUITY = .5046;
    public static final double MFS2040EQUITY = .6444;
    public static final double MFS2050EQUITY = .67;
    public static final double MFS2060EQUITY = .67;

    public static final double MFS2020CASH = .02;
    public static final double MFS2030CASH = 0;
    public static final double MFS2040CASH = 0;
    public static final double MFS2050CASH = 0;
    public static final double MFS2060CASH = 0;

    public static final double MFS2020BOND = .6807;
    public static final double MFS2030BOND = .3467;
    public static final double MFS2040BOND = .105;
    public static final double MFS2050BOND = .05;
    public static final double MFS2060BOND = .05;

    public static final double MFS2020INTL = .058;
    public static final double MFS2030INTL = .1487;
    public static final double MFS2040INTL = .2507;
    public static final double MFS2050INTL = .28;
    public static final double MFS2060INTL = .028;

                        ///////////////////////// PIMCO (NO 2060 YET) /////////////////////////
    public static final String PIMCO_2020 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2020-fund/inst";
    public static final String PIMCO_2030 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2030-fund/inst";
    public static final String PIMCO_2040 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2040-fund/inst";
    public static final String PIMCO_2050 = "https://www.pimco.com/en-us/investments/mutual-funds/realpath-blend-2050-fund/inst";

    public static final double PIMCO2020EQUITY = .2777;
    public static final double PIMCO2030EQUITY = .407;
    public static final double PIMCO2040EQUITY = .5028;
    public static final double PIMCO2050EQUITY = .5515;

    public static final double PIMCO2020CASH = 0;
    public static final double PIMCO2030CASH = 0;
    public static final double PIMCO2040CASH = 0;
    public static final double PIMCO2050CASH = 0;

    public static final double PIMCO2020BOND = .5588;
    public static final double PIMCO2030BOND = .3739;
    public static final double PIMCO2040BOND = .2229;
    public static final double PIMCO2050BOND = .1393;

    public static final double PIMCO2020INTL = .1618;
    public static final double PIMCO2030INTL = .2193;
    public static final double PIMCO2040INTL = .2735;
    public static final double PIMCO2050INTL = .3047;


                    ////////////////////////// TIAA //////////////////////////////////////

    public static final String TIAA_2020 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2020-fund?shareclass=Institutional";
    public static final String TIAA_2030 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2030-fund?shareclass=Institutional";
    public static final String TIAA_2040 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2040-fund?shareclass=Institutional";
    public static final String TIAA_2050 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2050-fund?shareclass=Institutional";
    public static final String TIAA_2060 = "https://www.nuveen.com/mutual-funds/tiaa-cref-lifecycle-2060-fund?shareclass=Institutional";

    public static final double TIAA2020EQUITY = .377;
    public static final double TIAA2030EQUITY = .501;
    public static final double TIAA2040EQUITY = .625;
    public static final double TIAA2050EQUITY = .682;
    public static final double TIAA2060EQUITY = .696;

    public static final double TIAA2020CASH = 0;
    public static final double TIAA2030CASH = 0;
    public static final double TIAA2040CASH = 0;
    public static final double TIAA2050CASH = 0;
    public static final double TIAA2060CASH = 0;

    public static final double TIAA2020BOND = .477;
    public static final double TIAA2030BOND = .3;
    public static final double TIAA2040BOND = .121;
    public static final double TIAA2050BOND = .04;
    public static final double TIAA2060BOND = .015;


    public static final double TIAA2020INTL = .144;
    public static final double TIAA2030INTL = .197;
    public static final double TIAA2040INTL = .251;
    public static final double TIAA2050INTL = .275;
    public static final double TIAA2060INTL = .281;


                    ///////////////////////////// AllianzGI //////////////////////

    public static final String ALLIANZGI_2020 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2020-fund-r-aglrx";
    public static final String ALLIANZGI_2030 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2030-fund-r-ablrx";
    public static final String ALLIANZGI_2040 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2040-fund-r-avsrx";
    public static final String ALLIANZGI_2050 = "https://us.allianzgi.com/en-us/products-solutions/mutual-funds/allianzgi-retirement-2050-fund-r-asnrx";


    public static final double ALLIANZGI2020EQUITY = .283585;
    public static final double ALLIANZGI2030EQUITY = .341936;
    public static final double ALLIANZGI2040EQUITY = .26925;
    public static final double ALLIANZGI2050EQUITY = .238433;

    public static final double ALLIANZGI2020CASH = .108829;
    public static final double ALLIANZGI2030CASH = .120809;
    public static final double ALLIANZGI2040CASH = .05279;
    public static final double ALLIANZGI2050CASH = .029816;

    public static final double ALLIANZGI2020BOND = .395362;
    public static final double ALLIANZGI2030BOND = .238355;
    public static final double ALLIANZGI2040BOND = .100695;
    public static final double ALLIANZGI2050BOND = .0485;

    public static final double ALLIANZGI2020INTL = .160819;
    public static final double ALLIANZGI2030INTL = .248817;
    public static final double ALLIANZGI2040INTL = .530495;
    public static final double ALLIANZGI2050INTL = .637114;













}
