package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ResultsPageLocators {
    @FindBy(how = How.XPATH, using = "//div[contains(@data-cel-widget,'search_result') and not(contains(@class, 'AdHolder'))]//span[@class='a-price']")
    public List<WebElement> productList;
    
    @FindBy(how = How.XPATH, using = "//*[@id='search']//span[text()='Try checking your spelling or use more general terms']")
    public WebElement noResultLabel;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@data-cel-widget,'search_result') and not(contains(@class, 'AdHolder'))]//h2/a/span")
    public List<WebElement> resultListProductTitleList;
}


