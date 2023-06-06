package test.day03_Locators_NT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasın gidelim
        driver.get("https://amazon.com");

        //Arama kutusuna Iphone yazdıralım ve aratalım
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramaKutusu.submit();//Keys.ENTER




        //Sayfayı kapatalım
        driver.close();
    }
}
