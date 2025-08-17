package com.devsenior.yecm;

import java.util.*;

public class ClientesService {
    Queue<Cliente> clientes;

    public ClientesService() {
        this.clientes = new LinkedList<Cliente>();
    }

    public void add(Cliente cliente) {
        this.clientes.offer(cliente);
    }

    public void delete() {
        this.clientes.poll();
    }
    public void show() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente.toString());
        }
    }
}