package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path ="{id}" )
    public Product getProductById(@PathVariable  int id) {
        return productService.getProductById(id);
    }

    @PostMapping(path = "/add-product")
    public Product addProduct(@RequestBody Product product) {
        product.setUpdatedAt(LocalDateTime.now());
        product.setCreatedAt(LocalDateTime.now());
        return productService.addProduct(product);
    }

    @PutMapping(path="/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id,updatedProduct);
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String product_name) {
        return productService.searchByName(product_name);
    }
}
