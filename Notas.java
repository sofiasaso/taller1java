/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;
import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int cantidad;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de notas");
        cantidad = lectura.nextInt();
        
        double notas[] = new double[cantidad];
        
        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Digite la nota #" + i);
            notas[i] = lectura.nextDouble();

            if(notas[i] >= 1 && notas[i] <= 1.9)
            {
                System.out.println("Deficiente ");
            }
            else if(notas[i] >= 2 && notas[i] <= 2.9)
            {
                System.out.println("Regular ");
            }
            else if(notas[i] >= 3 && notas[i] <= 3.9)
            {
                System.out.println("Aceptable ");
            }
            else if(notas[i] >= 4 && notas[i] <= 5)
            {
                System.out.println("Excelente ");
            }
            else
            {
                System.out.println("Valor no valido ");
            }
        }
        
        
        
    }
    
}
