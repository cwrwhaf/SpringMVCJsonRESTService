package com.cwrw.haf.main;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.main.PhoneBook;
import com.cwrw.haf.repository.PhoneBookDao;
import com.cwrw.haf.repository.PhoneBookRepository;



public class PhoneBookTest {

	PhoneBook phoneBook;
	PhoneBookRepository phoneBookRepository;
	Contact contact1;
	Contact contact2;

	@Before
	public void setup() {
		phoneBookRepository = new PhoneBookDao();
		phoneBook = new PhoneBook(phoneBookRepository);
		contact1 = new Contact();
		contact2 = new Contact();
	}

	@Test
	public void createPhoneBookTest() {
		assertNotNull("Phone book doesn't exist", phoneBook);

	}

	@Test
	public void addContactToPhoneBookTest() {
		phoneBook.addContact(contact1);

		assertEquals("Should have 1 contact", 1, phoneBook.getNumberOfContacts());
	}

	@Test
	public void addTwoContactsToPhoneBook() {
		phoneBook.addContact(contact1);
		phoneBook.addContact(contact2);

		assertEquals("Should have 2 contacts", 2, phoneBook.getNumberOfContacts());
	}

}
