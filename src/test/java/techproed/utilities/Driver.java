package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
       /*
       SINGLETON PATTERN(tekli kullanım)
    Driver class'ından obje oluşturmanın önüne geçmek için burdaki
public olan gizli conts. private yaptık. Böyle Driver class'ından
obje oluşturmanın önü geçtik.
 */
    }
  static   WebDriver driver;
    public static WebDriver getDriver(){
          /*
        Driver'i her cagirdigimizda yeni bir pencere acmamasi icin bir if blogu ile bu isi cözdük.
        If (driver==null) ile eger driver'a deger atanmamis ise driver'a degerleri ata , tekrar driver
        cagrildiginda driver'da deger oldugu icin direkt driver'i return et.Dolayisiyla driver'i ikinci
        kez cagirdigimizda acik gördügü browser'da yani ayni sayfada belirtilen web sitesine gider
         */
        if(driver==null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    /*
Driver'i direkt kapatip tekrar bir sayfaya gitmek istersek hata aliriz.Cunku Driver'in yeniden
olusma sarti deger atanmamis olmasi.Close yaptiktan sonra driver hala deger atili durumda gozukur
Dolayisiyla yeniden driver'i olusturabilmesi icin yani getDriver() methodundaki olusma sartina
uyabilmesi icin driver'i tekrar null'a esitlememiz yani kapandiktan sonra bos oldugunu belirtmemiz gerekir.
 */
    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }

    }
    public static void quit(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
