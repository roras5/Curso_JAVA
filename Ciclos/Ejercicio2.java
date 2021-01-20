package Ciclos;

/**
 * Ejercicio1
 * Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se    introduzca un número negativo.
 */
import javax.swing.*;
public class Ejercicio2 {

    public static void main(String[] args) {
        int  numero, cuadrado;

        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero>=0){
                JOptionPane.showMessageDialog(null,"El numero es POSITIVO"); 
            } else {
                JOptionPane.showMessageDialog(null,"El numero es NEGATIVO"); 
            }
      

                      
        }while(numero!=0);
        
    }
}