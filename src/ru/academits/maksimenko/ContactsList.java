package ru.academits.maksimenko;

import ru.academits.maksimenko.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsList {
    private static final List<Contact> contactList = new ArrayList<>();

    public static List<Contact> getAllContacts() {
        return contactList;
    }

    public static void addContact(Contact contact){
        contactList.add(contact);
    }
}
