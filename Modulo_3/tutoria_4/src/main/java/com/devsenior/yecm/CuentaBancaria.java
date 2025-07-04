package com.devsenior.yecm;
public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            return;
        }
        System.out.println("monto no puede ser negativo");
    }

    public void retirar(double monto){
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Transaccion exitosa " + "saldo actual " + saldo);
            return;
        }
        System.out.println("monto no puede ser negativo o superar el saldo");
    }

    public void transferir(CuentaBancaria destino, Double monto){
        if(destino == this){
            System.out.println("No se puede transferir a la misma cuenta");
            return;
        }
        if(monto <= saldo){
            retirar(monto);
            destino.depositar(monto);
            
        }else{
            System.out.println("monto no puede ser negativo o superar el saldo");
        }
    }
    public void mostrarSaldo(){
        System.out.println(titular + " Tu saldo es: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
