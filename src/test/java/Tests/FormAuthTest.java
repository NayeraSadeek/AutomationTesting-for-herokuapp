package Tests;
import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTestClass {

    @Test
    public void verifyLoginFuncWithValidCredentials()
    {

     formAuthPage= homePage.clickFormLink();
     formAuthPage.setUsername("tomsmith");
     formAuthPage.setPassword("SuperSecretPassword!");
     formAuthPage.clickOnLoginButton();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("secure"), "Login failed for valid credentials");
    }

}
