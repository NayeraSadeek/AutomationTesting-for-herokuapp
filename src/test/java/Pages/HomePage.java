package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver ;
    By formLinkLocator = By.linkText("Form Authentication");
    By checkboxLocator = By.linkText("Checkboxes");
    By dropdownLocator = By .linkText("Dropdown");
    By addRemoveLocator = By.linkText("Add/Remove Elements");

    public HomePage(WebDriver driver)
    {
        this.driver =driver;
    }

    public FormAuthPage clickFormLink()
    {
        driver.findElement(formLinkLocator).click();
        return new FormAuthPage(driver);
    }
    public CheckboxPage clickCheckboxLink()
    {
driver.findElement(checkboxLocator).click();
return new CheckboxPage(driver);
    }

    public AddRemoveElementsPage clickAddRemoveLink() {
        driver.findElement(addRemoveLocator).click();
        return new AddRemoveElementsPage(driver);
    }
}
