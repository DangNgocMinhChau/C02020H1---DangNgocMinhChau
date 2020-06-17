package com.codegym.controller;

import com.codegym.models.Province;
import com.codegym.sevices.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/province")
    public String showProvince(Model model){
        Iterable<Province> provinceList = provinceService.findAll();
        model.addAttribute("provinceList",provinceList);
        return "listProvince";
    }

    @GetMapping("/province/create")
    public String goCreateProvince(Model model){
        model.addAttribute("province",new Province());
        return "createProvince";
    }

    @PostMapping("/province/create")
    public String createProvince(@ModelAttribute("province") Province province , RedirectAttributes redirectAttributes){
        provinceService.save(province);
        redirectAttributes.addFlashAttribute("message","ban da tao moi thanh cong");
        return "redirect:/province";
    }

    @GetMapping("/province/edit/{id}")
    public String goEditProvince(@PathVariable Integer id,Model model){
        Province province = provinceService.findById(id);
        if(province != null){
            model.addAttribute("province",province);
        }else {
            model.addAttribute("error");
        }
        return "editProvince";
    }

    @PostMapping("/province/edit")
    public String editProvince(@ModelAttribute("province") Province province , RedirectAttributes redirectAttributes){
        provinceService.save(province);
        redirectAttributes.addFlashAttribute("message","da update thanh cong");
        return "redirect:/province";
    }

    @GetMapping("/province/delete/{id}")
    public String goDeleteForm(@PathVariable Integer id, Model model){
        Province province = provinceService.findById(id);
        if(province != null){
            model.addAttribute("province",province);
        }else {
            model.addAttribute("error");
        }
        return "deleteProvince";
    }

    @PostMapping("/province/delete")
    public String deleteProvince(@ModelAttribute ("province") Province province,RedirectAttributes redirectAttributes){
        provinceService.remove(province.getId());
        redirectAttributes.addFlashAttribute("message","ban da xoa thanh cong");
        return "redirect:/province";
    }
}
