package com.so.admin.rest;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.so.admin.entity.Phone;
import com.so.admin.service.PhoneService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("phone")
@RestController
public class PhoneController {

    private final PhoneService phoneService;

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    public Phone getPhoneById(@PathVariable("id") String id) {
        return phoneService.getPhoneById(id);
    }

    @ResponseStatus(OK)
    @GetMapping
    public List<Phone> getAllPhones() {
        return phoneService.getAllPhones();
    }

    @ResponseStatus(CREATED)
    @PostMapping
    public Phone createPhone(@RequestBody Phone phone) {
        return phoneService.createPhone(phone);
    }

    @ResponseStatus(OK)
    @PutMapping
    public Phone updatePhone(@RequestBody Phone phone) {
        return phoneService.updatePhone(phone);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deletePhoneById(@PathVariable("id") String id) {
        phoneService.deletePhoneById(id);
    }

}
