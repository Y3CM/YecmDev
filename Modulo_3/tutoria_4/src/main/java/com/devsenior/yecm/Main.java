package com.devsenior.yecm;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Diego", 1000.0);
        CuentaBancaria cuenta1 = new CuentaBancaria("Yecm", 1500.0);

        System.out.println("inicializando programa");
        System.out.println("datos de la cuenta");
        System.out.println("Cuenta 1 "+ cuenta.getTitular() + " " + cuenta.getSaldo());
        System.out.println("Cuenta 2 "+ cuenta1.getTitular() + " " + cuenta1.getSaldo());
        System.out.println("Realizando operaciones");
        System.out.println("Mostrar saldo");
        cuenta.mostrarSaldo();
        System.out.println("Depositar");
        System.out.println("saldo actual: " + cuenta.getSaldo());
        cuenta.depositar(500.0);
        System.out.println("nuevo saldo: " + cuenta.getSaldo());
        System.out.println("Retirar");
        System.out.println("valor a retirar: 250.0 este valor sera descontado de su saldo actual");
        cuenta.retirar(250.0);
        System.out.println("Transferir");
        System.out.println("antes de la transferencia verificar los datos de la cuenta a la cual se va a transferir, su saldo es: " + cuenta.getSaldo());
        cuenta.transferir(cuenta1, 100.0);
    }
}