package Anidacion;

import java.util.Scanner;

public class Anidacion {
    public static void main(String[] args) {
        Scanner anidacion = new Scanner(System.in);
        System.out.println("Bienvenido a ejercicio 4");
        System.out.println("Ingresa un número por favor");
        int num;
        num = anidacion.nextInt();
        
        if (num>0) {
            System.out.println("El número que ingresaste fue "+num);
            System.out.println(num + " es un número postivo, ya que es mayor que cero");
            
        } else if (num<0) {
            System.out.println("El número que ingresaste fue "+num);
            System.out.println(num + " es un número negativo, ya que es menor que cero");
        } else {
            System.out.println("El número que ingresaste fue "+num);
            System.out.println(num + " es un número neutro, ya que es igual que cero");
        }
            System.out.println("Gracias por usar el programa Ejercicio 4");

        anidacion.close();
    }
}
