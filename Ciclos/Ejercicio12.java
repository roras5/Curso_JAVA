package Ciclos;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 * Ejercicio12
 * Pedir un número y calcular su factorial
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        int numeroPedir = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int factorial=1;
        for (int i = numeroPedir; i>=1; i--) {
            factorial*=i;
        }

        JOptionPane.showMessageDialog(null, "El factorial es: "+factorial);
        
    }
}