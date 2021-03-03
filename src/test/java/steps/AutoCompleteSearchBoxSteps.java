package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.*;

public class AutoCompleteSearchBoxSteps {
	HomePageActions homePageActions = new HomePageActions();
	ResultsPageActions resultsPageActions = new ResultsPageActions();
	ItemPageActions itemPageActions = new ItemPageActions();

	@Then("It should show a list of product suggestions starting with the entered character")
	public void ıt_should_show_a_list_of_product_suggestions_starting_with_the_entered_character() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}

	@Then("the user should be able to see an updated list with the product starting from given two-character")
	public void the_user_should_be_able_to_see_an_updated_list_with_the_product_starting_from_given_two_character() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}

	@Then("The same word enters multiple times, it should load results with a product containing the given text")
	public void the_same_word_enters_multiple_times_it_should_load_results_with_a_product_containing_the_given_text() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}

	@Given("Select a country {string}")
	public void select_a_country(String string) {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}

	@Then("It should display ten suggestions in the list format")
	public void ıt_should_display_ten_suggestions_in_the_list_format() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}

	@Then("Result page should display product containing given name in the English language")
	public void result_page_should_display_product_containing_given_name_in_the_english_language() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}
	
	@Then("The user should be able to choose a product from the dropdown product list")
	public void the_user_should_be_able_to_choose_a_product_from_the_dropdown_product_list() {
		System.out.println("Write code here that turns the phrase above into concrete actions");
	}
}