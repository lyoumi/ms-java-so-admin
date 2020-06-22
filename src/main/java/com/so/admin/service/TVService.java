package com.so.admin.service;

import com.so.admin.entity.TV;
import java.util.List;

public interface TVService {

    TV getTVById(String id);

    List<TV> getAllTVs();

    TV createTV(TV tv);

    TV updateTV(TV tv);

    void deleteTVById(String id);
}
