package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer")
    public String listCustomer(@RequestParam("s") Optional<String> s,
                               @PageableDefault(size = 5) Pageable pageable,Model model){
        Page<Customer> customerList = null;
        if(!s.isPresent()){
            customerList=customerService.findAll(pageable);
        }else {
            customerList = customerService.findAllByFirstNameContaining(s.get(),pageable);
            model.addAttribute("keyword",s.get());
        }
        model.addAttribute("customers",customerList);
        return "customerList";
    }


//    @GetMapping("/customer")
//    public String showCustomer(Model model,@PageableDefault(size = 2) Pageable pageable){
//        Page<Customer> customers = customerService.findAll(pageable);
//        model.addAttribute("customers",customers);
//        return "customerList";
//
//    }

    @GetMapping("/customer/create")
    public String goCreateCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "customerCreate";
    }

    @PostMapping("/customer/create")
    public String createProvince(@ModelAttribute("customer") Customer customer , RedirectAttributes redirectAttributes){
        customerService.save(customer);
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
