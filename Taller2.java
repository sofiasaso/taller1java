/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author User
 */
public class Taller2 {
    
    public static double Promedio(double matematicas, double quimica, double biologia)
    {
        double aumatematicas = matematicas * 0.15;
        double auquimica = quimica * 0.2;
        
        double finalmate = matematicas + aumatematicas;
        System.out.println("La nota de matematicas con el aumento es: " + finalmate);
        double finalquim = quimica + auquimica;
        System.out.println("La nota de quimica con el aumento es: " + finalquim);
        
        double promedio = (finalmate + finalquim + biologia) / 3;
        
        return promedio;
    }
    
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

    public static void main(String[] args) {
        
        int opcion = 1;
        
        Scanner lectura = new Scanner(System.in);
        
        while(opcion !=0)
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("MENU\n" + 
                                "\t1) Ejercicio 1. Calificaciones del estudiante (promedio)\n" +
                                "\t2) Ejercicio 2. Conversion de notas\n" +
                                "\t3) Ejercicio 3. Natacion\n" +
                                "\t4) Ejercicio 4. Precio de los dulces\n" +
                                "\t5) Ejercicio 5. Sudoku\n" +
                                "\t0) Salir\n");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Dijite una de las opciones para que inicie el ejercicio");
            opcion = lectura.nextInt();

            switch(opcion)
                {
                    case 1:
                        System.out.println("Bienvenido al ejercicio 1 ");

                        double matematicas;
                        double quimica;
                        double biologia;

                        System.out.println("Digite la nota de matematicas ");
                        matematicas = lectura.nextDouble();
                        System.out.println("Digite la nota de quimica ");
                        quimica = lectura.nextDouble();
                        System.out.println("Digite la nota de biologia ");
                        biologia = lectura.nextDouble();

                        System.out.println("El promedio de las notas de las tres materias es; " + Promedio(matematicas, quimica, biologia));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Bienvenido al ejercicio 2 ");

                        int cantidad;

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
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Bienvenido al ejercicio 3 ");

                        int cant;
                        double menor = 1000;


                        System.out.println("Digite la cantidad de competidores ");
                        cant = lectura.nextInt();

                        String nombre[] = new String[cant];
                        double tiempo[] = new double[cant];

                        for(int i = 0; i < nombre.length; i++)
                        {
                            System.out.println("Digite el nombre del competidor");
                            nombre[i] = lectura.next();
                        }
                        System.out.println();

                        for(int i = 0; i < tiempo.length; i++)
                        {
                            System.out.println("Digite el tiempo del competidor " + nombre[i]);
                            tiempo[i] = lectura.nextDouble();
                        }
                        System.out.println();



                        for(int i = 0; i < nombre.length; i++)
                        {
                            System.out.println("Competidor" + "\t" + "Tiempo" + "\t");
                            System.out.println(nombre[i] + "\t\t" + tiempo[i]);
                            System.out.println();
                        }

                        for(int i = 0; i < tiempo.length; i++)
                        {
                            if(tiempo[i] < menor)
                            {
                                menor = tiempo[i];
                            }
                        }
                        System.out.println("El competidor ganador es el del tiempo: " + menor);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Bienvenido al ejercicio 4 ");

                        Taller2 tall = new Taller2();
                        tall.CargarDulce();
                        System.out.println();
                        tall.CargarPrecio();
                        System.out.println();
                        tall.Imprimir();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Bienvenido al ejercicio 5 ");

                        int tam;

                        Random rnd = new Random();

                        System.out.println("Digite el tamaño del sudoku ");
                        tam = lectura.nextInt();
                        int[][] sudoku = new int[tam][tam];
                        int[] sumah = new int[tam];
                        int[] sumav = new int[tam];

                        for(int i = 0; i < sudoku.length; i++)
                        {
                            for(int j = 0; j < sudoku.length; j++)
                            {
                                sudoku[i][j] = rnd.nextInt((sudoku.length * sudoku.length) - 1 + 1) + 1;
                            }
                        }

                        for(int i = 0; i < sudoku.length; i++)
                        {
                            for(int j = 0; j < sudoku.length; j++)
                            {
                                sumah[i] += sudoku[i][j];
                                sumav[j] += sudoku[j][i];
                            }
                        }

                        System.out.println("SUDOKU " + tam +  "X" + tam + " DE NUMEROS ALEATORIOS \n");


                        for(int i = 0; i < sudoku.length; i++)
                        {
                            for(int j = 0; j < sudoku.length; j++)
                            {
                                System.out.print("| " + sudoku[i][j] + "\t");

                            }
                            System.out.println("| =" + "\t" + sumah[i]);
                        }
                        System.out.println();

                        for(int i = 0; i < sudoku.length; i++)
                        {
                            System.out.print("  " + sumav[i] + "\t");
                        }
                        break;
                    case 0:
                        System.out.println("Has abandonado el juego, Adios!! ");
                        break;
                    default:
                        System.out.println("Esta opcion no existe ");
                        System.out.println();
                }
        
        
        }
    }
}
