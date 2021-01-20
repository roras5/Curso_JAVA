package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio14
 * Pedir 10 sueldos mostrar su suma y cuantos hay mayores de $1000
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int sueldo,sumaSueldo =0, mayoraMil=0 ;


        for (int i = 0; i < 10; i++) {
            
          sueldo = Integer.parseInt(JOptionPane.showInputDialog("Sueldo: "));
            if(sueldo> 1000){
                mayoraMil++;
            }
          sumaSueldo+=sueldo;
        }


        JOptionPane.showMessageDialog(null, "Suma total de sueldos: "+sumaSueldo);
        JOptionPane.showMessageDialog(null, "Suedlos mayores a mil: "+mayoraMil);
    }
}