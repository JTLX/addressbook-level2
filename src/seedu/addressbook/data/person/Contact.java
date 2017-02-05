package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Stores information about a contact.
 */
public class Contact {
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given data.
     *
     * @throws IllegalValueException if given data is invalid.
     */
    public Contact(String contact, boolean isPrivate, String dataConstraints, String validationRegex) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedContact = contact.trim();
        if (!isValidContact(trimmedContact, validationRegex)) {
            throw new IllegalValueException(dataConstraints);
        }
        this.value = trimmedContact;
    }

    /**
     * Checks if a given string is valid person data.
     */
    public static boolean isValidContact(String test, String validationRegex) {
        return test.matches(validationRegex);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
