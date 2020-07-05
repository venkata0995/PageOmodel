import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salesforcelogin2
{
    WebDriver driver;
    public Salesforcelogin2(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="username")
    WebElement username;
    @FindBy(name="pw")
            WebElement password;
    @FindBy(id="Login")
            WebElement signin;
    public WebElement emailid()
    {
        return username;
    }
    public WebElement password()
    {
        return password;
    }
    public WebElement login()
    {
      return  signin;
    }

}
