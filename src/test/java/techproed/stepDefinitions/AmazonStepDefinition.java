package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;



public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Nutella"));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
      amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
       Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Java"));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
      amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);

    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("iphone"));

    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(istenenKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String kelime) {
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(kelime));

    }

    @Then("arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        amazonPage.aramaKutusu.sendKeys("samsung" + Keys.ENTER);
    }

    @Given("kullanici parametreli method ile{string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get("https://amazon.com");
    }
}






