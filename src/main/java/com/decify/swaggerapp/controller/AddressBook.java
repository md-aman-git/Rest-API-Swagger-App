package com.decify.swaggerapp.controller;

import com.decify.swaggerapp.model.Contact;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class AddressBook {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds contact based on id provided",
            notes = "Provide an id for which you want to find the contact",
            response = Contact.class)
    ResponseEntity<Contact> getContact(@ApiParam(value = "Pass an id value for the contact you need",
            required = true) @PathVariable String id) {
        return ResponseEntity.status(200).body(contacts.get(id));
    }

    @GetMapping("/")
    ResponseEntity<List<Contact>> getAllContacts() {
        return ResponseEntity.status(200).body(new ArrayList<>(contacts.values()));
    }

    @PostMapping("/")
    ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(contact);
    }
}
