/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Taller1 {
    
    public static double ValorFuturo(double valor)
    {
        double valorfut = 0;
        valorfut = valor * Math.pow(1 + 0.02, 60);
        return valorfut;
    }
    
    public static void Descuento(int kilos)
    {
        double descuento = 0;
        double valork = kilos * 4.200;
        double valortotal = 0;
        
        if(kilos <= 2)
        {
            System.out.println("El cliente no tiene descuento");
        }
        else if(kilos > 2 && kilos <= 5)
        {
            descuento = valork * 0.1;
            valortotal = valork - descuento;
            
            System.out.println("La compra de " + kilos + " kilos tiene un valor de " + valork + " pero usted tiene un descuento por valor de " + descuento + " por lo tanto el valor a pagar es " + valortotal );
        }
        else if(kilos > 5 && kilos <= 10)
        {
            descuento = valork * 0.15;
            valortotal = valork - descuento;
            
            System.out.println("La compra de " + kilos + " kilos tiene un valor de " + valork + " pero usted tiene un descuento por valor de " + descuento + " por lo tanto el valor a pagar es " + valortotal );
        }
        else if(kilos > 10)
        {
            descuento = valork * 0.2;
            valortotal = valork - descuento;
            
            System.out.println("La compra de " + kilos + " kilos tiene un valor de " + valork + " pero usted tiene un descuento por valor de " + descuento + " por lo tanto el valor a pagar es " + valortotal );
        }
        else
        {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        
        int opcion = 1;
        
        Scanner lectura = new Scanner(System.in);
        
        while(opcion !=0)
        {
        System.out.println("MENU\n" + 
                            "\t1) Ejercicio 1. Valor futuro de un deposito de un cliente\n" +
                            "\t2) Ejercicio 2. Descuento de manzanas\n" +
                            "\t3) Ejercicio 3. Funcion Y=x^2-2X\n" +
                            "\t4) Ejercicio 4. Suma de los digitos de un numero\n" +
                            "\t5) Ejercicio 5. Calcular IMC\n" +
                            "\t0) Salir\n");
        System.out.println("Dijite una de las opciones para que inicie el ejercicio");
        opcion = lectura.nextInt();
        
        
            switch(opcion)
            {
                case 1:
                    System.out.println("Bienvenido al ejercicio 1 ");
                    double valorpre;
                    System.out.println("Ingrese la cantidad de dinero a guardar");
                    valorpre = lectura.nextDouble();
                    //ValorFuturo(valorpre);
                    System.out.println("Valor consignado: " + valorpre);
                    System.out.println("Valor futuro en 5 años: " + ValorFuturo(valorpre));
                    break;
                case 2:
                    System.out.println("Bienvenido al ejercicio 2 ");
                    int kl;
        
                    System.out.println("Ingrese la cantidad de kilos de manzana");
                    kl = lectura.nextInt();
                    Descuento(kl);
                    break;
                case 3:
                    System.out.println("Bienvenido al ejercicio 3 ");
                    
                    double y = 0;
                    double sumaY = 0;
                    int multiplos3 = 0;
                    int sumaMultiplos3 = 0;
                    int ultimo5 = 0;
                    int finaliza5 = 0;
                    int suma5 = 0;

                    for(int x = 1; x <= 10; x++)
                    {
                       y = Math.pow(x, 2) - 2 * x;
                       System.out.println(y);
                       sumaY += y;

                       if(x % 3 == 0)
                       {
                           multiplos3 += 1; 
                           sumaMultiplos3 += multiplos3;
                       }
                       ultimo5 = x % 10;
                       if(ultimo5 == 5)
                       {
                           finaliza5 = finaliza5 + 1;
                           suma5 = suma5 + finaliza5;
                       }
                    }
                    System.out.println("a. La suma de todos los valores de Y es: " + sumaY);
                    System.out.println("b. Los multiplos de 3 son: " + multiplos3);
                    System.out.println("c. La suma de los multiplos de 3 es: " + sumaMultiplos3);
                    System.out.println("d. La cantidad de valores que terminan en 5 son: " + finaliza5);
                    System.out.println("e. La suma de los valores que terminan en 5 es: " + suma5);
                    break;
                case 4:
                    System.out.println("Bienvenido al ejercicio 4 ");
                    
                    int numero;
                    int suma = 0;
                    
                    System.out.println("Digite un numero entero positivo");
                    numero = lectura.nextInt();

                    System.out.println("El numero digitado es: " + numero);
                    
                    while(numero != 0)
                    {
                        suma += numero % 10;

                        numero /= 10;
                    }
                    System.out.println("La suma de los digitos del numero es: " + suma);
                    break;
                case 5:
                    System.out.println("Bienvenido al ejercicio 5 ");
                    
                    double masa, altura, edad;
        
                    System.out.println("Ingrese la masa de la persona ");
                    masa = lectura.nextDouble();
                    if(masa < 0 && masa > 105)
                    {
                        System.out.println("ERROR");
                    }
                    else
                    {

                    }
                    System.out.println("Ingrese la altura de la persona ");
                    altura = lectura.nextDouble();
                    if(altura < 0.5 && altura > 2.1)
                    {
                        System.out.println("ERROR");
                    }
                    else
                    {

                    }
                    System.out.println("Ingrese la edad de la persona ");
                    edad = lectura.nextDouble();
                    if(edad < 1 && edad > 100)
                    {
                        System.out.println("ERROR");
                    }
                    else
                    {

                    }


                    double imc = masa / Math.pow(altura, 2);



                    if(edad < 45 && imc < 22)
                    {
                        System.out.println("Masa: " + masa + " Altura: " + altura + " Edad: " + edad);
                        System.out.println("IMC: " + imc);
                        System.out.println(" Riesgo: BAJO ");
                    }
                    else if(edad < 45 && imc >= 22)
                    {
                        System.out.println("Masa: " + masa + " Altura: " + altura + " Edad: " + edad);
                        System.out.println("IMC: " + imc);
                        System.out.println(" Riesgo: MEDIO ");
                    }
                    else if(edad >= 45 && imc < 22)
                    {
                        System.out.println("Masa: " + masa + " Altura: " + altura + " Edad: " + edad);
                        System.out.println("IMC: " + imc);
                        System.out.println(" Riesgo: MEDIO ");
                    }
                    else if(edad >= 45 && imc >= 22)
                    {
                        System.out.println("Masa: " + masa + " Altura: " + altura + " Edad: " + edad);
                        System.out.println("IMC: " + imc);
                        System.out.println(" Riesgo: ALTO ");
                    }
                    else
                    {

                    }
                    break;
                case 0:
                    System.out.println("Has abandonado el juego, Adios!! ");
                    break;
                default:
                    System.out.println("Esta opcion no existe ");
            }
        }
        
    }
}
