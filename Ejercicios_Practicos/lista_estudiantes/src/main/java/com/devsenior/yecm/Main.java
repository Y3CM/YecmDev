package com.devsenior.yecm;
import com.devsenior.yecm.numeros.*;;
public class Main {
    public static void main(String[] args) throws NotFoundException  {
        EstudiantesService estudiantesService = new EstudiantesService();
        Estudiante estudiante = new Estudiante("Estudiante 1", 1);
        Estudiante estudiante2 = new Estudiante("Estudiante 2", 2);
        Estudiante estudiante3 = new Estudiante("Estudiante 3", 2);

        estudiantesService.addEstudiante(estudiante);
        estudiantesService.addEstudiante(estudiante2);
        estudiantesService.addEstudiante(estudiante3);
        System.out.println("Estudiantes registrados: " );
        estudiantesService.showListEstudiantes();
        System.out.println("Eliminando estudiante 1...");
        estudiantesService.deleteEstudiante(1);
        System.out.println("Eliminando estudiante 4...");
        estudiantesService.deleteEstudiante(4);
        System.out.println("Estudiantes registrados: ");
        estudiantesService.showListEstudiantes();

        NumerosService numerosService = new NumerosService();
        System.out.println("Numeros unicos: ");
        numerosService.showUniqueNumbers();
    }
}