package repeatedWword;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test public void testFindFirstRepeatedWordInNormalCase() {
        String book = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        assertEquals(expected, RepeatedWord.getFirstRepeatedWord(book));
    }

    @Test public void testFindFirstRepeatedWordInEmptyString() {
        String book = "";

        assertNull( RepeatedWord.getFirstRepeatedWord(book));
    }

    @Test public void testFindFirstRepeatedWordInNoStringWithNoRepeatedWords() {
        String book = "Good night..";

        assertNull( RepeatedWord.getFirstRepeatedWord(book));
    }

    @Test public void testFindFirstRepeatedWordInWordWithCommaAndSpaces() {
        String book = "hello, world.. hello everyOne";
        String expected = "hello";
        assertEquals(expected, RepeatedWord.getFirstRepeatedWord(book));
    }
}
