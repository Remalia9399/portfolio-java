package selenium_webdriver.seleniumproject.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoderslabHotelTest {
    @Test
    public void shouldSubmitUserForm() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        HotelMainPage mainPage = new HotelMainPage(driver);
        mainPage.clickSignIn();

        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        HotelAuthenticationPage authenticationPage = new HotelAuthenticationPage(driver);
        authenticationPage.fillAndSubmitCreateAnAccountPage(randomEmail);

        HotelCreateAnAccountPage createAnAccountPage = new HotelCreateAnAccountPage(driver);

        assertEquals(randomEmail, createAnAccountPage.getEmailValue());

        FormData formData = new FormData()
                .setFirstName("Ala")
                .setLastName("Makota")
                .setPassword("trudneHaslo123")
                .setIsMr(false)
                .setSignUpNewsletter(false)
                .setSignUpSpecialOffers(true);

        createAnAccountPage.fillPersonalInformationForm(formData);
        createAnAccountPage.clickRegisterButton();

        HotelMyAccountPage myAccountPage = new HotelMyAccountPage(driver);
        assertTrue(myAccountPage.isPanelAccountCreatedDisplayed());
    }
}
