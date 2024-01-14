package oopSeminar5.task2;

import java.util.ArrayList;
import java.util.List;

public class ContactModel {
    private List<Contact> contacts;

    public ContactModel() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }
}
