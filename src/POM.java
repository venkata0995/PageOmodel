import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM
{

    @Test
    public void Salesforcelogin()
    {
        System.setProperty("webdriver.chrome.driver","/Users/venkatasambaraju/Documents/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=ca");
        Salesforcelogin2 s=new Salesforcelogin2(driver);
        s.emailid().sendKeys("adjdjdjdjdjd");
        s.password().sendKeys("jjjjfjffjfjfjfj");
        s.login().click();
    }
}
