package Test_Cases;
import Bases.Project_Base;
import Pages_Factory.Pages;
import Pages_Factory.Register_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Register_TestCases extends Project_Base
{
    Register_Page Object;
    Pages UsingsObject;

    @Test
    public void ClickNewAccountButton() {
        Object = new Register_Page(driver);
        UsingsObject = new Pages(driver);
        Object.Register();
        //Boolean NewPageDisplay = true;
        WebElement BackButton = driver.findElement(By.xpath("//*[@id=\"my-element\"]/div/div/div[1]/div/button/div[2]/p"));
        Assert.assertSame(BackButton.isDisplayed(), "BackButtonDisplayed");
    }

    @Test
    public void ClickNewAccountButton_ThenBack() {
        Object = new Register_Page(driver);
        UsingsObject = new Pages(driver);
        Object.Register();
        WebElement NewAccountButton = driver.findElement(By.xpath("//*[@id=\"my-element\"]/div/div/div/div[3]/button[1]"));
        Assert.assertSame(NewAccountButton.isDisplayed(), "BackButtonDisplayed");
    }

    @Test
    public void ClickNextToFillData() {
        Object = new Register_Page(driver);
        UsingsObject = new Pages(driver);
        Object.Register();
        WebElement companyNameField = driver.findElement(By.id("companyName"));
        Assert.assertSame(companyNameField.isDisplayed(), "companyNameFieldDisplayed");
    }

    @Test
    public void Verify_That_FieldsNotAcceptingValidData() {
        Object = new Register_Page(driver);
        UsingsObject = new Pages(driver);
        Object.Register();
        WebElement errorMessage = driver.findElement(By.xpath("//div[@id='ciContainer']/div[3]/div/form/div/div[4]/p"));
        Assert.assertTrue(errorMessage.isDisplayed(), "الرقم الضريبي غير صحيح");
    }

    @Test
    public void Verify_That_UserDetailsDisplayed() {
        Object = new Register_Page(driver);
        UsingsObject = new Pages(driver);
        Object.Register();
        WebElement companyNameField = driver.findElement(By.id("firstName"));
        Assert.assertSame(companyNameField.isDisplayed(), "FirstNameFielddDisplayed");
    }
}