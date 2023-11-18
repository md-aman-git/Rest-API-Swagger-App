package com.decify.swaggerapp.controller;

import com.decify.swaggerapp.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class AddressBook {

    ConcurrentMap<Integer, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    Contact getContact(@PathVariable int id) {
        return contacts.get(id);
    }

    @GetMapping("/")
    List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @PostMapping("/")
    Contact addContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
