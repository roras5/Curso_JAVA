package Ciclos;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

/**
 * Ejercicio19
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        int aprobados = 0, condicionados = 0, suspensos =0;
        double nota;
        for (int i = 0; i < 6; i++) {

            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota: "));


            if(nota==4){
                condicionados++;
            } else if(nota>=5){
                aprobados++;
            }
            else if(nota<5  && nota!=4){
                suspensos++;
            }
        }

        JOptionPane.showMessageDialog(null,"Aprobados: "+aprobados);
        JOptionPane.showMessageDialog(null, "Condicionados: "+condicionados);
        JOptionPane.showMessageDialog(null, "Suspensos: "+suspensos);
        
    }
}