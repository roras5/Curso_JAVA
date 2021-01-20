package Ciclos;

import javax.swing.JOptionPane;

/**
 * EEjercicio 18: 
 *  1.- 0.6$/litro
 *  2.- 3 $/litro
 *  3.- 1.25 euro/litro
 * */
public class Ejercicio18 {


    public static void main(String[] args) {

        final double producto1 = 0.6, producto2 = 3, producto3 =1.25;


        int idProducto, numeroFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas desea realizar? "));
        double cantidadVendida, sumacantVendida = 0, facturamayor600=0 , facturaTotal = 0;
       

        for (int i = 0; i < numeroFacturas; i++) {
            idProducto =  Integer.parseInt(JOptionPane.showInputDialog("Ingres el ID del producto: "));

            if(idProducto == 1){
               cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida(litros): "));
               sumacantVendida = cantidadVendida * producto1;

               if(sumacantVendida>600){
                   facturamayor600++;
               }

            } else if(idProducto == 2){
                cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida(litros): "));
               sumacantVendida = cantidadVendida * producto2;
               if(sumacantVendida>600){
                facturamayor600++;
                }
            } else if (idProducto == 3){
                cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida(litros): "));
               
                sumacantVendida = cantidadVendida * producto3;
                sumacantVendida*=20;

                if(sumacantVendida>600){
                   facturamayor600++;
               }
            } else {

                JOptionPane.showMessageDialog(null, "Articulo INCORRECTO ");
            }
            //facturaTotal =     
        }

        
        JOptionPane.showMessageDialog(null, "Facturas mayor a $600.00 MXN: "+facturamayor600);
        JOptionPane.showMessageDialog(null, "Factura total: "+sumacantVendida);
    
        
    }
    
}