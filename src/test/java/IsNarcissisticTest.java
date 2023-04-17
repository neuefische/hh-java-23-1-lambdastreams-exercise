import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsNarcissisticTest {

    @Test
    public void isNarcissistic_ReturnsBooleanWhetherIntIsNarcissistic_WhenGivenInt() {
        assertTrue(IsNarcissistic.isNarcissistic(153));
        assertTrue(IsNarcissistic.isNarcissistic(1634));
        assertFalse(IsNarcissistic.isNarcissistic(112));
    }
}