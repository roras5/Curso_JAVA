package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio10
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int suma = 0, numeroM=0;

        for (int i = 1; i <= 10; i++) {

           numeroM = Integer.parseInt(JOptionPane.showInputDialog(i+".- Digite un numero: "));
            suma +=numeroM;
        }

        JOptionPane.showMessageDialog(null, "La suma total es: "+suma);
    }
}