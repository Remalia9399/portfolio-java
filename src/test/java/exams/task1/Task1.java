package exams.task1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Task1 {

    private WebDriver driver;


    @Given("Zalogowanie się na email {string} haslo {string}")
    public void openLoginPageInChrome(String email, String password) {

        // Uruchomienie przegladarki chrome z oczekiwianiem na max 10 sec na każdy proces na stronie
        // w trybie pełnoekranowym
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Uruchomenie strony z logowaniem z wykorzystanie podanego wczesniej email i hasla
        // technicznie--> odnalezienie pol na stronie (do logowania)---> wyczyszczenie pol (na wypadek zapamietanej
        // histori--> wpisanie w pola podanych danych (email i haslo)

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=addresses");
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        // Kliknieicie przycisku zalogowania sie na stronie
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    // Kliknieicie dodania nowego adresu
    @When("Wejscie na kafelek Adresses")
    public void addressChangeButton() {
        WebElement createNewAddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[3]/a/span"));
        createNewAddress.click();
    }

    // Dodanie danych adresowych  z pliku ogorka zadanie1.feature
    @Given("Dodanie danych adresowych {string} {string} {string} {string} {string} {string}")
    public void providingAddressDetails(String alias, String address, String city, String zipCode, String country, String phone) {

        WebElement dataAlias = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[1]/div[1]/input"));
        dataAlias.clear();
        dataAlias.sendKeys(alias);

        WebElement dataAddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[6]/div[1]/input"));
        dataAddress.clear();
        dataAddress.sendKeys(address);

        WebElement dataCity = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[8]/div[1]/input"));
        dataCity.clear();
        dataCity.sendKeys(city);

        WebElement dataZipCode = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[9]/div[1]/input"));
        dataZipCode.clear();
        dataZipCode.sendKeys(zipCode);

        // Odnalezienie pola wyboru United Kingdom z ogorka i zaznaczenie go
        List<WebElement> options = driver.findElements(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select"));
        for (WebElement dataCountry : options) {
            if (dataCountry.getText().equals(country)) {
                dataCountry.click();
                break;
            }
        }

        WebElement dataPhone = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[11]/div[1]/input"));
        dataPhone.clear();
        dataPhone.sendKeys(phone);

        // Potwierdzenie formularza przyciskiem
        dataPhone.submit();
    }
    // Szukanie na kolejnej stronie czy znajduje sie w tekst
    @Then("Sprawdzenie poprawnosci wprowadzonych danych")
    public void checkingDataCorrectness() {
        WebElement correctAddition = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        if (correctAddition.getText().equals("Address successfully added!")) {
            System.out.println("Adres został dodany");
        } else {
            System.out.println("Adres nie został dodany poprawnie");
        }
    }
    // Scenario: usuniecie adresu po zalogowaniu

    @When("Usuniecie dodanego adresu")
    public void addressRemoval() {
        WebElement dataRemoval = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]/span"));
        dataRemoval.click();
    }
    @Then("Sprawdzenie czy adres zostal usuniety")
    public void checkingAndDeleteingData() {
        WebElement correctAddition = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        if (correctAddition.getText().equals("Address successfully deleted!")) {
            System.out.println("Adres zostal usuniety");
        } else {
            System.out.println("Adres nie zostal usuniety");
        }
    }

    // Koniec zakomentowania
}

