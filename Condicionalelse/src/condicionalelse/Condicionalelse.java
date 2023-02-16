/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalelse;

import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class Condicionalelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*Declaracion de variables*/
        int a = 0;
        int b = 0;
        
        /*Peticion de datos por teclado*/
        System.out.println("Ingrese el valor de X ");
        Scanner lectura = new Scanner(System.in);
        a = lectura.nextInt();
        System.out.println("Ingrese el valor de Y ");
        b = lectura.nextInt();
        
        /*Bloque de condiciones*/
        if(a > b)
        {
            System.out.println("A es mayor que B");
        }
        else
        {
            System.out.println("B es mayor que A");
        }
//        int z = 1000;
//        double a = x +1;
//        
//        System.out.println("El valor de Z es: " + z + " El valor de a es: " + a);
    }
    
}
