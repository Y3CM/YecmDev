package com.devsenior.yecm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    private Inventary inventory;

    @BeforeEach
    void setup() {
        inventory = new Inventary();
    }
    @Test
    void testAddProduct() {
        var product = new Product("Laptop", 14, 5050.0);
        var totalExpected =70700d;
        inventory.addProduct(product);
        var totalCalculated = inventory.calculateTotalInventary();
        assertEquals(totalExpected, totalCalculated);
    }
    @Test
    void testAddProductWhenProductAlreadyExists() {
        var product = new Product("Laptop", 14, 5050.0);
        inventory.addProduct(product);
        inventory.addProduct(product);
        var totalExpected =70700d*2d;
         var totalCalculated = inventory.calculateTotalInventary();

         assertEquals(totalExpected, totalCalculated);
    }
}
