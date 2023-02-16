/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class Switch {

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
        
        switch(operacion)
                {
                    case "Sumar":
                        System.out.println("El resultado de la operacion es " + suma);
                        break;
                    case "Restar":
                        System.out.println("El resultado de la operacion es " + resta);
                        break;
                    case "Multiplicar":
                        System.out.println("El resultado de la operacion es " + multiplicacion);
                        break;
                    default:
                        System.out.println("Operacion desconocida");
                }
        
    }
    
}
