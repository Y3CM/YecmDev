package com.devsenior;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger =    LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Iniciando Programa");

        Empleado empleado = new Empleado("Yecm",23,5000.0);
        Gerente gerente = new Gerente("Jones",32, 7500.5, "Desarrollo");

        logger.info("Informacion del empleado " + empleado.toString());
        logger.info("Informacion del gerente "+ gerente.toString());
        empleado.aumentarSalario(0.75);
        logger.info("aumento de salario al empleado " + empleado.getNombre() + " salario final: " + empleado.getSalario());

        gerente.aumentarSalario(200.0);
        logger.info("aumento de salario al gerente " + gerente.getNombre() + " salario final: " + gerente.getSalario());
        logger.info("finalizando programa");
       
    }
}   