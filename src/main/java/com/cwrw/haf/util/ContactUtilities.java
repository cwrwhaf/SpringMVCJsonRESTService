package com.cwrw.haf.util;

import java.util.Iterator;
import java.util.List;

import com.cwrw.haf.dto.Contact;

public class ContactUtilities {

	public static List<Contact> filterUniqueContacts(List<Contact> contacts1, List<Contact> contacts2){
		
		Iterator<Contact> contacts1Iterator = contacts1.iterator();
		while(contacts1Iterator.hasNext()){
			for(Contact contact2: contacts2){
				if(contacts1Iterator.next().equals(contact2)){
					contacts1Iterator.remove();
				}
			}
		    
		}
		return contacts1;
	}
}
