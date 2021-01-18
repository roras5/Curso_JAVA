 package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
     
    /* 
        Una compañia de ventas de carros usados, paga a su personal de ventas un salario de $ 1000 mensuales, mas una comision de $150 por cada carro vendido, más del 5$ ddel valor de l venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos eprtinentes. Hacer un programa que  calcule e imprima el salario mensual de un vendedor dado
    */

    public static void main(String[] args) {
        final double salarioMensual = 1000;
        int carrosVendidos;
        double costoCarros [], comision = 0,salarioFinal=0, extra = 150;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese cuantos carros ah vendido: ");
        carrosVendidos = input.nextInt();

        costoCarros = new double [carrosVendidos];
        for(int i=0; i<carrosVendidos;i++){

            System.out.println("Ingrese el precio de venta del carro: ");
            costoCarros[i] = input.nextDouble();
            comision = 0.05* costoCarros[i];
            
            salarioFinal +=comision;

        }
       
        extra *= carrosVendidos;
        salarioFinal += salarioMensual + extra;

        System.out.println("Carros vendidos: "+carrosVendidos);
        System.out.println("Comision por carro vendido: $"+comision);
        System.out.println("Salario Mensual Fijo: $"+salarioMensual);
        System.out.println("Extra por carro vendido: $"+extra);
        System.out.println("---------------------------------------");
        System.out.println("Su salario es de: $"+salarioFinal);
        
    }

    
}