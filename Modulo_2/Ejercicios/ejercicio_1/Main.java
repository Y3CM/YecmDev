package Ejercicios.ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Estudiante yecm = new Estudiante("Yecm", 21, 4.5);
        Estudiante jones = new Estudiante("Jones",23,2.9);

        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
        yecm.mostrarDetalles();

        System.out.println(yecm.isAprobed() ? "Aprobado" : "Reprobado");
        
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
        
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
        jones.mostrarDetalles();
        System.out.println(jones.isAprobed() ? "Aprobado" : "Reprobado");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");

    }
}
