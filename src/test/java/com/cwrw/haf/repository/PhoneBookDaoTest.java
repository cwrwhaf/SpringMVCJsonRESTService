package com.cwrw.haf.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.repository.PhoneBookDao;
import com.cwrw.haf.test.util.PhoneBookTestUtils;


public class PhoneBookDaoTest extends PhoneBookTestUtils {

	PhoneBookDao phoneBookDao;

	@Before
	public void setup() {
		phoneBookDao = new PhoneBookDao();
	}

	@Test
	public void addContactTest() {
		phoneBookDao.addContact(createContact("firstName","lastName", "1234567"));
		assertNotNull("Should have a contact", phoneBookDao.getAllContacts());
	}
	
	@Test
	public void getContactsSortedInLastNameOrderTest(){
		List<Contact> inputContacts = new ArrayList<Contact>();
		inputContacts.add(createContact("Aaron","Zachary", "1234"));
		inputContacts.add(createContact("Baron","Xachary", "1234"));
		inputContacts.add(createContact("Caron","Wachary", "1234"));
		inputContacts.add(createContact("Daron","Qachary", "1234"));
		inputContacts.add(createContact("Earon","Qachary", "1234"));
		inputContacts.add(createContact("Baron","Qachary", "1234"));

		phoneBookDao.addContacts(inputContacts);
		
		List<Contact> contacts = phoneBookDao.getAllContactsInLastNameOrder();

		assertTrue(
				"Expecting Baron Qachary",
				contacts.get(0).toString()
						.equalsIgnoreCase("Contact [firstName=Baron, lastName=Qachary, telephoneNumber=1234]"));
		assertTrue(
				"Expecting Daron Qachary",
				contacts.get(1).toString()
				.equalsIgnoreCase(
									"Contact [firstName=Daron, lastName=Qachary, telephoneNumber=1234]"));
			assertTrue(
					"Expecting Earon Qachary",
					contacts.get(2)
							.toString()
							.equalsIgnoreCase(
									"Contact [firstName=Earon, lastName=Qachary, telephoneNumber=1234]"));
			assertTrue(
					"Expecting Caron Wachary",
					contacts.get(3)
							.toString()
							.equalsIgnoreCase(
									"Contact [firstName=Caron, lastName=Wachary, telephoneNumber=1234]"));
			assertTrue(
					"Expecting Baron Xachary",
					contacts.get(4)
							.toString()
							.equalsIgnoreCase(
									"Contact [firstName=Baron, lastName=Xachary, telephoneNumber=1234]"));
			assertTrue(
					"Expecting Aaron Zachary",
					contacts.get(5)
							.toString()
							.equalsIgnoreCase(
									"Contact [firstName=Aaron, lastName=Zachary, telephoneNumber=1234]"));

	}

}
