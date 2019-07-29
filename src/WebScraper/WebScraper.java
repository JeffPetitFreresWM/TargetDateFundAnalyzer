package WebScraper;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static WebScraper.Constants.*;
import static WebScraper.Constants.TROWE_2060;


public class WebScraper {
    /**
     * Finds the necessary data on the web page and calculates the performances
     *
     * @param args
     */

    // setting headless mode to true.. so there isn't any ui
    ChromeOptions chrome_options = new ChromeOptions();

    WebDriver driver;


    public void WebScraper() {


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

    }

    public void setDriver(){
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        this.driver = new ChromeDriver(chrome_options);

    }




    public Float[] getAmericanCentury(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float ytd[] = new Float[2];
        switch (year) {

            case (AMERICAN_CENTURY_2020):
                drive.get(AMERICAN_CENTURY_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(drive.findElement(By.id("perfTRYTD")).getText());
                ytd[1] = Float.parseFloat(drive.findElement(By.id("perfTR1Yr")).getText());
                System.out.println("Getting 2020");
                drive.quit();
                return ytd;

            case (AMERICAN_CENTURY_2030):
                drive.get(AMERICAN_CENTURY_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(drive.findElement(By.id("perfTRYTD")).getText());
                ytd[1] = Float.parseFloat(drive.findElement(By.id("perfTR1Yr")).getText());
                System.out.println("Getting 2030");
                drive.quit();

                return ytd;


            case (AMERICAN_CENTURY_2040):
                drive.get(AMERICAN_CENTURY_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(drive.findElement(By.id("perfTRYTD")).getText());
                ytd[1] = Float.parseFloat(drive.findElement(By.id("perfTR1Yr")).getText());
                System.out.println("Getting 2040");
                drive.quit();

                return ytd;

            case (AMERICAN_CENTURY_2050):
                drive.get(AMERICAN_CENTURY_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(drive.findElement(By.id("perfTRYTD")).getText());
                ytd[1] = Float.parseFloat(drive.findElement(By.id("perfTR1Yr")).getText());
                System.out.println("Getting 2050");
                drive.quit();

                return ytd;

            case (AMERICAN_CENTURY_2060):
                drive.get(AMERICAN_CENTURY_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(drive.findElement(By.id("perfTRYTD")).getText());
                ytd[1] = Float.parseFloat(drive.findElement(By.id("perfTR1Yr")).getText());
                drive.quit();

                return ytd;


            default:
                return ytd;

        }


    }

    /**
     * Gets the blackrock information. 'info' in this method is as follows: info[yearToDate, oneYear]
     *
     * @param year
     * @return
     */
    public Float[] getBlackRock(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (BLACKROCK_2020):

                drive.get(BLACKROCK_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                drive.quit();
                return info;

            case (BLACKROCK_2030):

                drive.get(BLACKROCK_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                drive.quit();
                return info;


            case (BLACKROCK_2040):

                drive.get(BLACKROCK_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                drive.quit();
                return info;

            case (BLACKROCK_2050):

                drive.get(BLACKROCK_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));

                return info;

            case (BLACKROCK_2060):

                drive.get(BLACKROCK_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = drive.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                drive.quit();
                return info;


            default:
                return info;

        }


    }

    public Float[] getVanguard(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (VANGUARD_2020):

                drive.get(VANGUARD_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                drive.quit();
                return info;

            case (VANGUARD_2030):

                drive.get(VANGUARD_2030);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                drive.quit();
                return info;


            case (VANGUARD_2040):

                drive.get(VANGUARD_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;

            case (VANGUARD_2050):

                drive.get(VANGUARD_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                drive.quit();
                return info;

            case (VANGUARD_2060):

                drive.get(VANGUARD_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                drive.quit();
                return info;


            default:
                return info;

        }



    }


    public Float[] getTrowe(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (TROWE_2020):

                drive.get(TROWE_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();

                return info;

            case (TROWE_2030):

                drive.get(TROWE_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (TROWE_2040):

                drive.get(TROWE_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (TROWE_2050):

                drive.get(TROWE_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (TROWE_2060):

                drive.get(TROWE_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"content-summary\"]/div[2]/div[3]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            default:
                return info;

        }


    }

    public Float[] getJPMorgan(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (JPMORGAN_2020):

                drive.get(JPMORGAN_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"performance\"]/div/div")));
                yearToDate = drive.findElement(By.id("ytd-percentage"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"performance\"]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[2]/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (JPMORGAN_2030):

                drive.get(JPMORGAN_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"performance\"]/div/div")));
                yearToDate = drive.findElement(By.id("ytd-percentage"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"performance\"]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[2]/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (JPMORGAN_2040):

                drive.get(JPMORGAN_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"performance\"]/div/div")));
                yearToDate = drive.findElement(By.id("ytd-percentage"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"performance\"]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[2]/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();

                return info;

            case (JPMORGAN_2050):

                drive.get(JPMORGAN_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"performance\"]/div/div")));
                yearToDate = drive.findElement(By.id("ytd-percentage"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"performance\"]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[2]/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (JPMORGAN_2060):

                drive.get(JPMORGAN_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"performance\"]/div/div")));
                yearToDate = drive.findElement(By.id("ytd-percentage"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"performance\"]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[2]/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            default:
                return info;

        }


    }

    public Float[] getPIMCO(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (PIMCO_2020):

                drive.get(PIMCO_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/section[6]/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"main\"]/section[6]/div/table/tbody/tr[2]/td[4]"));
                System.out.println(yearToDate.getAttribute("innerText"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"ProductPerformance0\"]/div[1]/div[1]/div/div[3]/table/tbody/tr/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (PIMCO_2030):

                drive.get(PIMCO_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/section[6]/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"main\"]/section[6]/div/table/tbody/tr[2]/td[4]"));
                System.out.println(yearToDate.getAttribute("innerText"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"ProductPerformance0\"]/div[1]/div[1]/div/div[3]/table/tbody/tr/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (PIMCO_2040):

                drive.get(PIMCO_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/section[6]/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"main\"]/section[6]/div/table/tbody/tr[2]/td[4]"));
                System.out.println(yearToDate.getAttribute("innerText"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"ProductPerformance0\"]/div[1]/div[1]/div/div[3]/table/tbody/tr/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (PIMCO_2050):

                drive.get(PIMCO_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/section[6]/div")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"main\"]/section[6]/div/table/tbody/tr[2]/td[4]"));
                System.out.println(yearToDate.getAttribute("innerText"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"ProductPerformance0\"]/div[1]/div[1]/div/div[3]/table/tbody/tr/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            default:
                return null;

        }


    }

    public Float[] getTiaa(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (TIAA_2020):

                drive.get(TIAA_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/h3")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[2]/div/span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[5]/div/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (TIAA_2030):

                drive.get(TIAA_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/h3")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[2]/div/span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[5]/div/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (TIAA_2040):

                drive.get(TIAA_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/h3")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[2]/div/span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[5]/div/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (TIAA_2050):

                drive.get(TIAA_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/h3")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[2]/div/span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[5]/div/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (TIAA_2060):

                drive.get(TIAA_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/h3")));
                yearToDate = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[2]/div/span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.xpath("//*[@id=\"table_average_annual_total_returns__6_1\"]/tbody/tr[1]/td[5]/div/span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            default:
                return info;

        }


    }
    public Float[] getMFS(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (MFS_2020):

                drive.get(MFS_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"highcharts-0h4qjc2-0\"]/div[2]/span[1]/div[2]")));
                yearToDate = drive.findElement(By.cssSelector("#highcharts-0h4qjc2-0 > div.highcharts-axis-labels.highcharts-xaxis-labels > span:nth-child(1) > div:nth-child(2)"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#highcharts-0h4qjc2-0 > div.highcharts-axis-labels.highcharts-xaxis-labels > span:nth-child(2) > div:nth-child(2)"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (ALLIANZGI_2030):

                drive.get(ALLIANZGI_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (ALLIANZGI_2040):

                drive.get(ALLIANZGI_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (ALLIANZGI_2050):

                drive.get(ALLIANZGI_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;



            default:
                return info;

        }


    }

    public Float[] getAllianz(String year) {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (ALLIANZGI_2020):

                drive.get(ALLIANZGI_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (ALLIANZGI_2030):

                drive.get(ALLIANZGI_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;


            case (ALLIANZGI_2040):

                drive.get(ALLIANZGI_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;

            case (ALLIANZGI_2050):

                drive.get(ALLIANZGI_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Performance\"]/div[2]/div/div/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/span")));
                yearToDate = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div.l-grid__column-large-5.l-grid__column-medium-6.offset-large-1 > table > tbody > tr:nth-child(5) > td:nth-child(2) > span"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }
                else {
                    info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                }
                oneYear = drive.findElement(By.cssSelector("#Performance > div.fund-component.distribution-fund-details > div > div > div.key-facts-content > div > div > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > span"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }
                else{
                    info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                }
                drive.quit();
                return info;



            default:
                return info;

        }


    }

    public Float[] getBenchmarkEquity() {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        System.out.println("Getting equity");
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float[] info = new Float[2];
        drive.get(EQUITY);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));

        yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[3]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }
        drive.quit();

        return info;


    }

    public Float[] getBenchmarkInternational() {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        System.out.println("Getting international");
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float[] info = new Float[2];
        drive.get(INTERNATIONAL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[3]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }
        drive.quit();

        return info;
    }

    public Float[] getBenchmarkBond() {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(drive, 10);
        System.out.println("Getting bond");
        Float[] info = new Float[2];
        drive.get(BOND);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[3]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }
        drive.quit();


        return info;

    }

    public Float[] getBenchmarkCash() {
        chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        WebDriver drive = new ChromeDriver(chrome_options);
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(drive, 10);
        Float[] info = new Float[2];
        drive.get(CASH);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[3]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = drive.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[4]/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }
        drive.quit();

        return info;

    }


    public boolean percentage(String string) {
        return string.charAt(string.length() - 1) == '%';
    }

    public String format(String string) {
        return string.substring(0, string.length() - 1);
    }
    public void close(){
        driver.quit();
    }


    public static void main(String[] args)  {

        WebScraper scraper = new WebScraper();
        scraper.setDriver();
        Float[] performanceInfo = scraper.getMFS(MFS_2020);
//        Float[] bond = scraper.getBenchmarkBond();
//        Float[] equity = scraper.getBenchmarkEquity();
//        Float[] cash = scraper.getBenchmarkCash();
//        Float[] international = scraper.getBenchmarkInternational();
        System.out.println("YTD: "+ performanceInfo[0]);
        System.out.println("One year: " + performanceInfo[1]);
//        System.out.println("ALL BENCHMARKS"+bond[0]);
//        System.out.println("ALL BENCHMARKS"+bond[1]);
//        System.out.println("ALL BENCHMARKS"+cash[0]);
//        System.out.println("ALL BENCHMARKS"+cash[1]);
//        System.out.println("ALL BENCHMARKS"+equity[0]);
//        System.out.println("ALL BENCHMARKS"+equity[1]);
//        System.out.println("ALL BENCHMARKS"+international[0]);
//        System.out.println("ALL BENCHMARKS"+international[1]);
        scraper.close();

    }
}