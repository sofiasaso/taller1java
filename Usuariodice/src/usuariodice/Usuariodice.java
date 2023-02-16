/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariodice;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Sena
 */
public class Usuariodice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Escriba algo");
        String repite = lectura.nextLine();
        
        while(!repite.equals("salir del juego"))
        {
            System.out.println("Escriba algo");
            repite = lectura.nextLine();
        }
        System.out.println("Saliste del juego");
    }
    
}
