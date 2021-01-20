package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio6
 * Pedir números hasta que se teclee un 0 , mostrar la suma de todos los números introducidos
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int numero, suma=0;

        do {

         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         suma +=numero;
            
        } while (numero!=0);


        JOptionPane.showMessageDialog(null,"La suma es : "+suma);
        
    }
}