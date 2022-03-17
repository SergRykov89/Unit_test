package com.company;

public class Main {

    public static void main(String[] args) {



        Contact contact1 = new Contact("дима", "89563254789");
        Contact contact2 = new Contact("саша", "89658974562");
        Contact contact3 = new Contact("Макс", "89758694523");
        Contact contact = new Contact("Маша", "89758694723");
        PhoneBook phoneContacts = new PhoneBook();
        phoneContacts.addNewGroup("друзья");
        phoneContacts.addNewGroup("работа");
        phoneContacts.addContact("друзья", contact1);
        phoneContacts.addContact("работа", contact1);
        phoneContacts.addContact("друзья", contact2);
        phoneContacts.addContact("друзья", contact3);
        phoneContacts.addNewGroup("школа");
        phoneContacts.addContact("школа", contact3);
        phoneContacts.addContact("школа", contact1);
        phoneContacts.addContact("школа", contact2);
        phoneContacts.searchByGroup("друзья");
        System.out.println(phoneContacts.searchByNumber("89758694524"));










    }
}
