/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float gramos,libras,toneladas,kilogramo;
        float ELibra = 2.2046f;
        System.out.println("Digite el peso en KG: ");
        kilogramo=entrada.nextFloat();
        gramos=(kilogramo*1000)/1;
        libras=(kilogramo*ELibra)/1;
        toneladas=kilogramo/1000;
        
        System.out.println("Gramos: "+gramos);
        System.out.println("Libras: "+libras);
        System.out.println("Toneladas: "+toneladas);
        }
        // TODO code application logic here
    }
