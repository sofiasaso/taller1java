/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesenlazados;
import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class Condicionalesenlazados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura = new Scanner(System.in);
        int x;
        
        System.out.println("Digite un numero");
        x = lectura.nextInt();
        
        if(x>100)
        {
            System.out.println("X es mayor que 100");
        }
        else if(x>50)
        {
            System.out.println("X es mayor que 50 y menor que 100");
        }
        else if(x>20)
        {
            System.out.println("X es mayor que 20 y menor que 50");
        }
        else
        {
            System.out.println("X es menor que 20");
        }
        System.out.println("Fin");
    }
    
}
