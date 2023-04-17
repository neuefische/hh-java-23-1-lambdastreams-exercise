import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsogramTest {
    @Test
    public void isIsogram_ReturnsBooleanWhetherStringContainsOnlyUniqueCharacters_WhenGivenString() {
        assertTrue(Isogram.isIsogram("Dermatoglyphics"));
        assertTrue(Isogram.isIsogram("isogram"));
        assertFalse(Isogram.isIsogram("moose"));
        assertFalse(Isogram.isIsogram("isIsogram"));
        assertFalse(Isogram.isIsogram("aba"));
        assertFalse(Isogram.isIsogram("moOse"));
        assertTrue(Isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogram(""));
    }
}