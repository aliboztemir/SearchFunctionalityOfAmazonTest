@Web @Mobile
Feature: Enter a valid product name and click on the search icon

  Background: User navigate into amazon website
    Given I navigate into "https://www.amazon.com" website

  Scenario: Search for Playstation DualSense by its full name
    Given I enter "Playstation DualSense Wireless Controller" as search criteria
    When click on the Search Button
    And I want to click on the first item
    Then the item page is displayed I capture title of the product

  Scenario: Search for The North Face by its short name
    Given I enter "The North Face Men" as search criteria
    When click on the Search Button
    And I want to click on the first item
    Then item page is displayed I catch the item containing its title

  Scenario: Search Product by numeric values only
    Given I enter "1000306" as search criteria
    When click on the Search Button
    And I want to click on the first item
    Then item page is displayed I catch the item containing its title

  Scenario: Search Product by alphabetic characters values only
    Given I enter "Logitech" as search criteria
    When click on the Search Button
    And I want to click on the first item
    Then item page is displayed I catch the item containing its title

  Scenario: Enter a long string under 650 characters in the search box
    Given I enter "Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 Count for Metabolic Health Nature Made Super B Energy Complex Softgels, 60 C" as search criteria
    When click on the Search Button
    Then it should load the result page

  Scenario: Search Typing any single character in the search box
    Given I enter "S" as search criteria
    When click on the Search Button
    Then it should show a list of product suggestions starting with the entered character
