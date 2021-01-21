package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio20
 * Pedir un número N, introducir N sueldos y msotrar el suedlo máximo
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int numero ;
        double sueldo  , suedloMaximo=0;
        
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); 
      
             for (int i = 0; i <numero; i++) {

                sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo: "));

                if(sueldo>suedloMaximo){
                    suedloMaximo = sueldo;
                }
                 
             }


             JOptionPane.showMessageDialog(null, "El sueldo maximo es: "+suedloMaximo);
    }
}