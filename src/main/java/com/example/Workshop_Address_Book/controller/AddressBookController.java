package com.example.Workshop_Address_Book.controller;

import com.example.Workshop_Address_Book.dto.AddressBookDTO;
//import com.example.Workshop_Address_Book.model.AddressBookEntry;
import com.example.Workshop_Address_Book.service.IAddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping
    public ResponseEntity<List<AddressBookDTO>> getAllContacts() {
        List<AddressBookDTO> contacts = addressBookService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AddressBookDTO> getContactById(@PathVariable Long id) {
        return addressBookService.getContactById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<AddressBookDTO> addContact(@Valid @RequestBody AddressBookDTO contactDTO) {
        AddressBookDTO savedContact = addressBookService.addContact(contactDTO);
        return ResponseEntity.ok(savedContact);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AddressBookDTO> updateContact(@PathVariable Long id,@Valid @RequestBody AddressBookDTO updatedContact) {
        return ResponseEntity.ok(addressBookService.updateContact(id, updatedContact));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        addressBookService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}