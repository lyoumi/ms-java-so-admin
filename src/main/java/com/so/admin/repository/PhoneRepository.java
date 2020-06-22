package com.so.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.so.admin.entity.Phone;


public interface PhoneRepository extends JpaRepository<Phone, String> {

}
