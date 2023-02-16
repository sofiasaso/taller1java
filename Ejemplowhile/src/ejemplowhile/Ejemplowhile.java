/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;
import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class Ejemplowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int y = 5;
        
        while(x<y)
        {
            System.out.println("X es menor que Y");
            x = x + 2;
            System.out.println("X es: " + x);
        }
        
        System.out.println("X ya NO es menor que Y");
    }
    
}
