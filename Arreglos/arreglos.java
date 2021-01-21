package Arreglos;

import java.util.Scanner;

/**
 * arreglos
 */
public class arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite el tamaño del arreglo: ");
        int tamanoArreglo = input.nextInt();
        int [] numeros = new int [tamanoArreglo];


        for (int i = 0; i <numeros.length; i++) {
           System.out.println("Digite un dato: ");
            numeros[i]= input.nextInt();
            
        }


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}