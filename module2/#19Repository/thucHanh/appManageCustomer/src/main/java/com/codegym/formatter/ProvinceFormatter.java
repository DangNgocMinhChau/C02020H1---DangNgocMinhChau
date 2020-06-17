package com.codegym.formatter;

import com.codegym.models.Province;
import com.codegym.sevices.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ProvinceFormatter implements Formatter<Province> {
    ProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(ProvinceService provinceService){
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + "," + object.getName() +"]";
    }
}
