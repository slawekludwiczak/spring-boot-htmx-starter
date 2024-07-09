package com.ludigi.springboothtmxstarter.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    String home() {
        return "index";
    }

    @GetMapping(path = "/products", headers = "Hx-Request=true")
    String getProducts(Model model) {
        model.addAttribute("products", productRepository.findAll(10));
        return "products/products::product-list";
    }
}
