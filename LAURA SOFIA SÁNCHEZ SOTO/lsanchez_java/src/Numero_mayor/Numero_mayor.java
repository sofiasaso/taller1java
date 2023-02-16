package Numero_mayor;

import java.util.Scanner;

public class Numero_mayor {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a ejercicio 3");
        System.out.println("Digita un número por favor ");
        int num1;
        num1 = lectura.nextInt();
        System.out.println("El número que ingresaste fue " + num1);

        System.out.println("Digita otro número por favor ");
        int num2;
        num2 = lectura.nextInt();
        System.out.println("El otro número que ingresaste fue " + num2);

        if (num1>num2) {
            System.out.println("El " + num1 + "es mayor que el " + num2 );
            System.out.println("Por ello, se van a sumar ambos números");
            System.out.println("El resultado de la suma es de " + (num1+num2));
        } else if (num1==num2) {
            System.out.println("El " + num1 + " es igual que el " + num2 );
            System.out.println("Por ello, se van a multiplicar ambos números");
            System.out.println("El resultado de la multiplicación es de " + (num1*num2));        
        }else {
            System.out.println("El " + num2 + "es mayor que el " + num1 );
            System.out.println("Por ello, se van a restar ambos números");
            System.out.println("El resultado de la resta es de " + (num2-num1));
        }
        System.out.println("Gracias por tu atención");

        lectura.close();
    }
}
