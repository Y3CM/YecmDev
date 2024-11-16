package clase03;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        areaRectangulo(base, altura);
        perimetroRectangulo(base, altura);
        scanner.close();
                    }
                
                    private static void perimetroRectangulo(double base, double altura) {
                        double perimetro = 2 * (base + altura);
                        System.out.println("El perímetro del rectángulo es: " + perimetro + " metros");
                    }
        
                    private static void areaRectangulo(double base, double altura) {
              double area = base * altura;
              System.out.println("El área del rectángulo es: " + area + " metros cuadrados");
            }
}
