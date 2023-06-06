package test.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethod_ImplicitlyWait {
    public static void main(String[] args) {
         //Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
         // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
         // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
         // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir
         Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */

         //techproed sayfasina gidelim
        //amazona gidelim

        //techpro sayfasina geri donelim
        // ayfa basligini techpro icerdigini test edelim
        // tekrar amazon sayfasina gidelim sayfa basligini Amazon icerdigini test edelim









    }





}
