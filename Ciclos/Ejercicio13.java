package Ciclos;

import javax.swing.JOptionPane;

/**
 * Ejercicio13
 * Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los     números negativos y la cantidad de ceros.
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int numeroUsuario;

        int numerosNegativos = 0, numerosPositivos = 0, ceros =0;
       double promedioNegativos = 0, promedioPositivos = 0;


        for (int i = 0; i < 10; i++) {
            numeroUsuario=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(numeroUsuario>0){    
                promedioPositivos+=numeroUsuario;
                numerosPositivos++;

            }else if(numeroUsuario<0){
                promedioNegativos+=numeroUsuario;
                numerosNegativos++;

            } else {
                ceros++;
            }

            
        }

        promedioPositivos /=numerosPositivos;
        promedioNegativos /=numerosNegativos;

        JOptionPane.showMessageDialog(null, "Promedio numeros positivos: "+promedioPositivos);
        JOptionPane.showMessageDialog(null, "Promedio numeros negativos: "+promedioNegativos);

        JOptionPane.showMessageDialog(null, "Total de ceros: "+ ceros);

    }
}