package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ResableMethods;


public class BlueRentalCarStepDefiniation {


    BlueRentalCarPage rentalCarPage=new BlueRentalCarPage();

    @Given("kullanici bluerentalcar sayfasina gider")
    public void kullaniciBluerentalcarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ResableMethods.bekle(3);
    }

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        rentalCarPage.loginButton.click();
    }

    @And("kulanici adi ve password girer")
    public void kulaniciAdiVePasswordGirer() {
        String mail= ConfigReader.getProperty("mail1");
        String password= ConfigReader.getProperty("password1");
        rentalCarPage.mail.sendKeys(mail, Keys.TAB,password,Keys.ENTER);
    }

    @And("kulanici farkli mail ve password girer")
    public void kulaniciFarkliMailVePasswordGirer() {
        String mail= ConfigReader.getProperty("mail2");
        String password= ConfigReader.getProperty("password2");
        rentalCarPage.mail.sendKeys(mail, Keys.TAB,password,Keys.ENTER);
    }

    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        rentalCarPage.mail.sendKeys(email,Keys.TAB,password,Keys.ENTER);
    }

    @And("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        Assert.assertEquals("https://www.bluerentalcars.com/",Driver.getDriver().getCurrentUrl());
    }

    @And("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        for (int i = 1; i < data.asLists().size(); i++) {
            rentalCarPage.mail.sendKeys(data.row(i).get(0),Keys.TAB,data.row(i).get(1),Keys.ENTER);
            ResableMethods.bekle(3);
            Driver.getDriver().navigate().back();
            ResableMethods.bekle(3);

        }

    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olunur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlunur(String sayfaIsmi) {
        String dosyaYolu="src/test/resources/mysmoketestdata (2).xlsx";
        ExcelReader excelReader=new ExcelReader(dosyaYolu,sayfaIsmi);
        for (int i = 1; i <=excelReader.rowCount(); i++) {
            String email =excelReader.getCellData(i,0);
            String password=excelReader.getCellData(i,1);
            rentalCarPage.mail.sendKeys(email,Keys.TAB,password,Keys.ENTER);
            ResableMethods.bekle(3);
            Driver.getDriver().navigate().back();
            ResableMethods.bekle(2);

        }
    }
}
