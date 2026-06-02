package com.workshop.week8.repository.public_relations_repository;

import com.workshop.week8.model.public_relations_system.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByCompany(String company);
    List<Contact> findByTitle(String title);
}
