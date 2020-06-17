package com.chaudang.controller;

import com.chaudang.models.Blog;
import com.chaudang.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String display(Model model){
        List<Blog> blogList = blogService.finAll();
        model.addAttribute("blogList",blogList);
        return "list";
    }

    @GetMapping("/blog/create")
    public String goCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
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
        return "edit";
    }

    @PostMapping("/blog/edit")
    public String editBlog(@ModelAttribute ("blog") Blog blog,RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","da thay doi thanh cong");
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String goDelForm(@PathVariable Integer id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "delete";
    }
    @PostMapping("/blog/delete")
    public String delBlog(@ModelAttribute ("blog") Blog blog,RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message","da xoa thanh cong");
        return "redirect:/";
    }

}
