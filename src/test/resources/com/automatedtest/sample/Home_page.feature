Feature: Home page

  @home_page
  Scenario Outline: Check page title
    Given A user navigates to HomePage "<tab>"
    Then page title is "<pageTitle>"

    Examples:
      | tab                | pageTitle     |
      | com/travel/flights | Google Flights - Find Cheap Flight Options & Track Prices |

  @home_page
  Scenario Outline: Check page sections
    Given A user navigates to HomePage "<tab>"
    Then Page lowerleft section is "<lowerLeft>"
    And Page lowerright section is "<lowerRight>"

       # And user enters Departure "<departureDate>" and Return "<returnDate>" hit search
       # Then flight list is displayed


    Examples:
      | tab                | lowerLeft                   |  lowerRight           |
      | com/travel/flights | Suggested trips from Sydney |  Explore Destinations |


  @home_page @search
  Scenario Outline: Search Flights
    Given A user navigates to HomePage "<tab>"
    And user enters from "<fromLocation>" and to "<toLocation>"
    Then user can explore the search results

    Examples:
      | tab                | fromLocation |  toLocation  | departureDate | returnDate |
      | com/travel/flights | Brisbane     |  Melbourne   | March 10      | March 20   |

