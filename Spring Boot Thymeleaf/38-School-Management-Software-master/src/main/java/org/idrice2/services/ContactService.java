package org.idrice2.services;


import org.idrice2.entities.Contact;

public interface ContactService {

    Contact saveContact(Contact contact);

    Iterable<Contact> ShowContact();

    Contact getContactById(long id);

    void deleteContact(Contact contact);
}