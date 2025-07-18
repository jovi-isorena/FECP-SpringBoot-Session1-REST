package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setup(){
        product = new Product(1L, "Coke", 25.00);
    }

    @Test
    void shouldReturnId() {
        assertEquals(1L, product.getId());
    }
    @Test
    void testNullId(){
        Product product1 = new Product("Coffee", 15.00);
        assertNull(product1.getId());
    }

    @Test
    void shouldReturnName() {
        assertEquals("Coke", product.getName());
    }

    @Test
    void shouldReturnPrice() {
        assertEquals(25.00, product.getPrice());
    }

    @Test
    void shouldChangeId() {
        product.setId(2L);
        assertEquals(2L, product.getId());
    }
    @Test
    void shouldThrowExceptionWhenIdIsNull() {

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->product.setId(null));
        assertEquals("ID should not be null.", ex.getMessage());
    }
    @Test
    void shouldThrowExceptionWhenIdIsNotPositive() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->product.setId(-1L));
        assertEquals("ID should be positive.", ex.getMessage());
    }

    @Test
    void shouldChangeName() {
        product.setName("Royal");
        assertEquals("Royal", product.getName());
    }

    @Test
    void shouldChangePrice() {
        product.setPrice(30.00);
        assertEquals(30.00, product.getPrice());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenPriceIsNegative(){
        assertThrows(IllegalArgumentException.class, ()-> product.setPrice(-1));
    }
    @Test
    void shouldBeEqualHash(){
        assertEquals(Objects.hash(1L, "Coke", 25.00),product.hashCode());
    }
    @Test
    void differentIdShouldBeNotEqualHash(){
        assertNotEquals(Objects.hash(2L, "Coke", 25.00),product.hashCode());
    }
    @Test
    void differentNameShouldBeNotEqualHash(){
        assertNotEquals(Objects.hash(1L, "Royal", 25.00),product.hashCode());
    }
    @Test
    void differentPriceShouldBeNotEqualHash(){
        assertNotEquals(Objects.hash(1L, "Coke", 21.00),product.hashCode());
    }
    @Test
    void shouldReturnTrueWhenComparedWithNewObjectWithSameAttributeValue(){
        Product product2 = new Product(1L, "Coke", 25.00);
        assertEquals(product2,product);
    }
    @Test
    void shouldReturnTrueWhenComparedWithSameReference(){
        Product product2 = product;
        assertEquals(product2,product);
    }
    @Test
    void shouldReturnFalseWhenComparedWithNullVariable(){
        Product product2 = null;
        assertNotEquals(product2,product);
    }
    @Test
    void shouldReturnFalseWhenComparedWithDifferentVariableType(){
        List<Product> product2 = new ArrayList<>();
        assertNotEquals(product2,product);
    }
    @Test
    void differentIdShouldBeNotEqualObject(){
        Product product2 = new Product(2L, "Coke", 25.00);
        assertNotEquals(product2,product);
    }
    @Test
    void differentNameShouldBeNotEqualObject(){
        Product product2 = new Product(2L, "Royal", 25.00);
        assertNotEquals(product2,product);
    }
    @Test
    void differentPriceShouldBeNotEqualObject(){
        Product product2 = new Product(2L, "Coke", 27.00);
        assertNotEquals(product2,product);
    }
    @Test
    void shouldBeEqualsToString(){
        assertEquals("Product{id=1, name='Coke', price=25.0}", product.toString());
    }
}