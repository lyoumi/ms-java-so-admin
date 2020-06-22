package com.so.admin.service.impl;

import org.springframework.stereotype.Service;

import com.so.admin.entity.Phone;
import com.so.admin.exceptions.PhoneNotFoundException;
import com.so.admin.repository.PhoneRepository;
import com.so.admin.service.PhoneService;
import java.util.List;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Override
    public Phone getPhoneById(String id) {
        return phoneRepository.findById(id)
            .orElseThrow(() ->
                new PhoneNotFoundException(String.format("Unable to find phone with id: %s", id)));
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone createPhone(Phone phone) {
        return phoneRepository.saveAndFlush(phone);
    }

    @Override
    public Phone updatePhone(Phone phone) {
        return phoneRepository.saveAndFlush(phone);
    }

    @Override
    public void deletePhoneById(String id) {
        phoneRepository.deleteById(id);
    }
}
