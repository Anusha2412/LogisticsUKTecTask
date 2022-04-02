Feature: Search functionality
  Background:
    Given User is on Home page
    When User clicks search bar


  Scenario Outline:
    And User enters search item as "<searchItem>" in the text-box and press enter or click search bar
    Then User should be able to see all the related items.
    Examples:
      | searchItem |
      | Training   |
      | Cars       |



  Scenario:
    And User enter search item as "Training"
    And User select a filter options on right hand side
    Then User should see all the related items accordingly.


  Scenario:
    When User enter a invalid search item
    And click on search button
    Then User should see No results found message



