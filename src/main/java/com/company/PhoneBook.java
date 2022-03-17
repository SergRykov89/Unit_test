package com.company;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Contact>> phoneContacts = new HashMap<>();


    public void addNewGroup(String titleGroup) {
        phoneContacts.put(titleGroup, new ArrayList<>());
    }

    public boolean addContact(String titleGroup, Contact contact) {
        if(phoneContacts.get(titleGroup).add(contact)) {
            return true;
        }
        return false;
    }

    public void searchByGroup(String titleGroup) {
        System.out.println(phoneContacts.get(titleGroup));
    }

    public Contact searchByNumber(String phoneNumber) {
        Contact contact = null;
        for (Map.Entry<String, List<Contact>> phoneContact : phoneContacts.entrySet()) {
            for (Contact contact1 : phoneContact.getValue()) {
                if (phoneNumber.equals(contact1.getPhoneNumber())) {
                    contact = contact1;
                    break;
                }
                break;
            }
        }
        return contact;

    }

}





