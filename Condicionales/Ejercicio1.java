package Condicionales;

import javax.swing.JOptionPane;

/**
 * Ejercicio1
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));


        if(numero%10 ==0){

            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
        }else{

            JOptionPane.showMessageDialog(null, "El numero "+numero+"  NO es multiplo de 10");
        }
    }
}