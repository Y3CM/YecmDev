package com.devsenior.yecm.numeros;

import java.util.*;

public class NumerosService {
    List<Integer> numeros = Arrays.asList(4, 7, 2, 7, 9, 4, 10, 15, 2, 8, 15, 20, 25, 30);

    Map<Integer, Integer> contador = new HashMap<>();

    public void contarNumeros() {
        for (Integer numero : numeros) {
            contador.put(numero, contador.getOrDefault(numero, 0) + 1);
        }
    }

    public void showUniqueNumbers() {
        contarNumeros();
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
