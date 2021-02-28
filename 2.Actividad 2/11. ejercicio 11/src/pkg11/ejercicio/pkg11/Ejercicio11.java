/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int unidad,decena,centena,validar;
        System.out.println("Digite un numero entre 0 y 1000: ");
        validar=entrada.nextInt();
        if (validar<=0){
            System.out.println("El numero ingresado esta fuera de los limites");
            System.out.println("Intente de nuevo: ");
            validar=entrada.nextInt();
        }
        if (validar>=1000){
            System.out.println("El numero ingresado esta fuera de los limites");
            System.out.println("Intente de nuevo: ");
            validar=entrada.nextInt();

        }
        else{
            unidad=validar/1;
            decena=validar/10;
            centena=validar/100;
            System.out.println("Decenas: "+decena);
            System.out.println("Decenas: "+decena);
            System.out.println("Centenas: "+centena);
        }
        
        
        
            
        
        
        // TODO code application logic here
    }
}
