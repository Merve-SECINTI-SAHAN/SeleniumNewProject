package test.day03_Locators_NT;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasın gidelim
        driver.get("https://amazon.com");

        //Arama kutusunu locate edelim
       //Arama kutusuna Iphone yazdıralım ve aratalım

        /*
        Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
        Webelement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        1-Locate işlemi bittikten sonra webelemente bir metin göndereceksek sendKeys() methodu kullanırız.
        2-Webelement'e tıklayacaksak click() methodu kullanırız
        3-Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
        4-sendKeys()methodundan sonra (yani Webelemente metin gönderdikten sonra ) Keys.ENTER ile ya da
        submit() methodu ile manuel olarak enter  yaptığımız gibi otomasyonda da yapabiliriz.
         */

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);

      //Sayfayı kapatalım
        driver.close();

    }
}
