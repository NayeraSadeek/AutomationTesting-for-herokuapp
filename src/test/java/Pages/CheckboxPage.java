package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;


    By checkbox1Locator = By.xpath("(//input[@type='checkbox'])[1]");
    By checkbox2Locator = By.xpath("(//input[@type='checkbox'])[2]");

    public  CheckboxPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickOnCheckboxOne()
    {
        driver.findElement(checkbox1Locator).click();
    }

    public void clickOnCheckboxTwo()
    {
        driver.findElement(checkbox2Locator).click();
    }
    public boolean checkboxOneIsSelected()
    {
        return driver.findElement(checkbox1Locator).isSelected();
    }
    public boolean checkboxTwoIsSelected()
    {
        return driver.findElement(checkbox2Locator).isSelected();
    }
}

