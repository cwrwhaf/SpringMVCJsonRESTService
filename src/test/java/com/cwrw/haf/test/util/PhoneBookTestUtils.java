package com.cwrw.haf.test.util;

import com.cwrw.haf.dto.Contact;

public abstract class PhoneBookTestUtils {

	public PhoneBookTestUtils() {
		super();
	}

	protected Contact createContact(String firstName, String lastName, String phoneNumber) {
				Contact contact = new Contact();
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setTelephoneNumber(phoneNumber);
				return contact;
			}

}