package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class Utils {
    public static void assertVisibleAndEnabled(WebElement element) {
        if(!element.isDisplayed() || !element.isEnabled()) {
            Assertions.fail("Element NOT displayed or NOT enabled");
        }
    }

    public static void setCheckbox(WebElement checkbox, boolean state) {
        if (checkbox.isSelected()) {
            if (state == false) {
                checkbox.click();
            }
        } else {
            if (state == true) {
                checkbox.click();
            }
        }
    }
}
