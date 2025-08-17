package com.devsenior.yecm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Impresora YECM");
        Impresora impresora = new Impresora();
        Document document = new Document("Documento 1");
        Document document2 = new Document("Documento 2");
        TextService texto = new TextService(
                "java es divertido y java es poderoso pero aprender java requiere practica y paciencia");
        impresora.addCola(document);
        impresora.addCola(document2);
        impresora.imprimir();
        impresora.showCola();
        impresora.deleteDoc();
        impresora.showCola();


        texto.addWords(texto.dividirText());
        System.out.println("Lista de palabaras y cantidad de veces en el texto");
        texto.countWordsFrequancy();
    }
}