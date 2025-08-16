package com.devsenior.yecm;

import java.util.*;

public class Impresora {
    private Queue<Document> cola;

    public Impresora() {
        this.cola = new LinkedList<>() ;
    }

    public void addCola(Document document) {
        cola.offer(document);
    }

    public void imprimir() {
        isEmpty();
        System.out.println("Imprimiendo: " + cola.peek().getTitle() +" ...");
    }

    public void deleteDoc(){
     isEmpty();
        System.out.println("Borrando de la cola: "+ cola.poll().getTitle()+" ...");
    }

    public void showCola(){
        isEmpty();
        System.out.println("Documentos en la Cola: ");
       for (Document document : cola) {
           System.out.println(document.getTitle());
       }
    }

    public void isEmpty(){
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia");
            return;
        }
    }
}
