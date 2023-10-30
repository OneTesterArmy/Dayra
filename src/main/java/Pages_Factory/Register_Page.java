package Pages_Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page extends Pages
{
    public Register_Page(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"my-element\"]/div/div/div/div[3]/button[1]")
     WebElement NewAccount;
    @FindBy(xpath = "//*[@id=\"my-element\"]/div/div/div[1]/div/button/div[2]/p")
     WebElement BackButton;
    @FindBy(xpath = "//*[@id=\"my-element\"]/div/div/div[2]/div[2]/button")
    WebElement NextButton;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement NextButton_Phone;

    @FindBy(xpath="xpath=//div[2]/button")
    WebElement NextButton_Paper;
    @FindBy(id="companyName")
    WebElement companyNameField;
    @FindBy(id="taxNumber")
    WebElement TaxNumberField;
    @FindBy(css = ".fs-18")
    WebElement NextButton_AfterTax;

    @FindBy(id = "firstName")
    WebElement FirstNameField;

    @FindBy(id = "familyName")
    WebElement familyNameField;

    @FindBy(id = "phoneNumber")
    WebElement phoneField;

    public void Register()
    {
        clickButton(NewAccount);
        //NewAccount.click();
        clickButton(BackButton);
        clickButton(NextButton);
        clickButton(NextButton_Phone);
        clickButton(NextButton_Paper);
        setTextElementText(companyNameField,"TestComp");
        setTextElementText(TaxNumberField,"123");
        setTextElementText(TaxNumberField,"123456789");
        clickButton(NextButton_AfterTax);
        setTextElementText(FirstNameField,"Taha");
        setTextElementText(familyNameField,"Test");
        setTextElementText(phoneField,"01116557066");
    }
}