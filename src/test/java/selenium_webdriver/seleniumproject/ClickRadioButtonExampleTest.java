package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ClickRadioButtonExampleTest {
    @Test
    public void shouldFindSearchPhrase() {
        // given
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // when
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
// option 1: by css selector child index (starting from 1!)
//        WebElement male = driver.findElement(By.cssSelector("div.radio-container div label:nth-child(2)"));
//        male.click();
        List<WebElement> options = driver.findElements(By.cssSelector("div.radio-container label"));
// option 2: by idx in List (starting from 0)
//        options.get(0).click();
// option 3: by iterating elements and comparing text
        for (WebElement element : options) {
            if(element.getText().equals("Female")) {
                element.click();
                break;
            }
        }

//        driver.quit();
    }
}
