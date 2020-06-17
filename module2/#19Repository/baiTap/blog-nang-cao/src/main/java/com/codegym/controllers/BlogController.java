package com.codegym.controllers;


import com.codegym.models.Blog;
import com.codegym.services.blog.BlogService;
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

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    CategoryServices categoryServices;

    @GetMapping("/")
    public String display(Model model,@PageableDefault(size = 3) Pageable pageable){
        Page<Blog> blogList = blogService.findAll(pageable);
        model.addAttribute("blogList",blogList);
        return "listBlog";
    }

    @GetMapping("/blog/create")
    public String goCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("categoryList",categoryServices.findAll());
        return "createBlog";
    }

    @PostMapping("/blog/create")
    public String createBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","da them thanh cong");
        return "redirect:/";

    }

    @GetMapping("/blog/edit/{id}")
    public String goEditForm(@PathVariable Integer id, Model model){
            model.addAttribute("blog",blogService.findById(id));
             model.addAttribute("categoryList",categoryServices.findAll());
        return "editBlog";
    }

    @PostMapping("/blog/edit")
    public String editBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","da thay doi thanh cong");
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String goDelForm(@PathVariable Integer id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "deleteBlog";
    }
    @PostMapping("/blog/delete")
    public String delBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message","da xoa thanh cong");
        return "redirect:/";
    }

}
