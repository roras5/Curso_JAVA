package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        int edades[] = new int [5], mayorEdad = 0, mayorAltura=0;
        double alturas []= new double[5], mediaEstatura = 0, mediaEdad=0;

        for (int i = 0; i <edades.length; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite las edades:"));
            mediaEdad+=edades[i];
            if(edades[i]>18){
                mayorEdad++;
            }
            
        }

        for (int i = 0; i <alturas.length; i++) {
            
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite las estaturas:"));
            mediaEstatura+=alturas[i];

            if(alturas[i]>1.75){
                mayorAltura++;
            }
        }
        
        mediaEdad /=5;
        mediaEstatura /=5;
        JOptionPane.showMessageDialog(null, "La media de edad es: "+mediaEdad);
        JOptionPane.showMessageDialog(null, "La media de estatura es: "+mediaEstatura);
        JOptionPane.showMessageDialog(null, "Alumnos mayores de 18 anos: "+mayorEdad);
        JOptionPane.showMessageDialog(null, "Alumnos que miden mas de 1.75: "+mayorAltura);
    }
}