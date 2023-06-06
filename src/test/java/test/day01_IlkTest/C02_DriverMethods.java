package test.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver();  //Chrome türünde yeni bir obje oluşturduk.

        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfa Başlığı: "+driver.getTitle()); //getTitle(), sayfa başlığını verir
        System.out.println( "Amazon Sayfa URL: "+ driver.getCurrentUrl());

        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHandle);

        driver.get("https://techproeducation.com"); // --> String olarak girilen url'ye gider
        System.out.println("Techproeducation Sayfa Başlığı: "+driver.getTitle());  //İçinde olunan sayfanın başlığını String olarak getirir
        System.out.println( "Techproeducation Sayfa URL: "+ driver.getCurrentUrl()); //İçinde bulunduğu sayfanın URLsini verir


        //System.out.println(driver.getPageSource()); //İçinde olunan sayfanın kaynak kodlarını String olarak verir.
        //Bilerek yoruma aldık çünkü her çalıştırdığımızda konsola bütün kaynak kodlarını yazdırır.

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window handle değeri: "+driver.getWindowHandle());

        //System.out.println(driver.getWindowHandles());


    }
}
