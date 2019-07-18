package WebScraper;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.lang.model.element.Element;

import static WebScraper.Constants.*;


public class WebScraper {
    /**
     * Finds the necessary data on the web page and calculates the performances
     *
     * @param args
     */

    // setting headless mode to true.. so there isn't any ui

    WebDriver driver = new ChromeDriver();

    public void WebScraper() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }




    public Float[] getAmericanCentury(String year) {
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float ytd[] = new Float[2];
        switch (year) {

            case (AMERICAN_CENTURY_2020):
                this.driver.get(AMERICAN_CENTURY_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTRYTD']")).getText());
                ytd[1] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTR1Yr']")).getText());

                return ytd;

            case (AMERICAN_CENTURY_2030):
                this.driver.get(AMERICAN_CENTURY_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTRYTD']")).getText());
                ytd[1] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTR1Yr']")).getText());

                return ytd;


            case (AMERICAN_CENTURY_2040):
                this.driver.get(AMERICAN_CENTURY_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTRYTD']")).getText());
                ytd[1] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTR1Yr']")).getText());

                return ytd;

            case (AMERICAN_CENTURY_2050):
                this.driver.get(AMERICAN_CENTURY_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTRYTD']")).getText());
                ytd[1] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTR1Yr']")).getText());

                return ytd;

            case (AMERICAN_CENTURY_2060):
                this.driver.get(AMERICAN_CENTURY_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfTRYTD")));
                ytd[0] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTRYTD']")).getText());
                ytd[1] = Float.parseFloat(this.driver.findElement(By.xpath("//td[@id='perfTR1Yr']")).getText());

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
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (BLACKROCK_2020):

                this.driver.get(BLACKROCK_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));

                return info;

            case (BLACKROCK_2030):

                this.driver.get(BLACKROCK_2030);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));

                return info;


            case (BLACKROCK_2040):

                this.driver.get(BLACKROCK_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));

                return info;

            case (BLACKROCK_2050):

                this.driver.get(BLACKROCK_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));

                return info;

            case (BLACKROCK_2060):

                this.driver.get(BLACKROCK_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='performanceTabs']")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[2]"));
                info[0] = Float.parseFloat(yearToDate.getAttribute("innerText"));
                oneYear = this.driver.findElement(By.xpath("//*[@id=\"cumulativeTabs\"]/div[2]/div/table/tbody/tr[1]/td[5]"));
                info[1] = Float.parseFloat(oneYear.getAttribute("innerText"));
                return info;


            default:
                return info;

        }


    }

    public Float[] getVanguard(String year) {
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float info[] = new Float[2];
        WebElement yearToDate;
        WebElement oneYear;
        switch (year) {

            case (VANGUARD_2020):

                this.driver.get(VANGUARD_2020);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;

            case (VANGUARD_2030):

                this.driver.get(VANGUARD_2030);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;


            case (VANGUARD_2040):

                this.driver.get(VANGUARD_2040);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;

            case (VANGUARD_2050):

                this.driver.get(VANGUARD_2050);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;

            case (VANGUARD_2060):

                this.driver.get(VANGUARD_2060);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
                yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
                if (this.percentage(yearToDate.getAttribute("innerText"))) {
                    info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
                }

                oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
                if (this.percentage(oneYear.getAttribute("innerText"))) {
                    info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
                }

                return info;


            default:
                return info;

        }


    }

    public Float[] getBenchmarkEquity() {
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float[] info = new Float[2];
        this.driver.get(EQUITY);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }

        return info;


    }

    public Float[] getBenchmarkInternational() {
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float[] info = new Float[2];
        this.driver.get(INTERNATIONAL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }

        return info;
    }

    public Float[] getBenchmarkBond() {
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float[] info = new Float[2];
        this.driver.get(BOND);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[5]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }

        return info;

    }

    public Float[] getBenchmarkCash() {
        WebElement yearToDate;
        WebElement oneYear;
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        Float[] info = new Float[2];
        this.driver.get(CASH);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]")));
        yearToDate = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[6]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(yearToDate.getAttribute("innerText"))) {
            info[0] = Float.parseFloat(format(yearToDate.getAttribute("innerText")));
        }

        oneYear = this.driver.findElement(By.xpath("//*[@id=\"displayPerformanceHomePage\"]/div[4]/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
        if (this.percentage(oneYear.getAttribute("innerText"))) {
            info[1] = Float.parseFloat(format(oneYear.getAttribute("innerText")));
        }

        return info;

    }


    public boolean percentage(String string) {
        return string.charAt(string.length() - 1) == '%';
    }

    public String format(String string) {
        return string.substring(0, string.length() - 2);
    }
    public void close(){
        driver.close();
    }


    public static void main(String[] args) throws Exception {

        WebScraper scraper = new WebScraper();
        Float[] performanceInfo = scraper.getAmericanCentury(AMERICAN_CENTURY_2020);
        Float[] blackrockinfo = scraper.getBenchmarkBond();
        System.out.println("YTD: "+ performanceInfo[0]);
        System.out.println("One year: " + performanceInfo[1]);
        System.out.println("Blackrock 1 year" + blackrockinfo[0]);
        scraper.close();

    }
}