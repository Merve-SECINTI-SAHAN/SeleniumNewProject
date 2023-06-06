package test.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Yeni bir package olusturalim : day01
        //Yeni bir class olusturalim : C03_GetMethods

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle= "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        } else
            System.out.println("Test FAILED" + actualTitle);

        //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actuaclUrl= driver.getCurrentUrl();
        String expectedUrl="amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        } else
            System.out.println("Test FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualHtml= driver.getPageSource();
        String expectedHtml= "Gateway";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        //Sayfayi kapatin.
        driver.close();
    }


}
