//suma, resta, producto y cociente de dos números.
package boletin2.pkg4;

import java.util.Scanner;


public class Boletin24 {

    
    public static void main(String[] args) {
    float numero1,numero2;
    System.out.print("numero1 =");
            Scanner dato = new Scanner(System.in);
            numero1 = dato.nextFloat();
            
    System.out.print("numero2 =");
     Scanner dato2 = new Scanner (System.in);
     numero2 = dato2.nextFloat();
     
    System.out.println("suma ="+ (numero1+numero2));
    
    System.out.println("resta ="+ (numero1-numero2));
    
    System.out.println("producto ="+ numero1*numero2);
    
    System.out.println("cociente ="+ numero1/numero2);
    }
    
}
