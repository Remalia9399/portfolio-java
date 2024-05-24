package selenium_webdriver.seleniumproject.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static selenium_webdriver.seleniumproject.Utils.assertVisibleAndEnabled;
import static selenium_webdriver.seleniumproject.Utils.setCheckbox;


public class HotelCreateAnAccountPage {
    private final WebDriverWait wait;

    @FindBy(id = "submitAccount")
    private WebElement submitAccountButton;
    @FindBy(css = "label[for=id_gender1]")
    private WebElement titleMr;
    @FindBy(css = "label[for=id_gender2]")
    private WebElement titleMrs;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;
    @FindBy(id = "email")
    private WebElement emailInput;

    public HotelCreateAnAccountPage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        PageFactory.initElements(driver, this);
    }

    public void fillPersonalInformationForm(FormData data) {
        if (data.getIsMr()) {
            titleMr.click();
        } else {
            titleMrs.click();
        }

        assertVisibleAndEnabled(firstNameInput);
        assertVisibleAndEnabled(lastNameInput);
        assertVisibleAndEnabled(passwordInput);

        firstNameInput.sendKeys(data.getFirstName());
        lastNameInput.sendKeys(data.getLastName());
        passwordInput.sendKeys(data.getPassword());

        setCheckbox(newsletterCheckbox, data.getSignUpNewsletter());
        setCheckbox(specialOffersCheckbox, data.getSignUpSpecialOffers());
    }

    public void clickRegisterButton() {
        submitAccountButton.click();
    }

    public void doStuffAndClickRegisterButton() {
        System.out.println("do stuff");
        submitAccountButton.click();
    }

    public String getEmailValue() {
        // the below code uses a "lambda expression"
        wait.until(wd -> !emailInput.getAttribute("value").equals("")); // this is like a while that tests for at most 4 seconds

        return emailInput.getAttribute("value");
    }
}
