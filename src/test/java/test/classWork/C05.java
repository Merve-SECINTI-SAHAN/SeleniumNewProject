package test.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Yeni bir class olusturalim (Homework)

       //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
         //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle=driver.getTitle();
        String expectedTitleFacebook="facebook";


       // Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.

        String actualUrl=driver.getCurrentUrl();

        String expectedWord="facebook";
        System.out.println("expectedWord = " + expectedWord);
        if (actualUrl.contains(expectedWord)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("actualUrl = " + actualUrl);
        }
        /*
        https://www.walmart.com/ sayfasina gidin.*/
        driver.get("https://www.walmart.com");


        /*
        Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        */
        String actualWallMartTitle=driver.getTitle();
        String expectedContainsWallMartTitle="Walmart.com";
        if (actualWallMartTitle.contains(expectedContainsWallMartTitle)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        /*
        Tekrar "facebook" sayfasina donun*/
        driver.navigate().back();
        /*
        Sayfayi yenileyin*/
        driver.navigate().refresh();
        /*
        Sayfayi tam sayfa (maximize) yapin  9.Browser'i kapatin
         */
        driver.manage().window().maximize();
        driver.close();

    }
}