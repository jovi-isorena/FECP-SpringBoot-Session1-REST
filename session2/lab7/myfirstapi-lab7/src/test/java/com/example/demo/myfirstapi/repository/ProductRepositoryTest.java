package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.assertj.core.api.Fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository productRepository;
    @BeforeEach
    void setup(){
        productRepository = new ProductRepository();
    }

    @Test
    void shouldReturnAllProducts() {
        Product[] expected = {
            new Product(1L, "Laptop", 1200.00),
            new Product(2L, "Mouse", 25.50),
            new Product(3L, "Keyboard", 75.00)
        };

        Product[] actual = productRepository.findAll().toArray(new Product[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyWhenIdIsNotPositive() {
        Optional<Product> actual = productRepository.findById(-1L);
        assertTrue(actual.isEmpty());
    }
    @Test
    void shouldReturnEmptyWhenProductIsNotFound(){
        Optional<Product> actual = productRepository.findById(10L);
        assertTrue(actual.isEmpty());
    }
    @Test
    void shouldReturnValidProduct(){
        Product expected = new Product(1L, "Laptop", 1200.00);
        Optional<Product> actual = productRepository.findById(1L);
        if(actual.isEmpty()){
            fail("Product not found.");
        }
        assertEquals(expected, actual.get());
    }

    // test: new valid, new invalid input, update valid, update invalid input
    @Test
    void shouldSaveValidNewProduct() {
        Product newProduct = new Product("my new product", 15.00);
        newProduct = productRepository.save(newProduct);
        Optional<Product> actual = productRepository.findById(newProduct.getId());
        if(actual.isEmpty()){
            fail("Product not found.");
        }
        assertEquals(newProduct, actual.get());
    }
    @Test
    void shouldThrowExceptionWhenNewProductEmptyName() {
        Product newProduct = new Product("", 15.00);
        assertThrows(IllegalArgumentException.class, ()->productRepository.save(newProduct));
    }
    @Test
    void shouldThrowExceptionWhenNewProductNegativePrice() {
        Product newProduct = new Product("new product", -15.00);
        assertThrows(IllegalArgumentException.class, ()->productRepository.save(newProduct));
    }
    @Test
    void shouldThrowExceptionWhenNewProductIsNull() {
        Product newProduct = null;
        assertThrows(NullPointerException.class, ()->productRepository.save(newProduct));
    }
    // update
    @Test
    void shouldUpdateValidNewProduct() {
        Product oldProduct = productRepository.findById(1L).orElse(null);
        Product updatedProduct = new Product(1L,"updated product", 15.00);
        productRepository.save(updatedProduct);
        Optional<Product> actual = productRepository.findById(1L);
        if(actual.isEmpty()){
            fail("Product not found.");
        }
        assertTrue(!oldProduct.equals(updatedProduct) && updatedProduct.equals(actual.get()));
    }
    @Test
    void shouldThrowExceptionWhenUpdatedProductEmptyName() {
        Product newProduct = new Product(1L,"", 15.00);
        assertThrows(IllegalArgumentException.class, ()->productRepository.save(newProduct));
    }
    @Test
    void shouldThrowExceptionWhenUpdatedProductNegativePrice() {
        Product newProduct = new Product(1L,"updated product", -15.00);
        assertThrows(IllegalArgumentException.class, ()->productRepository.save(newProduct));
    }
    @Test
    void shouldThrowExceptionWhenUpdatedProductIsNull() {
        Product newProduct = null;
        assertThrows(NullPointerException.class, ()->productRepository.save(newProduct));
    }
    @Test
    void shouldThrowExceptionWhenUpdatingNonExistingProduct(){
        Product newProduct = new Product(5L,"updated product", 15.00);
        assertThrows(IllegalArgumentException.class, ()->productRepository.save(newProduct));
    }
}