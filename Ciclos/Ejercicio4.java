package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio4
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       int numero, contador =0;
        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            contador++;
      

                      
        }while(numero>=0);

        JOptionPane.showMessageDialog(null,"Numeros introducidos: "+contador);
    }
}