package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Contact;
import org.ashina.mycontact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public List<Contact> search(String term) {
        return contactRepository.findByNameContaining(term);
    }

    @Override
    public Contact findOne(Integer id) {
        return contactRepository.findOne(id);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        contactRepository.delete(id);
    }
}
