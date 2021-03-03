package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemPageLocators {
    @FindBy(how = How.ID, using = "productTitle")
    public WebElement itemPageProductTitle;
}
