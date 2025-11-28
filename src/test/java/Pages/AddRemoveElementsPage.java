
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AddRemoveElementsPage {
    WebDriver driver;

    By addButtonLocator = By.xpath("//button[text()='Add Element']");
    By deleteButtonsLocator = By.xpath("//button[text()='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddButton() {
        driver.findElement(addButtonLocator).click();
    }
    public void clickDeleteButton() {
//        driver.findElement(deleteButtonsLocator).click();
        List<WebElement> buttons = driver.findElements(deleteButtonsLocator);
        if (buttons.size() > 0) {
            buttons.get(0).click();
        } else {
            System.out.println("Nothing");
        }
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButtonsLocator).size();
    }
}
// لو ضيفت 5 و مسحت 6 نعالج error