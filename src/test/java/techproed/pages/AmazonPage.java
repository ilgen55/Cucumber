package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {


    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }



    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public  WebElement sonucYazisi;

    @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']") public WebElement viceDeanUserName;
    @FindBy(xpath = "(//button[@type='button'])[3]") public WebElement viceDeanLoginButton;
    @FindBy(xpath = "(//button)[1]") public WebElement viceDeanMenu;
    @FindBy(xpath = "(//a[@class='nav-link'])[8]") public WebElement viceDeanStudentManagement;
    @FindBy(xpath = "//select[@id='advisorTeacherId']") public WebElement viceDeanAdvisorTeacher;
    @FindBy(xpath = "//input[@id='name']") public WebElement viceDeanName;
    @FindBy(xpath = "(//input[@type='radio'])[2]") public WebElement viceDaneMale;
    @FindBy(xpath = "//input[@id='birthDay']") public WebElement viceDaneBirthDay;
    @FindBy(xpath = "(//a[@class='page-link'])[4]") public WebElement viceDeanSayfasonu;
    @FindBy(xpath = "(//tr/td)[7]") public WebElement viceDeanStudentNumber;
    @FindBy(xpath = "//span[@id='email']") public WebElement fakeMail;
    @FindBy(xpath = "//div[text()='Student saved Successfully']") public WebElement alertMesaj;
}
