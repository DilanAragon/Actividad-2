/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.ejercicio.pkg3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        double num1,num2,num3,Suma,Prom,Prod,Cocien,Modulo;
        System.out.println("Digite El Primer Numero Decimal: ");
        num1=entrada.nextDouble();
        System.out.println("Digite El Segundo Numero Decimal: ");
        num2=entrada2.nextDouble();
        System.out.println("Digite El Tercer Numero Decimal");
        num3=entrada3.nextDouble();
        Suma=num1+num2+num3;
        Prom=Suma/3;
        Prod=(num1*num2)*num3;
        Cocien=num1/num2/num3;
        Modulo=num1%num2%num3;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La Suma: "+df.format(Suma));
        System.out.println("El Promedio es: "+ df.format(Prom));
        System.out.println("El Producto es: "+ df.format(Prod));
        System.out.println("El Cociente es: "+ df.format(Cocien));
        System.out.println("El Modulo es: "+ df.format(Modulo));
        
        // TODO code application logic here
        
    }
    
}
