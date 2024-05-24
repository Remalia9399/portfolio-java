package pl.coderslab.seleniumproject.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumproject.cucumber.pageobject.DdgMainPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class SearchWithDuckDuckGoSteps {
    private WebDriver driver;
    private DdgMainPage ddgMainPage;

    @Given("Url {string} opened in Chrome") // cucumber expression capturing is default
    public void openDuckDuckGoPageInChrome(String url) {
        this.driver = new ChromeDriver();
        this.ddgMainPage = new DdgMainPage(this.driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get(url);
    }

    @When("^Phrase '(.+)' entered in search input box$") // regex capturing MUST be marked with ^$
    public void enterPhraseInSearchInputBox(String searchPhrase) {
        ddgMainPage.enterSearchPhrase(searchPhrase);
    }

    @And("Search button clicked")
    public void clickSearchButton() {
        ddgMainPage.clickSearchButton();
    }

    @Then("First {int} results contain phrase {string}")
    public void assertValidResults(int meaningfulResultCount, String searchPhrase) {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("ol.react-results--main article h2 a > span"));
        for(int i=0; i < meaningfulResultCount; i++) {
            WebElement currentElement = searchResults.get(i);
            String searchResultText = currentElement.getText().toLowerCase();
            if(!searchResultText.contains(searchPhrase.toLowerCase())) {
                Assertions.fail(String.format("Phrase '%s' NOT found in search result: %s", searchPhrase , searchResultText));
            }
        }
    }

    @Then("Save screenshot")
    public void saveScreenshot() throws IOException {
//Take screenshot (will be saved in default location) and automatically removed after test
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Copy the screenshot to desired location
//Path to the location to save screenshot
//(directory for screenshots MUST exist: C:\test-evidence) e.g.:
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        // new three classes that we use below: Files, Path, Paths
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "ddg-search-"+currentDateTime+".png"));
    }

    @Then("Quit browser")
    public void quitBrowser() {
        driver.quit();
    }
}
