package selenium_webdriver.seleniumproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {
    @Test
    public void assertionsTest() {
        // given
        int a = 1;
        int b = 2;
        // when
        int actual = a+b;
        // then
        assertEquals(3, actual);
    }

    @Test
    public void exampleAssertions() {
        Assertions.assertEquals(5,5);
        assertEquals("str", "str");
        assertEquals(42l, 42l, "custom message");
        assertEquals(0.3, 0.1+0.2, 0.1);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull(new Object());
        assertArrayEquals(new int[]{1,2},new int[]{1,2});
        Object o = new Object();
        Object o2 = o;
        assertSame(o, o2); // porównuje tożsamość referencji
        assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("illegal arg");}); // Java 8 lambda
        // Assertions.fail("fail message");
    }
}
