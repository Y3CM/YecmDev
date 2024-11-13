package clase03;

import java.util.Scanner;

/**
 * VariablesTipoDatos
 */
public class VariablesTipoDatos {

    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);


        System.out.println("Ingrese un valor");
        var text = Scanner.nextLine();

        System.out.printf("el valor ingresado fue: %s%n",text);

        Scanner.close();

        //Boolean
        boolean active;
        var defaultValue = false;

        //integer numbers
        byte numberByte;
        short numberShort;
        int numberInt;
        long numberLong;
        
        //Float numbers
        float numberFloat;
        double numberDouble;
        
        //Character
        char character;
        
        //String
        String fullName;
        
        //Array
        int[] numbersArray;
        String[] namesArray;
        
        //Object
        Object object;
        
    }
    
}