package com.devsenior.yecm;

import java.util.ArrayList;
import java.util.List;

public class Inventary {

    private List<Product> products;

    public Inventary(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void sellProduct(String name, Integer quantity){

        try{
            var product = getProductByName(name);

            if (product.getStock() < quantity) {
                System.out.println("No hay suficiente stock del producto: " + name);
                System.out.println("Stock disponible: " + product.getStock());
            }else{
                product.setStock(product.getStock() - quantity);
            }
        }catch(ProductNotFoundException e){
            System.out.println("El producto: " + name + " no se encuentra en el inventario");
        }

    }
    private Product getProductByName(String name) throws ProductNotFoundException{
       for (Product product : products) {
            if (name.equalsIgnoreCase(product.getName())) {
                return product;
            }
       }
       throw new ProductNotFoundException("Producto: " + name + " no encontrado");
    }

    public Double calculateTotalInventary(){
        var total = 0d;
        for (Product product : products) {
            total += product.getStock() * product.getPrice();
        }
        return total;
    }
}
