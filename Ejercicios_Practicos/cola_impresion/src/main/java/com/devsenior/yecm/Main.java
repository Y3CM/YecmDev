package com.devsenior.yecm;

public class Main {
    public static void main(String[] args) {
       System.out.println("Impresora YECM");
       Impresora impresora = new Impresora();
       Document document = new Document("Documento 1");
       Document document2 = new Document("Documento 2");
       impresora.addCola(document);
       impresora.addCola(document2);
       impresora.imprimir();
       impresora.showCola();
       impresora.deleteDoc();
       impresora.showCola();
    }
}