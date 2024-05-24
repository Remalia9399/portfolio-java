package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SearchWithDuckDuckGoTest {
    @Test
    public void shouldFindSearchPhrase() {
        // given
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // when
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("searchbox_input"));
        String searchPhrase = "w pustyni i w puszczy";
        searchInput.sendKeys(searchPhrase + Keys.ENTER); // enter phrase and press enter on keyboard
        // then
        List<WebElement> searchResults = driver.findElements(By.cssSelector("ol.react-results--main article h2 a span"));
        for(int i=0;i<3;i++) {
            WebElement currentElement = searchResults.get(i);
//            String elemText = currentElement.getText();
            String searchResultText = currentElement.getText().toLowerCase();
            if(!searchResultText.contains(searchPhrase.toLowerCase())) {
                Assertions.fail(String.format("Phrase '%s' NOT found in search result: %s", searchPhrase , searchResultText));
            }
        }
        // alternatively - enter phrase and click search button on page as below:
//        searchInput.sendKeys("w pustyni i w puszczy");
//        WebElement searchButton = driver.findElement(By.cssSelector("#searchbox_homepage button[type='submit']"));
//        searchButton.click();
//        driver.quit();
    }
}
