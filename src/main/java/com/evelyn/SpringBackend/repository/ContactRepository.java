package com.evelyn.SpringBackend.repository;
import com.evelyn.SpringBackend.models.Contact;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    
}
