package Arreglos;

import java.util.Scanner;

/**
 * Ejercicio1
 * Leer  5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 * 
 *  */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arreglo [] = new int [5];



        for (int i= 0; i<arreglo.length;i++ ){

            System.out.println("Digite un dato: ");
            arreglo[i] = input.nextInt();
        
            
        }


        for (int i : arreglo) {

            System.out.println(i);
            
        }
    
    
    
    }
}