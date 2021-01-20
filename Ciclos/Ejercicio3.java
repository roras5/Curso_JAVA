package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int  numero, cuadrado;

        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero%2==0){
                JOptionPane.showMessageDialog(null,"El numero es PAR"); 
            } else {
                JOptionPane.showMessageDialog(null,"El numero es IMPAR"); 
            }
      

                      
        }while(numero!=0);
    }
}