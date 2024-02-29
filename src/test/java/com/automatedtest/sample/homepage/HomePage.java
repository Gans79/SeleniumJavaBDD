package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://www.google.";

   // @FindBy(css = "#hplogo")
  //  @FindBy(css = "img[alt=Google]")
  //  @FindBy(css = "div[role=navigation]")

   // @FindBy(css = "a:contains('Gmail')")
  //  @FindBy(xpath = "//a[contains(text(), 'Gmail')]")


   // @FindBy(xpath = "//div[contains(text(), 'Flight')]")
   // @FindBy(css = "div[role=button]")
  //  @FindBy(xpath = "//h2[contains(text(), 'Suggested trips from Sydney')]")

   // @FindBy(xpath = "//title[contains(text(), 'Google Flights')]")
    @FindBy(css = "[aria-label='Google']")
    private WebElement logo;

    @FindBy(xpath = "//h2[contains(text(), 'Suggested trips from Sydney')]")
    private WebElement lowerLeft;

    @FindBy(xpath = "//span[contains(text(), 'Explore destinations')]")
    private WebElement lowerRight;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;

    @FindBy(css = "div[role=presentation]")
    private WebElement image;

    @FindBy(css = "input[type=text][aria-label='Where from?']")
    private WebElement fromInput;

    @FindBy(css = "input[type=text][aria-label='Where to? ']")
    private WebElement toInput;

    @FindBy(css = "input[type=text][placeholder='Departure']")
    private WebElement departureInput;

    @FindBy(css = "div[aria-label='Sun, 10 Mar']")
    private WebElement departureDate;

    @FindBy(css = "div[aria-label='Wed, 20 Mar']")
    private WebElement returnDate;

    @FindBy(xpath = "//span[contains(text(), 'Done')]")
    private WebElement doneButton;

    @FindBy(xpath = "//span[contains(text(), 'Search')]")
    private WebElement searchButton;


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(String country){
        driver.get(HOME_PAGE_URL + country);
        wait.forLoading(5);
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");

    }

    void checkLowerLeftSection() {
        wait.forElementToBeDisplayed(5, this.lowerLeft, "Lower Left");

    }

    void checkLowerRightSection() {
        wait.forElementToBeDisplayed(5, this.lowerRight, "Lower Right");

    }

    void enterFromandTo(String fromLoc, String toLoc) {

        this.fromInput.clear();
        this.fromInput.sendKeys(fromLoc);
        this.fromInput.sendKeys(Keys.ENTER);

    }

    String getTitle() {
        return driver.getTitle();
    }

    void checkSearchBarDisplay() {
        wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
    }

    void searchFor(String searchValue) {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
    }
}
