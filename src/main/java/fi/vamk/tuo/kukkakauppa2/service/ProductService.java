package fi.vamk.tuo.kukkakauppa2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.vamk.tuo.kukkakauppa2.api.model.Product;
import fi.vamk.tuo.kukkakauppa2.persistence.ProductRepository;

@Service
public class ProductService {
    
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

}
