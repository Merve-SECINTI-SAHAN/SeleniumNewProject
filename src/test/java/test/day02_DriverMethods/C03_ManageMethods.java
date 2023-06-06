package test.day02_DriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu: "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları: "+driver.manage().window().getSize());

        /*
          Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
        webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
        browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */


        //Browser'ı maximize yapalım
        driver.manage().window().maximize();
       //Browser'a gittikten sonra ilk is olarak sayfayi her zaman maximize yapmaliyiz


        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu: "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();


        //istediğimiz konuma getirmek için
        driver.manage().window().setPosition(new Point(50,50));

        //istediğmiz (size) getirmek için
        driver.manage().window().setSize(new Dimension(600,600));

        //sayfayı kapatınız
        driver.close();


    }

}
