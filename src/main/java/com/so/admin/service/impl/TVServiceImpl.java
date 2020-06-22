package com.so.admin.service.impl;

import org.springframework.stereotype.Service;

import com.so.admin.entity.TV;
import com.so.admin.exceptions.TVNotFoundException;
import com.so.admin.repository.TVRepository;
import com.so.admin.service.TVService;
import java.util.List;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TVServiceImpl implements TVService {

    private final TVRepository tvRepository;

    @Override
    public TV getTVById(String id) {
        return tvRepository.findById(id)
            .orElseThrow(() ->
                new TVNotFoundException(String.format("Unable to find tv with id: %s", id)));
    }

    @Override
    public List<TV> getAllTVs() {
        return tvRepository.findAll();
    }

    @Override
    public TV createTV(TV tv) {
        return tvRepository.saveAndFlush(tv);
    }

    @Override
    public TV updateTV(TV tv) {
        return tvRepository.saveAndFlush(tv);
    }

    @Override
    public void deleteTVById(String id) {
        tvRepository.deleteById(id);
    }
}
