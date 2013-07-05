package com.cwrw.haf.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.cwrw.haf.main.PhoneBook;
import com.cwrw.haf.main.PhoneBookFactory;
import com.cwrw.haf.test.util.PhoneBookTestUtils;




public class PhoneBookFactoryTest  extends PhoneBookTestUtils {
	
	PhoneBookFactory factory;
	@Before
	public void setup(){
		factory = new PhoneBookFactory();
	}

	@Test
	public void createPhoneBookTest(){
		
		PhoneBook phoneBook = factory.createPhoneBook();
		assertNotNull("Phone book was not created", phoneBook );
	}
	
	@Test
	public void createPhoneBookAddContactIntegrationTest(){
		PhoneBook phoneBook = factory.createPhoneBook();
		phoneBook.addContact(createContact("firstName","lastName", "1234567"));
		
		assertNotNull("Should have a contact", phoneBook.getAllContacts());
		assertEquals("Should have one contact", 1, phoneBook.getNumberOfContacts());
	}
	
	@Test
	public void createUniqueContactPhoneBookTest(){
		PhoneBook phoneBook1 = factory.createPhoneBook();
		PhoneBook phoneBook2 = factory.createPhoneBook();
		
		PhoneBook phoneBook = factory.createPhoneBook(phoneBook1, phoneBook2);
	assertNotNull("Phone book was not created", phoneBook);
	}
}
