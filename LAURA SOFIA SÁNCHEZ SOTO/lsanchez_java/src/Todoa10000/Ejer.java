package Todoa10000;

import java.util.Scanner;

public class Ejer {
    public static void main(String[] args) {
        Scanner Todoa10000 = new Scanner(System.in);
        System.out.println("Bienvenido Pedro uwu");   
        System.out.println("Digita por favor la cantidad de articulos comprados por un cliente");
        int cantidad;
        cantidad = Todoa10000.nextInt();
        System.out.println("El total de la compra es de " + (cantidad * 10000));
        System.out.println("***********************************************************");
        System.out.println("Digita por favor el dinero recibido");
        int dinerorecibido;
        dinerorecibido = Todoa10000.nextInt();
        System.out.println("El cambio es de " + (dinerorecibido - (cantidad*10000)));

        System.out.println("\nGracias por tu compra. \n\tVuelve pronto uwu");


        Todoa10000.close();
    }
}
