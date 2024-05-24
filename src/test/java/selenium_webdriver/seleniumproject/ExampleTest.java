package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.*;

public class ExampleTest {
    // testing rules:
    // 1. test powinien coś testować
    // 2. test powinien być szybki
    // 3. tesy powinny być NIEZALEŻNE (od siebie)
    @Test
    public void firstTest() {
        System.out.println("firstTest");
    }

    @Test
    public void secondTest() {
        System.out.println("secondTest");
    }

    @Disabled
    @Test
    public void thirdTest() {
        System.out.println("thirdTest");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
