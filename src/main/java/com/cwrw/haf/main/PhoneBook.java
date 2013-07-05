package com.cwrw.haf.main;

import java.util.List;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.repository.PhoneBookRepository;



public class PhoneBook {
	private PhoneBookRepository phoneBookRepository;

	public PhoneBook(PhoneBookRepository phoneBookRepository) {
		this.phoneBookRepository = phoneBookRepository;
	}

	public void addContact(Contact contact) {
		phoneBookRepository.addContact(contact);
	}

	public int getNumberOfContacts() {
		return phoneBookRepository.getNumberOfContacts();
	}

	public List<Contact> getAllContacts() {
		return phoneBookRepository.getAllContacts();
	}

	public List<Contact> getAllContactsInLastNameOrder() {
		return phoneBookRepository.getAllContactsInLastNameOrder();
	}

	public void addContacts(List<Contact> contacts) {
		phoneBookRepository.addContacts(contacts);
	}
	
	
}
