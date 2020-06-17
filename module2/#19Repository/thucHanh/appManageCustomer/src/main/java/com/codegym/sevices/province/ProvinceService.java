package com.codegym.sevices.province;

import com.codegym.models.Province;

public interface ProvinceService {
    Iterable<Province> findAll();
    Province findById(Integer id);
    void save(Province province);
    void remove(Integer id);
}
