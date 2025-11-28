package BaseTest;

import Pages.AddRemoveElementsPage;
import Pages.CheckboxPage;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
    protected WebDriver driver ;
protected HomePage homePage;
protected FormAuthPage formAuthPage ;
protected CheckboxPage checkboxPage ;
protected AddRemoveElementsPage addremovePage;
    @BeforeClass
    public void setup()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        checkboxPage = new CheckboxPage(driver);
    }
    @BeforeMethod
    public void goToHomePage()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
