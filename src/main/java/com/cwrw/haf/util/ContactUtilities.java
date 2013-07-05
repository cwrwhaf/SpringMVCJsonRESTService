package com.cwrw.haf.util;

import java.util.ArrayList;
import java.util.List;

import com.cwrw.haf.dto.Contact;



public class ContactUtilities {

	public static List<Contact> filterUniqueContacts(List<Contact> contacts1, List<Contact> contacts2){
		List<Contact> uniqueContacts = new ArrayList<Contact>();
		List<Contact> duplicateContacts = new ArrayList<Contact>();
		uniqueContacts.addAll(contacts1);
		uniqueContacts.addAll(contacts2);
		
		for(Contact contact1: contacts1){
			for(Contact contact2: contacts2){
				if(contact1.equals(contact2)){
					duplicateContacts.add(contact1);
				}
			}
		}
		
		uniqueContacts.removeAll(duplicateContacts);
		return uniqueContacts;
	}
}
