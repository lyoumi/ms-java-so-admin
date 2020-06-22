package com.so.admin.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.so.admin.entity.TV;
import com.so.admin.service.TVService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("tv")
@RestController
public class TVController {

    private final TVService tvService;

    @GetMapping(path = "/{id}")
    public TV getTVById(@PathVariable("id") String id) {
        return tvService.getTVById(id);
    }

    @GetMapping
    public List<TV> getAllTVs() {
        return tvService.getAllTVs();
    }

    @PostMapping
    public TV createTV(@RequestBody TV tv) {
        return tvService.createTV(tv);
    }

    @PutMapping
    public TV updateTV(@RequestBody TV tv) {
        return tvService.updateTV(tv);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTVById(@PathVariable("id") String id) {
        tvService.deleteTVById(id);
    }
}
