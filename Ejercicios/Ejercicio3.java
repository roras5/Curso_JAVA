/* 
    Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double Guillermo_dolar, Luis_dolar, Juan_dolar;

        System.out.println("Cuantos dolares tiene guillermo? ");
        Guillermo_dolar = entrada.nextDouble();

        Luis_dolar = Guillermo_dolar/2;
        Juan_dolar = (Luis_dolar+Guillermo_dolar)/2;


        System.out.println("Guilelrmo tiene: "+Guillermo_dolar);
        
        System.out.println("Guilelrmo tiene: "+Luis_dolar);
        
        System.out.println("Guilelrmo tiene: "+Juan_dolar);
   
   
    }

}