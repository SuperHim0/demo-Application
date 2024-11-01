package com.example.demo.service.impl;

import com.example.demo.entities.ContactFrom;
import com.example.demo.service.FormService;

import java.util.List;

public class FormServiceImp implements FormService {
    @Override
    public ContactFrom save(ContactFrom contactFrom) {
        return null;
    }

    @Override
    public ContactFrom getById(ContactFrom id) {
        return null;
    }

    @Override
    public List<ContactFrom> getAll() {
        return List.of();
    }

    @Override
    public ContactFrom getByPhoneNumber(ContactFrom phoneNumber) {
        return null;
    }

    @Override
    public ContactFrom getByEmail(ContactFrom email) {
        return null;
    }
}
