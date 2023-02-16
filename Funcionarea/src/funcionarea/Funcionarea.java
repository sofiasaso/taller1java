/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarea;
import java.util.Scanner;


/**
 *
 * @author Sena
 */
public class Funcionarea {
    
    public static double area_rect(double base, double altura)
    {
        double area = base * altura;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        double b;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Digite la base del rectangulo");
        a = lectura.nextDouble();
        System.out.println("Digite la altura del rectangulo");
        b = lectura.nextDouble();
        
        double resultado = area_rect(a,b);
        System.out.println("El area del rectangulo es: " + resultado);
    }
    
}
