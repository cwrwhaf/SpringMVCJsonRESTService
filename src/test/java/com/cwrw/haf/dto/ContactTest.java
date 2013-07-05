package com.cwrw.haf.dto;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.test.util.PhoneBookTestUtils;


public class ContactTest extends PhoneBookTestUtils {

	@Test
	public void sortInLastNameOrderTest() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(createContact("Aaron", "Zachary", "1234"));
		contacts.add(createContact("Baron", "Xachary", "1234"));
		contacts.add(createContact("Caron", "Wachary", "1234"));
		contacts.add(createContact("Daron", "Qachary", "1234"));
		contacts.add(createContact("Earon", "Qachary", "1234"));
		contacts.add(createContact("Baron", "Qachary", "1234"));

		Collections.sort(contacts);

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
