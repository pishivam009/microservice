package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	//fake List of contacts
	List<Contact> list = List.of(
			new Contact(1L, "ps1@gmail.com","Piyush", 123456789L),
			new Contact(2L, "ps1@gmail.com","Piyush", 123456789L),
			new Contact(3L, "ps1@gmail.com","Piyush2", 123456787L),
			new Contact(4L, "ps1@gmail.com","Piyush3", 123456786L),
			new Contact(5L, "ps1@gmail.com","Piyush4", 123456785L));
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
