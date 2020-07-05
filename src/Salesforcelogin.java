import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Salesforcelogin
{
    WebDriver driver;
    public Salesforcelogin(WebDriver driver)
    {
        this.driver=driver;
    }
    By username=By.id("username");
    By password=By.name("pw");
    By signin=By.id("Login");

    public WebElement emailid()
    {
        return driver.findElement(username);
    }
    public WebElement password()
    {
        return driver.findElement(password);
    }
    public WebElement login()
    {
        return driver.findElement(signin);
    }



}
