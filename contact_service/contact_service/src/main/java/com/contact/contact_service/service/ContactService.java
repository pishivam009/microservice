package com.contact.contact_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;


public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}
