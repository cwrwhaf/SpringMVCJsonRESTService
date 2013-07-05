package com.cwrw.haf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwrw.haf.dto.Contact;
import com.cwrw.haf.service.PhoneBookService;


@Controller
@RequestMapping("phone")
public class PhoneBookController {
	
	@Autowired
	PhoneBookService phoneBookService;
	
	public void setPhoneBookService(PhoneBookService phoneBookService){
		this.phoneBookService = phoneBookService;
	}
	
	@RequestMapping("book/allsorted")
    @ResponseBody
    public List<Contact> allSorted() {
        return phoneBookService.getAllContactsInLastNameOrder();
    }
	
	// test service with real data
	@RequestMapping("book/all")
    @ResponseBody
    public List<Contact> all() {
		List<Contact> contacts = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setFirstName("first Name");
		contact.setLastName("last name");
		contact.setTelephoneNumber("1234567");
		contacts.add(contact);
		
        return contacts;
    }
 

}
