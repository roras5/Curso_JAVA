package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio5
 * Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego ir     pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. El proceso termina     cuando el usuario acierta y mostrar el número de intentos.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero, intetos = 0;
        int aleatorio, respuestaUsuario;
        aleatorio = (int)(Math.random() *100);
        
        do{
            
            respuestaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

            if(aleatorio > respuestaUsuario){
                
                
            }

            intetos++;

        }while(aleatorio==0);
        
    }
}