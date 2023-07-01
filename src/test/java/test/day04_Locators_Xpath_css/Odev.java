package test.day04_Locators_Xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
       WebElement reklam= driver.findElement(By.className("eicon-close]"));
       reklam.click();


        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("//input[@id='elementor-search-form-9f26725']")).sendKeys("qa", Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualTitle= driver.getTitle();
        String expectedTitle="qa";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }
        System.out.println(actualTitle);

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
WebElement linkGorunEris= driver.findElement(By.xpath("//a[normalize-space()='Career Opportunities In QA']"));
        System.out.println(linkGorunEris.isDisplayed());
        System.out.println(linkGorunEris.isEnabled());

        //Carrer Opportunities In QA linkine tıklayalım
        WebElement linkGorunEris2= driver.findElement(By.xpath("//a[normalize-space()='Career Opportunities In QA']"));
linkGorunEris2.click();

        //Başlığın Opportunities içerdiğini test edelim
        String actualTitle2= driver.getTitle();
        String expectedTitle2= "Opportunities";
        if (actualTitle.contains(expectedTitle2)){
            System.out.println("Test PASSED");
        } else System.out.println(actualTitle2);


        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım



    }

   }
