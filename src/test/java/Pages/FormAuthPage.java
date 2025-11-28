package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {
    WebDriver driver;

//    public FormAuthPage(WebDriver driver)
//    {
//        this.driver = driver ;
//    }
    private By usernameTextbox = By.id("username");
    private By passwordTextbox = By.id("password");
    private By loginButton = By.className("radius");
    private By flashMessage = By.id("flash");
//    WebElement usernameTextbox = driver.findElement(By.id("username"));
//    WebElement passwordTextbox = driver.findElement(By.id("password"));
//    WebElement loginButton = driver.findElement(By.className("radius"));
    String expectedUsernameFailedMsg = "Your username is invalid! ";
    String expectedPasswordFailedMsg = "Your Password is invalid !";
//    String actualErrorMsg =  driver.findElement(By.id("flash")).getText();

    public FormAuthPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username)
    {
//        usernameTextbox.sendKeys(username);
        driver.findElement(usernameTextbox).sendKeys(username);

    }

    public void setPassword(String password)
    {
//        passwordTextbox.sendKeys(password);
        driver.findElement(passwordTextbox).sendKeys(password);

    }
    public void clickOnLoginButton()
    {
//        loginButton.click();
        driver.findElement(loginButton).click();

    }
    public String getFlashMessage(){
        return driver.findElement(flashMessage).getText().trim();
    }
//    public String getGetExpectedUsernameFailedMsg(){
//        return expectedUsernameFailedMsg;
//    }
//    public String getGetExpectedPasswordFailedMsg(){
//        return expectedPasswordFailedMsg ;
//    }
//    public String getActualErrorMsg()
//    {
//        return actualErrorMsg ;
//    }
}
