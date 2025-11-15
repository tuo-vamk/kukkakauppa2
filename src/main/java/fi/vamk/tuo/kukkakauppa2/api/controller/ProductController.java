package fi.vamk.tuo.kukkakauppa2.api.controller;

import org.springframework.web.bind.annotation.RestController;

import fi.vamk.tuo.kukkakauppa2.api.model.Product;
import fi.vamk.tuo.kukkakauppa2.service.ProductService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

}
