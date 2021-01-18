package Condicionales;

import javax.swing.JOptionPane;

/**
 * Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int horasTrabajadas, salarioPorHora, horasExtra; 


        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas ah trabajado?"));


        if(horasTrabajadas<=40){

            salarioPorHora = horasTrabajadas*16;

            JOptionPane.showMessageDialog(null, "El salario es de: $"+salarioPorHora);
        }else if(horasTrabajadas> 40 ){

            horasExtra = horasTrabajadas -40;
            horasExtra *= 20;
            salarioPorHora = (40*16) +(horasExtra);
           
            
            
            JOptionPane.showMessageDialog(null, "El salario es de: $"+salarioPorHora);

        }

    }
}