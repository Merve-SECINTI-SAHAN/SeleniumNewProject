package test.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz.

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        WebDriver driver= new ChromeDriver();
        //Chrome türünde yeni bir obje oluşturduk.


        //Driver methodları
        driver.get("https://www.techproeducation.com"); // --> String olarak girilen url'ye gider


    }
}

