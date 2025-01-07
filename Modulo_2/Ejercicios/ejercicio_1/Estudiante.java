package Ejercicios.ejercicio_1;

public class Estudiante {
    String nombre;
    int edad;
    double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad + "Años");
        System.out.println("Promedio: "+ promedio);

    }

    public boolean isAprobed(){
        if(promedio >= 3){
            return true;
        }
        return false;
    }


}
