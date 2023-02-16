/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class Matrices {
    
    private Scanner lectura = new Scanner(System.in);
    private String dulces[][] = new String[2][2];
    private int precios[][] = new int[2][2];
    
    
    public void CargarDulce()
    {
        
        for(int f = 0; f < dulces.length; f++)
        {       
            for(int c = 0; c < dulces.length; c++)
            {
                System.out.println("Ingrese el nombre del dulce " + "["+f+"]["+c+"]");
                dulces[f][c] = lectura.nextLine();            
            }   
        }
    }
    
    public void CargarPrecio()
    {
        
        for(int f = 0; f < dulces.length; f++ )
        {       
            for(int c = 0; c < dulces.length; c++)
            {
                System.out.println("Ingrese el precio del dulce " + "["+f+"]["+c+"]");
                precios[f][c] = lectura.nextInt();
                
            }   
        }
    }
    
    
    public void Imprimir()
    {
        for(int f = 0; f < dulces.length; f++ )
        {
            
            for(int c = 0; c < dulces.length; c++)
            {
                System.out.println("Codigo" + "\t" + "Dulce" + "\t" + "Precio");
                System.out.println("["+f+"]["+c+"]" + "\t" + dulces[f][c] + "\t" + precios[f][c] + "\t");
                System.out.println();
                
            }
            
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrices mat = new Matrices();
        mat.CargarDulce();
        System.out.println();
        mat.CargarPrecio();
        System.out.println();
        mat.Imprimir();
        
    }
    
}
