package Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio7
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;
        System.out.println("Digit el numero total de horas");
        horasTotales = input.nextInt();


        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;

        System.out.println("El equvalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
}