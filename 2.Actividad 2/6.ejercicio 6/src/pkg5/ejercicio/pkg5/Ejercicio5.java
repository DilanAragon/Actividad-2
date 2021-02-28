/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.ejercicio.pkg5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        double AlturaEnMetros,PesoEnKg,BMI,AlturaEnMetrosCua;
        
        System.out.println("Digite Su Altura En Metros");
        AlturaEnMetros=entrada.nextDouble();
        System.out.println("Digite Su Peso En Kilogramos");
        PesoEnKg=entrada2.nextDouble();
        AlturaEnMetrosCua=AlturaEnMetros*AlturaEnMetros;
        BMI=PesoEnKg/AlturaEnMetrosCua;
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Clasificación del BMI: ");
        System.out.println("Bajo peso = menos de 18.5");
        System.out.println("Peso normal = 18.5–24.9");
        System.out.println("Sobrepeso = 25–29.9");
        System.out.println("Obesidad = IMC de 30 ó mayor");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("Su BMI es de: "+ df.format(BMI) );
        System.out.println("By Dilan Aragon...");
        
        
        // TODO code application logic here
    }
    
}
