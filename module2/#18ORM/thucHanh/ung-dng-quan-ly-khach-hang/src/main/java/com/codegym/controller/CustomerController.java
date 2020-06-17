package com.codegym.controller;

import com.codegym.models.Customer;
import com.codegym.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer")Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView  = new ModelAndView("/customer/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("message","New customer created successfully");
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView listCustomer(){
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditFrom(@PathVariable Long id){
            Customer customer =customerService.findById(id);
            if(customer != null){
                ModelAndView modelAndView = new ModelAndView("/customer/edit");
                modelAndView.addObject("customer",customer);
                return modelAndView;
            }else {
                ModelAndView modelAndView = new ModelAndView("/error.404");
                return modelAndView;
            }

    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer ,
                                 RedirectAttributes redirectAttributes){
                customerService.save(customer);
                redirectAttributes.addFlashAttribute("customer",customer);
                return "redirect:/customers";

    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
           Customer customer = customerService.findById(id);
           if(customer != null){
               ModelAndView modelAndView = new ModelAndView("/customer/delete");
               modelAndView.addObject("customer", customer);
               return modelAndView;
           }else {
               ModelAndView modelAndView = new ModelAndView("/error:404");
               return modelAndView;
           }

    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer ,
                                       RedirectAttributes redirectAttributes){
            customerService.remove(customer.getId());
            redirectAttributes.addFlashAttribute("customer",customer);
        return "redirect:/customers";

    }



}
