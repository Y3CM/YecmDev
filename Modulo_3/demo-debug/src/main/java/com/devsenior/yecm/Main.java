package com.devsenior.yecm;

public class Main {
    public static void main(String[] args) {
        var inventary = new Inventary();
        inventary.addProduct(new Product("laptop",12,573.4));
        inventary.addProduct(new Product("mouse",15,10.4));
        inventary.sellProduct("laptop", 13);
        inventary.sellProduct("phone", 12);
        inventary.sellProduct("mouse", 2);
        var total = inventary.calculateTotalInventary();
        System.out.printf("Valor total del inventario es: $ %.2f %n", total);
    }
}