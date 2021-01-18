package Condicionales;
import javax.swing.JOptionPane;
/**
 * Ejercicio6 Hacer un programa que tome dos numeros y diga si ambos son pares o impares
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        
        if(num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null,"Ambos son pares ");
        } else if(num1%2==0){
            JOptionPane.showMessageDialog(null,"Solo el numero "+num1+" es par");
        } else if (num2%2 ==0){

            JOptionPane.showMessageDialog(null,"Solo el numero "+num2+ "es par");
        }else {
            JOptionPane.showMessageDialog(null,"Ambos son impares ");
        }
    }
}