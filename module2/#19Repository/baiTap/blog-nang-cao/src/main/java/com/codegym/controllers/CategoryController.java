package com.codegym.controllers;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import com.codegym.services.category.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryServices categoryServices;


    @GetMapping("/category")
    public String displayCategory(Model model){
        List<Category> categoryList = categoryServices.findAll();
        model.addAttribute("categoryList",categoryList);
        return "listCategory";
    }

    @GetMapping("/category/create")
    public String goCreateForm(Model model){
        model.addAttribute("category",new Category());
        return "createCategory";
    }

    @PostMapping("/category/create")
    public String createCategory(@ModelAttribute("category") Category category, RedirectAttributes redirectAttributes){
        categoryServices.save(category);
        redirectAttributes.addFlashAttribute("message","da them thanh cong");
        return "redirect:/category";

    }

    @GetMapping("/category/edit/{id}")
    public String goEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("category",categoryServices.findById(id));
        return "editCategory";
    }

    @PostMapping("/category/edit")
    public String editCategory(@ModelAttribute("category") Category category, RedirectAttributes redirectAttributes){
        categoryServices.save(category);
        redirectAttributes.addFlashAttribute("message","da thay doi thanh cong");
        return "redirect:/category";
    }

    @GetMapping("/category/delete/{id}")
    public String goDelForm(@PathVariable Integer id, Model model){
        model.addAttribute("category",categoryServices.findById(id));
        return "deleteCategory";
    }
    @PostMapping("/category/delete")
    public String delCategory(@ModelAttribute("category") Blog blog, RedirectAttributes redirectAttributes){
        categoryServices.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message","da xoa thanh cong");
        return "redirect:/category";
    }
}
