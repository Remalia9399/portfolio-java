package selenium_webdriver.seleniumproject.cucumber.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DdgMainPage {
    @FindBy(id = "searchbox_input")
    private WebElement searchInputBox;
    @FindBy(css = "#searchbox_homepage button[type='submit']")
    private WebElement searchButton;

    public DdgMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchPhrase(String phrase) {
        searchInputBox.sendKeys(phrase);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
