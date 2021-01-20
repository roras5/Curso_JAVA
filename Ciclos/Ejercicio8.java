package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio8
 * Pedir un número N y mostrar los números del 1 al N
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        

        int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));


        for (int i = 1; i <=numeroUsuario; i++){
           JOptionPane.showMessageDialog(null, i);
        }
    }
}