package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    Contact contact;

    @BeforeEach
    void createContact() {
        contact = new Contact("Вася", "89563487921");
    }

    @Test
    void getPhoneNumber() {
        assertEquals("89563487921", contact.getPhoneNumber());
    }

    @Test
    void getName() {
        assertEquals("Вася", contact.getName());
    }
}