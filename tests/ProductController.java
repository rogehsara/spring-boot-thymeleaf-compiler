package com.example.shop.controller;

import com.example.shop.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 4L;

    public ProductController() {
        products.add(new Product(1L, "Laptop", 1200.0, "Dell laptop 16GB RAM", "/images/laptop.png"));
        products.add(new Product(2L, "Phone", 650.5, "Samsung phone", "/images/phone.png"));
        products.add(new Product(3L, "Headphones", 80.0, "Wireless headphones", "/images/headphones.png"));
    }

    // a. عرض المنتجات
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", products);
        model.addAttribute("count", products.size());
        return "products";
    }

    // c. عرض تفاصيل منتج
    @GetMapping("/{id}")
    public String productDetails(@PathVariable("id") Long id, Model model) {
        Product product = null;
        for (Product p : products) {
            if (p.getId().equals(id)) {
                product = p;
                break;
            }
        }
        if (product == null) {
            return "redirect:/products";
        }
        model.addAttribute("product", product);
        return "product-details";
    }

    // b. إضافة منتج (عرض الفورم)
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // b. إضافة منتج (استقبال الفورم)
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        product.setId(nextId);
        nextId = nextId + 1;
        products.add(product);
        return "redirect:/products";
    }
}
