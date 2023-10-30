package Pages_Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pages {

    protected WebDriver driver;
    public Pages (WebDriver driver)

    {
        PageFactory.initElements(driver, this);
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }
    protected static void setTextElementText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }
}
