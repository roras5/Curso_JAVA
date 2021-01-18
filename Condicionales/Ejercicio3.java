package Condicionales;

import javax.swing.JOptionPane;

/**
 * Ejercicio3
 * Hacer un programa que lea un carácter por teclado y compruebe
 * si es una letra mayúscula
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        char caracter = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);


        if(Character.isUpperCase(caracter)){

            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else {

            JOptionPane.showMessageDialog(null, "Es una letra minuscula");

    }
}
}