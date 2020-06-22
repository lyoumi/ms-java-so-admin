package com.so.admin.service;

import com.so.admin.entity.Laptop;
import java.util.List;

public interface LaptopService {

    Laptop getLaptopById(String id);

    List<Laptop> getAllLaptops();

    Laptop createLaptop(Laptop laptop);

    Laptop updateLaptop(Laptop laptop);

    void deleteById(String id);
}
