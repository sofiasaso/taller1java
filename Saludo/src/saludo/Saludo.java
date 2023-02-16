/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;
import java.util.*;
/**
 *
 * @author Sena
 */
public class Saludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String saludo;
        
        
        System.out.println("Escriba su saludo");
        Scanner lectura = new Scanner(System.in);
        saludo = lectura.nextLine();
        
        if(saludo.equals("hola mundo"))
        {
            System.out.println("Hola Usuario");
        }
        
    }
    
}
