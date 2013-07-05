package com.cwrw.haf.repository;

import java.util.List;

import com.cwrw.haf.dto.Contact;


public interface PhoneBookRepository {
	public void addContact(Contact contact);
	public void addContacts(List<Contact> contacts);
	public Integer getNumberOfContacts();
	public List<Contact> getAllContacts();
	public List<Contact> getAllContactsInLastNameOrder();

}
