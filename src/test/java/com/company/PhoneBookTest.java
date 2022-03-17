package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook book;
    Contact contact;

    @BeforeEach
    void createPhoneBook() {
        book = new PhoneBook();
        book.addNewGroup("Друзья");
        contact = new Contact("Вася", "89564792653");
    }

    @Test
    void addContact() {
        assertTrue(book.addContact("Друзья", contact));

    }

    @Test
    void searchByNumber() {
        book.addContact("Друзья", contact);
        assertEquals(contact, book.searchByNumber("89564792653"));
    }
}