/* Hace run programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabakadas y de su salario por hora 

*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        final double salarioPorhora = 12.8;
        double horas,  salarioPorsemana;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus horas trabajadas: ");
        horas = entrada.nextDouble();

        salarioPorsemana = horas * salarioPorhora;

        System.out.println("El pago por hora es: $"+salarioPorhora+"MXN");
        System.out.println("Su salario semanal es: \n$"+salarioPorsemana+"MXN");
        
    }
}