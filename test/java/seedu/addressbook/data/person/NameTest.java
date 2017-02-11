package seedu.addressbook.data.person;

import org.junit.Test;
import static org.junit.Assert.*;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    @Test
    public void equalNames() throws IllegalValueException {
        Name name1 = new Name("John");
        Name name2 = new Name("John");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));

        name1 = new Name("John Doe");
        name2 = new Name("John Doe");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));

        name1 = new Name("John");
        name2 = new Name("Jon");
        assertFalse(name1.isSimilar(name2));
        assertFalse(name2.isSimilar(name1));

        name1 = new Name("John Doe");
        name2 = new Name("John Do");
        assertFalse(name1.isSimilar(name2));
        assertFalse(name2.isSimilar(name1));

    }
}
