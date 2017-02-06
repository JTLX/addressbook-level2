package seedu.addressbook.data.person;

import seedu.addressbook.data.tag.Tag;

/**
 * Association class for tags. Tracks tags that are added or removed.
 */
public class Tagging {
    private boolean isAddition;
    private Person person;
    private Tag tag;

    public Tagging(boolean isAddition, Person person, Tag tag) {
        this.isAddition = isAddition;
        this.person = person;
        this.tag = tag;
    }

    @Override
    public String toString() {
        String operator = isAddition ? "+" : "-";
        return operator + " " + person.toString() + " " + tag.toString();
    }
}
