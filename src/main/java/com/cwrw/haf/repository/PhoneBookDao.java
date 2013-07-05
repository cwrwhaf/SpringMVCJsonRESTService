package com.cwrw.haf.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cwrw.haf.dto.Contact;


public class PhoneBookDao implements PhoneBookRepository {
	private List<Contact> contacts;

	public PhoneBookDao() {
		contacts = new ArrayList<Contact>();
	}

	@Override
	public void addContact(Contact contact) {
		contacts.add(contact);

	}

	@Override
	public Integer getNumberOfContacts() {
		return contacts.size();
	}

	@Override
	public List<Contact> getAllContacts() {

		return contacts;
	}

	@Override
	public List<Contact> getAllContactsInLastNameOrder() {
		Collections.sort(contacts);
		return contacts;
	}

	@Override
	public void addContacts(List<Contact> contacts) {
		this.contacts.addAll(contacts);
	}

}
