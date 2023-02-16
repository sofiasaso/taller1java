/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmif;
import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class Operacionesaritme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 20;
        int num2 = 66;
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        String operacion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el tipo de operación: Sumar, Restar o Multiplicar");
        operacion = lectura.nextLine();
        if(operacion.equals("Sumar"))
        {
            System.out.println("El resultado es "+ suma);
        }
        else if(operacion.equals("Restar"))
        {
            System.out.println("El resultado es "+ resta);
        }
        else if(operacion.equals("Multiplicar"))
        {
            System.out.println("El resultado es "+ multiplicacion);
        }
        else
        {
            System.out.println("La operación es desconocida");
        }
        
    }
    
}
