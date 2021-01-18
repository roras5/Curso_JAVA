package Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio6
 * Hacer un programa que calcule el cuadrado e una suma
 * (a+b)**2 = a**2 +b**2 +2ab
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        double a , b, suma;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite el valor de a: ");
        a = input.nextDouble();

        System.out.println("Digite el valor de b: ");
        b = input.nextDouble();


        suma =(Math.pow(a, 2)+ Math.pow(b,2) + 2*a*b);


        System.out.println("La suma  a**2 +b**2 +2ab ");
        System.out.println(Math.pow(a, 2)+"+"+Math.pow(b, 2)+"+"+2*a*b);
        System.out.println(suma);
    }

    
}