package Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio8
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double a, b, c,x1,x2,x;


        System.out.println("Digite el valor de a: ");
        a = input.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = input.nextDouble();
        System.out.println("Digite el valor de c: ");
        c = input.nextDouble();


        x = -b+Math.sqrt(Math.pow(b, 2)-(4*a*c));
        x = x /(2*a);


        System.out.println("x: " +x);
    }
}