@Web @Mobile
Feature: Check Auto Complete Suggestions

  Background: User navigate into amazon website
    Given I navigate into "https://www.amazon.com" website

  Scenario: Typing any single character in the search box
    Given I enter "a" as search criteria
    Then It should show a list of product suggestions starting with the entered character
    And It should display ten suggestions in the list format
    And The user should be able to choose a product from the dropdown product list

  Scenario: Type any two-character in the search box
    Given I enter "ab" as search criteria
    Then the user should be able to see an updated list with the product starting from given two-character

  Scenario: The same word enters multiple times in the search box
    Given I enter "apple apple apple" as search criteria
    Then The same word enters multiple times, it should load results with a product containing the given text

  Scenario: Select a country, search a valid product name
    Given I enter "apple apple apple" as search criteria
    And Select a country "Germany"
    Then Result page should display product containing given name in the English language
