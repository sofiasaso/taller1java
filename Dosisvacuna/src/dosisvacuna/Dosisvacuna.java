/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosisvacuna;
import java.util.*;
/**
 *
 * @author Sena
 */
public class Dosisvacuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double peso;
        double meses;
        double dosis = 0;
        
        Scanner vacuna = new Scanner(System.in);
        
       
        System.out.println("Ingrese el peso del bebe en kilogramos ");
        peso = vacuna.nextDouble();
        System.out.println("Ingrese los meses del bebe ");
        meses = vacuna.nextDouble();
        
        dosis = (peso + 10 / meses * 10) * 8;
        
        System.out.println("La dosis a suministrar es " + dosis);
    }
    
}
