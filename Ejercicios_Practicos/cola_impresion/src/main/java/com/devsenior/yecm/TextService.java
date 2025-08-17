package com.devsenior.yecm;

import java.util.*;

public class TextService {
    private List<String> palabras;
    private String text;

    public TextService(String text) {
        this.text = text;
        this.palabras = new ArrayList<>();
    }

    public String[] dividirText() {
        var textDividido = text.split("\\s+");
        return textDividido;
    }

    public void addWords(String[] dividirText){
        for (String palabra : dividirText) {
            palabras.add(palabra);
        }
    }

    public void countWordsFrequancy(){
        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        // Mostrar resultados
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
