/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2= new Scanner(System.in);
        int num1,num2,x = 0;
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        num1=entrada1.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        num2=entrada2.nextInt();
        System.out.printf("x = %d\n", x );
        System.out.printf("El valor de %d + %d es %d\n", x, x, ( x + x ) );
        System.out.printf("x=%.2f", x );
        int y = 0;
        System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );

        

        // TODO code application logic here
    }
    
}
