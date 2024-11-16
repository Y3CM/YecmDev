package clase03;

import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args){
        var scan = new Scanner(System.in);

        System.out.println("----------- Bienvenido ----------");
        System.out.println("Este es un covertidor de temperaturas de celsius a Fahrenheit y Kelvin");
        System.out.println("Ingresa los grados celsius a convertir: ");
        double celsius = scan.nextDouble();
        Fahrenheit(celsius);
        kelvin(celsius);
        scan.close();
                
                    }
                
                    private static void kelvin(double celsius) {
                        var conver = celsius + 273.15;
                        System.out.print(celsius + "° celsius. Equivalen a "+ conver + "° Kelvin.");
            }
        
                    private static void Fahrenheit( double celsius) {
                        var conver = celsius * 9/5 + 32;
                        System.out.println(celsius + "° celsius. Equivalen a " + conver + "° Fahrenheit.");  
            }
}