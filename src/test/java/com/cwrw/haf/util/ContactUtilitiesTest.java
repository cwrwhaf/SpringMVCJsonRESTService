package com.cwrw.haf.util;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.test.util.PhoneBookTestUtils;
import com.cwrw.haf.util.ContactUtilities;


public class ContactUtilitiesTest  extends PhoneBookTestUtils {

	@Test
	public void filterUniqueContactsTest(){
		List<Contact> contacts1 = new ArrayList<Contact>();
		List<Contact> contacts2 = new ArrayList<Contact>();
		
		contacts1.add(createContact("Dr","Karl","1234567"));
		contacts2.add(createContact("Dr","Karl","1234567"));
		
		contacts1.add(createContact("Zan","Rowe","1234567"));
		contacts2.add(createContact("Zan","Rowe","1234567"));
		
		contacts1.add(createContact("Unique","one","1234567"));
		contacts1.add(createContact("Unique","two","1234567"));
		
		List<Contact> uniqueContacts = ContactUtilities.filterUniqueContacts(contacts1, contacts2);
		
		assertEquals("Should have 2 contacts", 2, uniqueContacts.size());
		// how to test the list is unique without making a huge unreadable test?
		// Fail if either Dr Karl or Zan turn up in uniqueContacts
		for(Contact contact: uniqueContacts){
			assertFalse("Should not have Dr Karl", "Dr".equalsIgnoreCase(contact.getFirstName()));
			assertFalse("Should not have Zan", "Zan".equalsIgnoreCase(contact.getFirstName()));
		}
	}

}
