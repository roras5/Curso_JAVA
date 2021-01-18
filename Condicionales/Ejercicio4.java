package Condicionales;

import javax.swing.JOptionPane;

/**
 * Ejercicio4
 * En MegaPlaza se hace un 20% de descuente a los cuentes cuya compra supere los $300 ¿Cual sera la cantidad que pagara una persona por su compra?
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        final double descuento = 0.20;
        double aplicaDescuento = 0, aux;
        int totalCompra = Integer.parseInt(JOptionPane.showInputDialog("¿Digite el total de la compra?"));


        
        if(totalCompra > 300){
            aux = totalCompra *descuento;
            aplicaDescuento = totalCompra - aux;
            JOptionPane.showMessageDialog(null, "FELICIDADES TIENE UN  20% de descuento");
            JOptionPane.showMessageDialog(null, "El total a pagar es de "+aplicaDescuento);


        }else{

            JOptionPane.showMessageDialog(null, "El total a pagar es de "+totalCompra);
        }
    }
}