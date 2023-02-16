/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;
import java.util.*;
/**
 *
 * @author Sena
 */
public class EjerciciosCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Declaracion de variables*/
        int x = 0;
        double y = 0;
        
        /*Peticion de datos por teclado*/
        System.out.println("Ingrese el valor de X ");
        Scanner lectura = new Scanner(System.in);
        x = lectura.nextInt();
        System.out.println("Ingrese el valor de Y ");
        y = lectura.nextDouble();
        
        /*Bloque de condiciones*/
        if(x > y)
        {
            System.out.println("X es mayor que Y");
        }
        
        int z = 1000;
        double a = x +1;
        
        System.out.println("El valor de Z es: " + z + " El valor de a es: " + a);
        
    }
    
}
