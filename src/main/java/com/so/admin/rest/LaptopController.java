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

import com.so.admin.entity.Laptop;
import com.so.admin.service.LaptopService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("laptop")
@RestController
public class LaptopController {

    private final LaptopService laptopService;

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    public Laptop getLaptopBuId(@PathVariable("id") String id) {
        return laptopService.getLaptopById(id);
    }

    @ResponseStatus(OK)
    @GetMapping
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();

    }

    @ResponseStatus(CREATED)
    @PostMapping
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @ResponseStatus(OK)
    @PutMapping
    public Laptop updateLaptop(@RequestBody Laptop laptop) {
        return laptopService.updateLaptop(laptop);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteLaptopById(@PathVariable("id") String id) {
        laptopService.deleteById(id);
    }

}
