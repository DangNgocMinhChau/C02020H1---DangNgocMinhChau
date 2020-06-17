package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "index";
    }

    @GetMapping("/product/list")
    public String showList(Model model) {
        model.addAttribute("message", " dang sach san pham");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("message", "da thay doi thanh cong");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("message", "da xoa thanh cong");
        return "redirect:/";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/product/create")
    public String createNew(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "them moi thanh cong");
        return "redirect:/";
    }

    @GetMapping("/product/view")
    public String view(Product product, Model model) {
        model.addAttribute("product", new Product());
        return "view";
    }

    @PostMapping("/product/view1")
    public String showView(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", productService.findById(product.getId()));
        return "display";
    }

    @GetMapping("/product/{id}/view")
    public String showView(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "display";
    }

}
