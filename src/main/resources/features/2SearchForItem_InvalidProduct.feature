@Web @Mobile
Feature: Enter a Invalid product name and click on the search icon

  Background: User navigate into amazon website
    Given I navigate into "https://www.amazon.com" website

  Scenario: Search for a invalid product name
    Given I enter "234523452435243523452435" as search criteria
    When click on the Search Button
    Then it should load error message or suggestion

  Scenario: Combination of character & number, invalid
    Given I enter "&+^%+^6+&%+&%^54235234532453453463456ABSDS" as search criteria
    When click on the Search Button
    Then it should load error message or suggestion

  Scenario: Enter nothing and click on the search button
    When click on the Search Button
    Then it should show the same page without refreshing the page
