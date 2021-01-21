package Arreglos;

import java.util.Scanner;

/**
 * Ejercicio3
 *  Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, la media de los negativos y conteo el número de ceros.
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ceros = 0, positivos= 0, negativos = 0, numeros [] = new int[5];
        double mediaPositivos = 0, mediaNegativos = 0;



        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite un numero: ");
            numeros[i] = input.nextInt();

            if(numeros[i]>0){

                mediaPositivos+=numeros[i];
                positivos++;
            } else if ( numeros[i]< 0){
                mediaNegativos += numeros[i];
                negativos++;
            } else {

                ceros++;
            }

            
        }

        mediaPositivos/=positivos;
        mediaNegativos/=negativos;
        
        System.out.println("Media de numeros positivos: "+mediaPositivos);
        System.out.println("Media de numeros negativos: "+mediaNegativos);
        System.out.println("Total de ceros: "+ceros);

    }
    
}