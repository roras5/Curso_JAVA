package Ejercicios;

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        float nota1, nota2, nota3,suma;

        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();


        suma = nota1 + nota2 + nota3;

        System.out.println("\n La suma es: "+suma);

    }
}