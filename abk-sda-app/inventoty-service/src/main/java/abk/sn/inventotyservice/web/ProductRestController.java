package abk.sn.inventotyservice.web;

import abk.sn.inventotyservice.entities.Product;
import abk.sn.inventotyservice.repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    private final ProductRepository productRepository;
    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

}
