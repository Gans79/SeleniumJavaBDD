package com.automatedtest.sample.searchresultpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultPageSteps {

    private SearchResultPage searchResultPage;

    public SearchResultPageSteps() {
        this.searchResultPage = new SearchResultPage();
    }


    @Then("^user can explore the search results$")
    public void userCanExploreResults() {
        this.searchResultPage.resultsDisplay();
    }


}
