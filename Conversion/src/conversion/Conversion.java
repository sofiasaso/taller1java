/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;
import java.util.*;
/**
 *
 * @author Sena
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gradoscentigrados;
        double gradosfarenheit = 0;
        //double conversion = 0;
        
        Scanner centigrados = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de grados centigrados ");
        gradoscentigrados = centigrados.nextDouble();
        
        gradosfarenheit = (1.8 * gradoscentigrados) + 32;
        System.out.println(gradoscentigrados + " grados centigrados es igual a " + gradosfarenheit + " grados farenheit");
        
        if(gradosfarenheit > 350)
        {
            
            System.out.println("Cuidado abuela, se le quema el bizcocho");
        }
        else
        {
            System.out.println("Abuela le esta quedando bueno su bizcocho");
        }
        
        
        
    }
    
}
