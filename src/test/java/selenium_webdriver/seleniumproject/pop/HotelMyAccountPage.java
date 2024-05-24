package selenium_webdriver.seleniumproject.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelMyAccountPage {
    private final WebDriver driver;

    public HotelMyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPanelAccountCreatedDisplayed() {
        WebElement panel = driver.findElement(By.cssSelector("p.alert.alert-success"));
        return panel.getText().equals("Your account has been created.");
    }
}
