package pages.actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ResultsPageLocators;
import utils.SeleniumDriver;

public class ResultsPageActions {
    ResultsPageLocators resultsPageLocators;


    public ResultsPageActions(){
        this.resultsPageLocators = new ResultsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),resultsPageLocators);
    }

    public void clickOnItem(){
        resultsPageLocators.productList.get(0).click();
    }
    
    public int getProductList(){
        return resultsPageLocators.productList.size();
    }
    
    public boolean isElementPresent(){
        try{
            return resultsPageLocators.noResultLabel.isDisplayed();
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
    
    public String getUrlTitle() {
    	return SeleniumDriver.getDriver().getCurrentUrl();
    }
    
    public String getResultListFirstProductTitle() {
    	return resultsPageLocators.resultListProductTitleList.get(0).getText();
    }
}
