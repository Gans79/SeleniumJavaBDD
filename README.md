# Automated test example in Java with Cucumber and Selenium WebDriver #

This project is an example of UI automated functional test for Google travel flight page and search using Selenium and Cucumber.

Test scenarios are described in the feature files located here ./src/test/resources/com/automatedtest/sample.


## Installation ##

You need to have [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed along with [maven](https://maven.apache.org/download.cgi).

To run the tests locally with Chrome, install ChromeDriver from [here](http://chromedriver.chromium.org), add its location to your system PATH and add webdriver.chrome.driver=path/to/the/driver to your local variables.

To run the tests locally with Firefox, install GeckoDriver from [here](https://github.com/mozilla/geckodriver/releases) and add its location to your system PATH.

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`. If you haven't added the chrome driver path to your local variables, you can add it directly in the run command with the option `-Dwebdriver.chrome.driver=path/to/the/driver`.

You can also select specific tag to execute using `-Dcucumber.filter.tag="--tags @your_tag"`, For Ex : `mvn test -Dcucumber.filter.tags=" @home_page"` . 



