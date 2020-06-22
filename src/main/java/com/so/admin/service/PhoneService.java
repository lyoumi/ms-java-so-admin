package com.so.admin.service;

import com.so.admin.entity.Phone;
import java.util.List;

public interface PhoneService {

    Phone getPhoneById(String id);

    List<Phone> getAllPhones();

    Phone createPhone(Phone phone);

    Phone updatePhone(Phone phone);

    void deletePhoneById(String id);
}
