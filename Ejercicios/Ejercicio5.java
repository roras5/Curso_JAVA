package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {

    /* 
        Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, Primer Examen Final, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double primeExamen=0, segundoExamen=0, examenFinal=0, notaFinal=0, participacion=0;


        System.out.println("Calificacion Participaciones: ");
        participacion = input.nextDouble();

        System.out.println("Califiacion Primer Examen Parcial: ");
        primeExamen = input.nextDouble();


        System.out.println("Califiacion Segundo Examen Parcial: ");
        segundoExamen = input.nextDouble();

        System.out.println("Califiacion Examen Final: ");
        examenFinal = input.nextDouble();

        participacion *= 0.10;
        primeExamen *=0.25;
        segundoExamen *=0.25;
        examenFinal *=0.40;

        notaFinal = (participacion + primeExamen + segundoExamen + examenFinal);

        System.out.println("Tu calificación final es: "+notaFinal);


        
    }

    
}