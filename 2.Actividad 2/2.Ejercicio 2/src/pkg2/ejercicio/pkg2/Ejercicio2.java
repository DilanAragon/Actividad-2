/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2= new Scanner(System.in);
        int rest,mult,suma,num1,num2;
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        num1=entrada1.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        num2=entrada2.nextInt();
        suma=num1+num2;
        mult=num1*num2;
        rest=num1-num2;
        System.out.println("LA SUMA ES: "+suma);
        System.out.println("LA RESTA ES: "+rest);
        System.out.println("LA MULTIPLICACION ES: "+mult);
        System.out.println("By DILAN ARAGON");
    }
    
}
