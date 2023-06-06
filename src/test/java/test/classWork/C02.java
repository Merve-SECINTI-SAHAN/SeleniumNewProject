package test.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        //ödev : 2
        //NavigationMethods

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Youtube ana sayfasina gidelim . https://www.youtube.com/
       driver.get("https://www.youtube.com/");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Tekrar YouTube'sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();


        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();


    }
}
