package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio16 Pude un numero ( que debe estar entre 0 y 10)y mostrar la tabla que multiplica dicho numero
 */
public class Ejercicio16 {

    public static void main(String[] args) {


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre el 0 y 10: "));
        int tablaMultiplicacion  = 1;

        for (int i = 1; i <=10; i++) {
            tablaMultiplicacion = i * numero;
            JOptionPane.showMessageDialog(null,i+ " * " +numero +" = "+tablaMultiplicacion);
            
        }



        
    }
}