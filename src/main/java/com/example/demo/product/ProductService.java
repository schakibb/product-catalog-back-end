package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Integer id,Product updatedProduct  ) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            Product existingProduct=product.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setStock(updatedProduct.getStock());
            existingProduct.setImageUrl(updatedProduct.getImageUrl());
            existingProduct.setUpdatedAt(LocalDateTime.now());
            return productRepository.save(existingProduct);

        }else {
            throw new RuntimeException("Product not found"+id);
        }

    }

    public List<Product> searchByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }


}
