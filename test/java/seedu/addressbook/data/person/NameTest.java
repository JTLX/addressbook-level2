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
        name2 = new Name("Johnny Do");
        assertFalse(name1.isSimilar(name2));
        assertFalse(name2.isSimilar(name1));
    }

    @Test
    public void differentlyCasedNames() throws IllegalValueException {
        Name name1 = new Name("John Doe");
        Name name2 = new Name("JOhN doe");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));

        name1 = new Name("john doe");
        name2 = new Name("JOHN DOE");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));


        name1 = new Name("jon doe");
        name2 = new Name("johnny do");
        assertFalse(name1.isSimilar(name2));
        assertFalse(name2.isSimilar(name1));
    }

    @Test
    public void subsetNames() throws IllegalValueException {
        Name name1 = new Name("John");
        Name name2 = new Name("JOhN doe");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));


        name1 = new Name("john doe jane");
        name2 = new Name("JOHN");
        assertTrue(name1.isSimilar(name2));
        assertTrue(name2.isSimilar(name1));

        name1 = new Name("john doe jane");
        name2 = new Name("joh");
        assertFalse(name1.isSimilar(name2));
        assertFalse(name2.isSimilar(name1));
    }
}
