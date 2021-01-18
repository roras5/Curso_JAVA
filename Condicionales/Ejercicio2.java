package Condicionales;
import javax.swing.JOptionPane;

/**
 * Ejercicio2
 * Pedir dos números y decir cual es el mayor o si son iguales
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        int num1 , num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));


        if(num1 > num2){

            JOptionPane.showMessageDialog(null, "El mayor es: "+ num1);
        }else if(num1 < num2){
            JOptionPane.showMessageDialog(null, "El mayor es: "+ num2);

        }else {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }



       
    }
}