package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTableStepDefinition {
    DataTablePage tablePage=new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna basalım")
    public void kullaniciSayfadakiTablodaNewButonunaBasalım() {
        tablePage.newBotonu.click();
    }

    @Then("kullanici verilen bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciVerilenBilgileriGirer(String name, String lastname, String position, String office, String ext, String date, String salary) {
        tablePage.firstName.sendKeys(name, Keys.TAB,lastname,Keys.TAB,position,Keys.TAB,office,Keys.TAB,ext,Keys.TAB,date,Keys.TAB,salary);
    }

    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        tablePage.createButton.click();
    }

    @Then("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String name) {
        tablePage.searchBook.sendKeys(name);
    }

    @And("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(tablePage.searchVerify.getText().contains(name));
    }
}
