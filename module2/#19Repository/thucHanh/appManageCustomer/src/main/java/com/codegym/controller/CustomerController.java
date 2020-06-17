package com.codegym.controller;

import com.codegym.models.Customer;
import com.codegym.models.Province;
import com.codegym.sevices.customer.CustomerService;
import com.codegym.sevices.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }


    @GetMapping("/customer")
    public String showCustomer(Model model){
        Iterable<Customer>customers = customerService.findAll();
        model.addAttribute("customer",customers);
        return "customerList";
    }

    @GetMapping("/customer/create")
    public String goCreateCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "customerCreate";
    }

    @PostMapping("/customer/create")
    public String createProvince(@ModelAttribute("customer") Customer customer ,@ModelAttribute("provinces") Province province, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        provinceService.save(province);
        redirectAttributes.addFlashAttribute("message","ban da tao moi thanh cong");
        return "redirect:/customer";
    }

    @GetMapping("/customer/edit/{id}")
    public String goEditProvince(@PathVariable Integer id, Model model){
        Customer customer = customerService.findById(id);
        if(customer != null){
            model.addAttribute("customer",customer);
        }else {
            model.addAttribute("error");
        }
        return "customerEdit";
    }

    @PostMapping("/customer/edit")
    public String editProvince(@ModelAttribute("customer") Customer customer , RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","da update thanh cong");
        return "redirect:/customer";
    }

    @GetMapping("/customer/delete/{id}")
    public String goDeleteForm(@PathVariable Integer id, Model model){
        Customer customer = customerService.findById(id);
        if(customer != null){
            model.addAttribute("customer",customer);
        }else {
            model.addAttribute("error");
        }
        return "customerDelete";
    }

    @PostMapping("/customer/delete")
    public String deleteProvince(@ModelAttribute ("customer") Customer customer,RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message","ban da xoa thanh cong");
        return "redirect:/customer";
    }


}
