package Discoteca;

import java.util.Scanner;

public class Discoteca {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a ejercicio 2");
        System.out.println("Ingresa tu edad por favor");
        int age;
        age = lectura.nextInt();
        System.out.println("Tu edad es de " + age + " años");
        if (age<18) {
            System.out.println("Lo siento no puedes ingresar a la discoteca, eres menor de edad unu");
        } else {
            System.out.println("Eres mayor de edad, puedes entrar");
        }
        lectura.close();
    }
}


