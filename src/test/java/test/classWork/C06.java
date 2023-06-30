package test.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle= "youtube";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED: "+ actualTitle);



        //Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualURL= driver.getCurrentUrl();
        String expectedUrl = "youtube";

        if (actualURL.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println(actualURL);



        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Youtube sayfasina geri donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().forward();

        //Sayfayi tamsayfa yapin
       driver.manage().window().maximize();


        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon= driver.getTitle();
        String expectedTitleAmazon="Amazon";

        if (actualTitleAmazon.contains(expectedTitleAmazon)){
            System.out.println("Test PASSED");
        }else System.out.println(actualTitleAmazon);



          // Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String actualURLAmazon= driver.getCurrentUrl();
        String expectedUrlAmazon = "https://www.amazon.com/";

        if (actualURLAmazon.equals(expectedUrlAmazon)){
            System.out.println("Test PASSED");
        }else System.out.println(actualURLAmazon);


      //Sayfayi kapatin
        driver.close();
    }
}
