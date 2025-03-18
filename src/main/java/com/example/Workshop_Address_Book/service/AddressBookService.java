package com.example.Workshop_Address_Book.service;

import com.example.Workshop_Address_Book.model.AddressBookEntry;
import com.example.Workshop_Address_Book.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;

    public List<AddressBookEntry> getAllContacts() {
        return addressBookRepository.findAll();
    }
}