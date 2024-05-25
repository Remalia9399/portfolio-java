package exams.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2 {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // Podanie email i haslo do zalogowania sie na strone
        String email = "xm@loo.pl";
        String password = "12345";

        // Uruchomienie przegladarki chrome z oczekiwianiem na max 10 sec na każdy proces na stronie
        // w trybie pełnoekranowym
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Uruchomenie strony z logowaniem y wykorzystanie podanego wczesniej email i hasla
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

        // Przekierowanie na strone z koszulka
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s");


        // Operacje do  Obliczanie rabatu czy wynosi 20%

        // Odnalezienie elementu na stronie z cena regularna i faktyczna do zaplacenia --> nastepnie usunięcie pierwszego znaku "€" żeby przekonwertować string
        // na wartosc double do obliczenia
        WebElement cenaRegularnaStringElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[1]/div[1]/span"));
        String cenaRegularnaString = cenaRegularnaStringElement.getText().replaceFirst("€","");
        double cenaRegularnaDouble = Double.valueOf(cenaRegularnaString);

        WebElement cenaRabatStringElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[1]/div[2]/div/span[1]"));
        String cenaRabatString = cenaRabatStringElement.getText().replaceFirst("€","");
        double cenaRabatDouble = Double.valueOf(cenaRabatString);


        // Obliczanie czy rabat wynosi 20% i wyświetlenie wyniku na konsoli
        if (cenaRabatDouble == cenaRegularnaDouble * 80/100 ) {
            System.out.println("Rabat wynosi 20 %");
        } else {
            System.out.println("brak rabatu");
        }

        // Wybranie rozmiaru koszulki rozmiaru M
        WebElement rozmiarM = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/select/option[2]"));
        rozmiarM.click();

        // Wybranie 5 ilości sztuk koszulki
        WebElement iloscSztuk5Element = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/input"));

        // Opoznienie dzialania automata na 5 sec przy wyborze ilosci 5 sztuk bo po zmianie rozmiaru koszulki wczytuje strone jeszcze raz
        // Przez co strona od nowa pokazuje domyslna wartosc zakupu 1 koszulki
        TimeUnit.SECONDS.sleep(5);
        iloscSztuk5Element.clear();
        // Zaznaczenie skrotem ctrl+a calego tekstu i zastapenie wartoscia 5
        iloscSztuk5Element.sendKeys(Keys.chord(Keys.CONTROL, "a"), "5");

        // Dodanie produktu do koszyka
        WebElement dodanieDoKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        dodanieDoKoszykaElement.click();

        // Potwierdzenie zakupu
        WebElement potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a"));
        potwierdzenieKoszykaElement.click();
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a"));
        potwierdzenieKoszykaElement.click();

        // Wybranie adresu
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[2]/div/div/form/div[1]/article[1]/header/label"));
        potwierdzenieKoszykaElement.click();

        // Potwierdzenie adresu
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[2]/div/div/form/div[2]/button"));
        potwierdzenieKoszykaElement.click();

        // Zaznaczenie self pick up i potwierdzenie przyciskiem
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[3]/div/div[2]/form/div/div[1]/div[1]/div/span/span"));
        potwierdzenieKoszykaElement.click();
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[3]/div/div[2]/form/button"));
        potwierdzenieKoszykaElement.click();

        // Wybranie metody platnosci pay by check--> akceptacja regulaminu --> potwierdzenie przyciskiem place order
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[2]/div[1]/div/span/input"));
        potwierdzenieKoszykaElement.click();
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/form/ul/li/div[1]/span/input"));
        potwierdzenieKoszykaElement.click();
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button"));
        potwierdzenieKoszykaElement.click();

        // 1/3 Do zadania dodatkowe. Pobranie numeru referencyjnego
        potwierdzenieKoszykaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section[2]/div/div/div[2]/ul/li[1]"));
        String numerReferencyjny = potwierdzenieKoszykaElement.getText();


        // Zrobienie screenshota z potwierdzeniem zamowiona kwota
        TimeUnit.SECONDS.sleep(5);

        try {
            File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
//            Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "screenshot"+currentDateTime+".png"));
            Files.copy(tmpScreenshot.toPath(), Paths.get("C:\\Users\\natal\\Desktop\\", "screenshot"+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        TimeUnit.SECONDS.sleep(5);


        // 2/3 Wejscie w zamowienia (kliknieice w zalogowanego uzytkownika i kafelek)
        WebElement wszystkieZamowieniaElement = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a[2]/span"));
        wszystkieZamowieniaElement.click();
        wszystkieZamowieniaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[3]/span/i"));
        wszystkieZamowieniaElement.click();


        // 3/3 Sprawdzenie czy zamowienie znajduje sie na liscie   Awaiting chech payment i porównanie kwoty
        wszystkieZamowieniaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/table/tbody/tr[1]/th"));
        String ostatnieZamowienieNumerRef = wszystkieZamowieniaElement.getText();
        if (ostatnieZamowienieNumerRef.equals(numerReferencyjny)) {
            WebElement sprawdzenieStatusuPlatnosci = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/table/tbody/tr[1]/td[4]/span"));
            String statusPlatnosci = sprawdzenieStatusuPlatnosci.getText();
            System.out.println();
        }

        // przy zakupie z aktualna do zaplaty     klikniecie details--> i odczytanie   unit price
        wszystkieZamowieniaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/table/tbody/tr[1]/td[6]/a[1]"));
        wszystkieZamowieniaElement.click();
        wszystkieZamowieniaElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[3]/table/tbody/tr/td[3]"));

        // Przekonwertowanie ceny ze string do double
        String cenaWZamowieniuString = wszystkieZamowieniaElement.getText().replaceFirst("€","");
        double cenaWZamowieniuDouble = Double.valueOf(cenaWZamowieniuString);

        // Porowanie ceny przy zakupie i po zakupie
        if (cenaWZamowieniuDouble == cenaRabatDouble) {
            System.out.println("Ceny są sobie równe");
        } else {
            System.out.println("Ceny sie roznia");
        }

    }
}
// Brakuje rozmiaru koszulki


