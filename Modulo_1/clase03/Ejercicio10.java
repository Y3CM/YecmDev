package clase03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        var scan = new Scanner(System.in);
        System.out.println("----Bienvenidon----");
        System.out.println("A continuacion ingresa tres numeros enteros para calcular la media aritmetica");
        System.out.print("Ingresa el primer numero entero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scan.nextInt();
        System.out.print("Ingresa el tercer numero entero: ");
        int num3 = scan.nextInt();
        mediaAritmetica(num1,num2,num3); 
        scan.close();
            }
        
            private static void mediaAritmetica(int num1, int num2, int num3) {
               var mediaArit = (num1 + num2 + num3)/3;
               System.out.print("La media aritmetica de los numeros ingresados es: "+ mediaArit);
            }
}
