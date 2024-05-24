package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static selenium_webdriver.seleniumproject.Utils.assertVisibleAndEnabled;

public class CoderslabHotelTest {
    @Test
    public void searchById() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        hotelLocationInput.sendKeys("Warsaw");

        WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));

        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
        newsletterInput.sendKeys("test@test.com");
    }

    @Test
    public void shouldSubmitUserForm() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // on main page
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.cssSelector("a.user_login")).click();
        // on signin/signup page
        WebElement emailInput = driver.findElement(By.name("email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        driver.findElement(By.id("SubmitCreate")).click();
        // on signup page
        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
        assertVisibleAndEnabled(firstNameInput);
        firstNameInput.sendKeys("Ala");

        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
        assertVisibleAndEnabled(lastNameInput);
        lastNameInput.sendKeys("Makota");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        assertVisibleAndEnabled(passwordInput);
        passwordInput.sendKeys("trudneHaslo123");

        driver.findElement(By.id("submitAccount")).click();
    }
}
