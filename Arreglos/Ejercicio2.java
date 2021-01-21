package Arreglos;

import java.util.Scanner;

/**
 * Ejercicio2
 * 
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en orden inverso
 */
public class Ejercicio2 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        int arreglo [] = new int [5];



        for (int i= 0; i<arreglo.length;i++ ){

            System.out.println("Digite un dato: ");
            arreglo[i] = input.nextInt();
        
            
        }


        for (int i = arreglo.length; i>=0; i--) {

            System.out.println(i);
            
        }
        



    }
}