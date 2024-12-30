package dev.diegop.hellospring.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.diegop.hellospring.model.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    List<Product> products = List.of(new Product(1, "Product 1"));

    @GetMapping("")
    public List<Product> findAll() {
        return products;
    }

}
