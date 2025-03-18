package com.example.Workshop_Address_Book.service;

import com.example.Workshop_Address_Book.model.AddressBookEntry;

import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<AddressBookEntry> getAllContacts();
    Optional<AddressBookEntry> getContactById(Long id);
    AddressBookEntry addContact(AddressBookEntry contact);
    AddressBookEntry updateContact(Long id, AddressBookEntry updatedContact);
    void deleteContact(Long id);
}