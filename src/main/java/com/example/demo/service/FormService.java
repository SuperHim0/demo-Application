package com.example.demo.service;

import com.example.demo.entities.ContactFrom;

import java.util.List;

public interface FormService {

    ContactFrom save(ContactFrom contactFrom);

    ContactFrom getById(ContactFrom id);

    List<ContactFrom> getAll();

    ContactFrom getByPhoneNumber(ContactFrom phoneNumber);

    ContactFrom getByEmail (ContactFrom email);
}
