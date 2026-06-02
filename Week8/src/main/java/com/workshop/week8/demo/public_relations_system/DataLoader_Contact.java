package com.workshop.week8.demo.public_relations_system;

import com.workshop.week8.model.public_relations_system.Contact;
import com.workshop.week8.model.public_relations_system.Name;
import com.workshop.week8.repository.public_relations_repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader_Contact implements CommandLineRunner {

    private final ContactRepository contactRepository;

    public DataLoader_Contact(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadContactData();
    }

    private void loadContactData() {
        Contact contact1 = new Contact(null, "Ironhack", "CTO",
                new Name("Dr.", "Elena", "María", "García"));

        Contact contact2 = new Contact(null, "TechCorp", "CEO",
                new Name("Sr.", "Carlos", "Antonio", "López"));

        Contact contact3 = new Contact(null, "InnovateLab", "Manager",
                new Name("Sra.", "María", "Isabel", "Fernández"));

        Contact contact4 = new Contact(null, "Ironhack",  "Student",
                new Name("Sr.", "Manuel", "Candela", "Manchon"));


        contactRepository.save(contact1);
        contactRepository.save(contact2);
        contactRepository.save(contact3);
        contactRepository.save(contact4);

        System.out.println("Contacts loaded");
    }
}
