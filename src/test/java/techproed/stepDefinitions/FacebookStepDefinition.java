package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import techproed.pages.FacebookPage;

public class FacebookStepDefinition {

    FacebookPage facebookPage = new FacebookPage();

    @Then("email kutusuna yanlis {string} girer")
    public void emailKutusunaYanlisGirer(String email) {
        facebookPage.emailKutusu.sendKeys(email);
    }


    @And("sifre kutusuna yanlis {string} girer")
    public void sifreKutusunaYanlisGirer(String sifre) {

        facebookPage.sifreKutusu.sendKeys(sifre);

    }

    @And("giris yap butonuna tikar")
    public void girisYapButonunaTikar() {
       facebookPage.girisYapButonu.click();

    }

    @Then("girdigin sifre yanlis yazi elementinin gorunur oldugunu test eder")
    public void girdiginSifreYanlisYaziElementininGorunurOldugunuTestEder() {

        Assert.assertTrue(facebookPage.girdiginSifreYanlis.isDisplayed());


    }
}
