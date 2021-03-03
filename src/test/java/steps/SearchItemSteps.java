package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.*;
import utils.SeleniumDriver;

public class SearchItemSteps {
	HomePageActions homePageActions = new HomePageActions();
	ResultsPageActions resultsPageActions = new ResultsPageActions();
	ItemPageActions itemPageActions = new ItemPageActions();
	private static String itemName = null;

	@Given("I navigate into {string} website")
	public void i_navigate_into_website(String url) {
		SeleniumDriver.openPage(url);
	}

	@Given("I enter {string} as search criteria")
	public void i_enter_as_search_criteria(String item) {
		homePageActions.enterSearchItem(item);
		itemName = item;
	}

	@When("click on the Search Button")
	public void click_on_the_search_button() {
		homePageActions.clickOnSearchButton();
	}

	@And("I want to click on the first item")
	public void i_want_to_click_on_the_first_item() {
		resultsPageActions.clickOnItem();

	}

	@Then("the item page is displayed I capture title of the product")
	public void the_item_page_is_displayed_I_capture_title_of_the_product() {
		Assert.assertEquals(itemName, itemPageActions.getItemPageProductTitle());
	}

	@Then("item page is displayed I catch the item containing its title")
	public void item_page_is_displayed_ı_catch_the_item_containing_its_title() {
		Assert.assertTrue(itemPageActions.getItemPageProductTitle().contains(itemName));
	}

	@Then("it should show a list of product suggestions starting with the entered character")
	public void it_should_show_a_list_of_product_suggestions_starting_with_the_entered_character() {
		Assert.assertEquals(resultsPageActions.getResultListFirstProductTitle().charAt(0), itemName.charAt(0));
	}

	@Then("it should load the result page")
	public void it_should_load_the_result_page() {
		Assert.assertTrue(resultsPageActions.getProductList() > 0, "Products were displayed on the result page");
	}

	@Then("it should load error message or suggestion")
	public void it_should_load_error_message_or_suggestion() {
		Assert.assertTrue(resultsPageActions.isElementPresent(), "No results for : " + itemName);
	}

	@Then("it should show the same page without refreshing the page")
	public void it_should_show_the_same_page_without_refreshing_the_page() {
		Assert.assertEquals("https://www.amazon.com/", resultsPageActions.getUrlTitle());
	}
}