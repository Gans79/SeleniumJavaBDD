package com.automatedtest.sample.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to HomePage \"([^\"]*)\"$")
    public void aUserNavigatesToHomePage(String country) {
        this.homePage.goToHomePage(country);
    }

    @Then("^Google logo is displayed$")
    public void googleLogoIsDisplayed() {
        this.homePage.checkLogoDisplay();
    }

    @And("^search bar is displayed$")
    public void searchBarIsDisplayed() {
        this.homePage.checkSearchBarDisplay();
    }

    @Then("^Page lowerleft section is \"([^\"]*)\"$")
    public void lowerleftSectionIs(String leftText) {
        this.homePage.checkLowerLeftSection();
    }

    @And("^Page lowerright section is \"([^\"]*)\"$")
    public void lowerrightSectionIs(String rightText) {
        this.homePage.checkLowerRightSection();
    }

    @And("^user enters from \"([^\"]*)\" and to \"([^\"]*)\"$")
    public void userEntersFromandTo(String fromLoc, String toLoc) {
        this.homePage.enterFromandTo(fromLoc, toLoc);
    }


    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle = this.homePage.getTitle();
        System.out.println("Title : ");
        System.out.println(displayedTitle);

        Assert.assertTrue(title.equals(displayedTitle));
       // Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
       //         title.equals(displayedTitle));
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchValue) {
        this.homePage.searchFor(searchValue);
    }
}
