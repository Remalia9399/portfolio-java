package selenium_webdriver.seleniumproject.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class HotelAuthenticationPage {
    private final WebDriver driver;

    public HotelAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAndSubmitCreateAnAccountPage(String email) {
        WebElement emailInput = driver.findElement(By.name("email_create"));
        emailInput.sendKeys(email);
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
