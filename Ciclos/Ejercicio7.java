package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio7
 * Pedir numeros hasta que se introdusca un numero negativo y calcular la media
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int numeroUsuario, contador=0;
        double promedio = 0;


        do {

            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            promedio +=numeroUsuario;

            contador++;
            
        } while (numeroUsuario>=0);
        
        contador--;
        promedio /=contador;
        JOptionPane.showMessageDialog(null,"El total de numeros ingresados es: "+contador);
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);

    }
}