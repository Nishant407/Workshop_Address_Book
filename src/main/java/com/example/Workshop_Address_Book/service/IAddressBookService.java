package com.example.Workshop_Address_Book.service;

import com.example.Workshop_Address_Book.dto.AddressBookDTO;
//import com.bridgelabz.AddressBook_Workshop.model.AddressBookEntry;

import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<AddressBookDTO> getAllContacts();
    Optional<AddressBookDTO> getContactById(Long id);
    AddressBookDTO addContact(AddressBookDTO contactDTO);
    AddressBookDTO updateContact(Long id, AddressBookDTO contactDTO);
    void deleteContact(Long id);
}