/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.ejercicio.pkg4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dilan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio,longitud;
        double pi;
        pi = 3.1416;
        System.out.println("Digite el RADIO de la circunsferecia: ");
        radio=entrada.nextDouble();
        longitud=(2*pi)*radio;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La longitud de la circunsferencia es: "+df.format(longitud));
        // TODO code application logic here
    }
    
}
