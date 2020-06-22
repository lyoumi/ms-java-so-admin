package com.so.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.so.admin.entity.Laptop;


public interface LaptopRepository extends JpaRepository<Laptop, String> {

}
