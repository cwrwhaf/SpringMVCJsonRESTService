package com.cwrw.haf;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.main.PhoneBook;
import com.cwrw.haf.main.PhoneBookFactory;

public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.requirementOnePrintContactsInNameOrder();
        app.requirementTwoPrintContactsUniqueToTwoAddressBooks();
    }
    
    public void requirementOnePrintContactsInNameOrder(){
    	System.out.println("Requirement 1: Print contacts in name order (Last name order)");
    	PhoneBookFactory factory = new PhoneBookFactory();
    	PhoneBook phoneBook = factory.createPhoneBook();
    	phoneBook.addContact(createContact("Aaron", "Zan", "1234567"));
    	phoneBook.addContact(createContact("Baron", "Yan", "1234567"));
    	phoneBook.addContact(createContact("Caron", "Xan", "1234567"));
    	phoneBook.addContact(createContact("Daron", "Wan", "1234567"));
    	
    	for(Contact contact: phoneBook.getAllContactsInLastNameOrder()){
    		System.out.println(contact);
    	}
    	
    }
    
    public void requirementTwoPrintContactsUniqueToTwoAddressBooks(){
    	System.out.println("Requirement 2: Print unique contacts in two different phone books");
    	PhoneBookFactory factory = new PhoneBookFactory();
    	PhoneBook phoneBook1 = factory.createPhoneBook();
    	phoneBook1.addContact(createContact("Aaron", "Zan", "1234567"));
    	phoneBook1.addContact(createContact("Baron", "Yan", "1234567"));
    	phoneBook1.addContact(createContact("Caron", "Xan", "1234567"));
    	phoneBook1.addContact(createContact("Unique", "One", "1234567"));
    	
    	PhoneBook phoneBook2 = factory.createPhoneBook();
    	phoneBook2.addContact(createContact("Aaron", "Zan", "1234567"));
    	phoneBook2.addContact(createContact("Baron", "Yan", "1234567"));
    	phoneBook2.addContact(createContact("Caron", "Xan", "1234567"));
    	phoneBook2.addContact(createContact("Unique1", "Two", "1234567"));
    	
    	PhoneBook uniquePhoneBook = factory.createPhoneBook(phoneBook1, phoneBook2);
    	
    	for(Contact contact: uniquePhoneBook.getAllContacts()){
    		System.out.println(contact);
    	}
    	
    }
    
    private Contact createContact(String firstName, String lastName, String telephoneNumber){
    	Contact contact = new Contact();
    	contact.setFirstName(firstName);
    	contact.setLastName(lastName);
    	contact.setTelephoneNumber(telephoneNumber);
    	
    	return contact;
    }
}
