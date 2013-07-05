package com.cwrw.haf.main;

import java.util.List;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.repository.PhoneBookDao;
import com.cwrw.haf.repository.PhoneBookRepository;
import com.cwrw.haf.util.ContactUtilities;



public class PhoneBookFactory {
	
	public PhoneBook createPhoneBook(){
		PhoneBookRepository phoneBookRepository = new PhoneBookDao();
		return new PhoneBook(phoneBookRepository);
	}
	
	public PhoneBook createPhoneBook(PhoneBook phoneBook1, PhoneBook phoneBook2){
		PhoneBookRepository phoneBookRepository = new PhoneBookDao();
		PhoneBook phoneBook = new PhoneBook(phoneBookRepository);
		
		List<Contact> contacts = ContactUtilities.filterUniqueContacts(phoneBook1.getAllContacts(), phoneBook2.getAllContacts());
		phoneBook.addContacts(contacts);
		return phoneBook;
		
	}

}
