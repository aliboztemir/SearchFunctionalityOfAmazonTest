package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ItemPageLocators;
import utils.SeleniumDriver;

public class ItemPageActions {
    String itemPageProductTitle;
    ItemPageLocators itemPageLocators;
    public ItemPageActions(){
        this.itemPageLocators = new ItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),itemPageLocators);
    }

    public String getItemPageProductTitle(){
    	this.itemPageProductTitle = itemPageLocators.itemPageProductTitle.getText();
        return itemPageProductTitle;
    }

}
