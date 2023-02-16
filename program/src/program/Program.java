/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.*;
/**
 *
 * @author Sena
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        double b;
        double c;
        double resultado1 = 0;
        double resultado2 = 0;
        double resultado3 = 0;
        Scanner lectura = new Scanner(System.in);
        
       
        System.out.println("Ingrese el dato para a ");
        a = lectura.nextInt();
        System.out.println("Ingrese el dato para b ");
        b = lectura.nextInt();
        System.out.println("Ingrese el dato para c ");
        c = lectura.nextInt();
        
        resultado1 = a + b + c;
        resultado2 = 2 * b + 3 * (a - c);
        resultado3 = a/b;
        
        System.out.println("El resultado 1 es: " + resultado1);
        System.out.println("El resultado 2 es : " + resultado2);
        System.out.println("El resultado 3 es: " + resultado3);
        
        System.out.println(a);
        
        
    }
    
}
