package com.cwrw.haf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.repository.PhoneBookRepository;


public class PhoneBookServiceImpl implements PhoneBookService {

	@Autowired
	PhoneBookRepository repository;

	public void setPhoneBookRepository(PhoneBookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void addContact(Contact contact) {
		repository.addContact(contact);

	}

	@Override
	public void addContacts(List<Contact> contacts) {
		repository.addContacts(contacts);
	}

	@Override
	public Integer getNumberOfContacts() {
		return repository.getNumberOfContacts();
	}

	@Override
	public List<Contact> getAllContacts() {
		return repository.getAllContacts();
	}

	@Override
	public List<Contact> getAllContactsInLastNameOrder() {
		return repository.getAllContactsInLastNameOrder();
	}

}
