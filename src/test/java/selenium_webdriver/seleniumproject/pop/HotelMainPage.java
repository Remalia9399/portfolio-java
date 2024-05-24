package selenium_webdriver.seleniumproject.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelMainPage {
    @FindBy(css = "a.user_login")
    private WebElement userLoginLink;

    public HotelMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        userLoginLink.click();
    }
}
