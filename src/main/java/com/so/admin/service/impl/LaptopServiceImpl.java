package com.so.admin.service.impl;

import org.springframework.stereotype.Service;

import com.so.admin.entity.Laptop;
import com.so.admin.exceptions.LaptopNotFoundException;
import com.so.admin.repository.LaptopRepository;
import com.so.admin.service.LaptopService;
import java.util.List;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    @Override
    public Laptop getLaptopById(String id) {
        return laptopRepository.findById(id)
            .orElseThrow(() ->
                new LaptopNotFoundException(String.format("Unable to find laptop with id: %s", id)));
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.saveAndFlush(laptop);
    }

    @Override
    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepository.saveAndFlush(laptop);
    }

    @Override
    public void deleteById(String id) {
        laptopRepository.deleteById(id);
    }
}
