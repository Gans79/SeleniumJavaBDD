package com.automatedtest.sample.searchresultpage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.IntStream;

public class SearchResultPage extends BasePage {

    private static final String RESULTS_TITLE_SELECTOR = "a h3";


    @FindBy(xpath = "//div[contains(text(), 'About these results')]")
    private WebElement resultsInfo;

    SearchResultPage() {
        PageFactory.initElements(driver, this);
    }


    void resultsDisplay() {
        wait.forElementToBeDisplayed(60, this.resultsInfo, "Results Info");

    }
}

