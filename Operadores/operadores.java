package Operadores;

import java.util.Scanner;



public class operadores{

        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            float numero_1, numero_2, suma, resta, mul, div, resto;

            System.out.println("Digite dos numeros: ");
            numero_1 = entrada.nextFloat();
            numero_2 = entrada.nextFloat();


            suma = numero_1 + numero_2;
            resta = numero_1 - numero_2;
            mul = numero_1 * numero_2;
            div = numero_1 / numero_2;
            resto = numero_1%numero_2;


            System.out.println("La suma es: "+suma);
            System.out.println("La resta es: "+resta);
            System.out.println("La multiplicacion es: "+mul);
            System.out.println("La division es: "+div);
            System.out.println("El modulo es  es: "+resto);


            int  numero = 5;

            numero += 5;

            System.out.println(numero);


            int x = 5, y;

            //subfijo

            y = x++; // primero le asignamos el valor de "x" a "y" despues hacemos el incremento 

            System.out.println(y);
            System.out.println(x);




            //Prefijo
            int x1 = 5, y1;

            y1 = ++x1;

            System.out.println(y1);
            System.out.println(x1);
 
        


        }
    }