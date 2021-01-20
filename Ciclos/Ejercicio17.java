package Ciclos;

import javax.swing.JOptionPane;

/**
 * EEjercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.
 */
public class Ejercicio17 {


    public static void main(String[] args) {

        int numeroFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas desea realizar? "));
        double precioxLitro=0, cantidadVendida, sumacantVendida = 0, facturamayor600=0;
        int IdArticulo [] = new int [numeroFacturas];

        for (int i = 0; i < numeroFacturas; i++) {

            IdArticulo [i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo del articulo"));
            
            cantidadVendida =Double.parseDouble(JOptionPane.showInputDialog("Cantidad Vendida en litros: "));

            sumacantVendida += cantidadVendida;
            precioxLitro =Double.parseDouble(JOptionPane.showInputDialog("Precio x Litro: "));

            precioxLitro*=sumacantVendida;

            if(precioxLitro>600){
                facturamayor600++;
            }
        }

        for (int i = 0; i <numeroFacturas; i++) {
            JOptionPane.showMessageDialog(null,"Numero de articulo: "+IdArticulo[i]);
            JOptionPane.showMessageDialog(null,"Cantidad Vendida x Litro Total: "+sumacantVendida);
            JOptionPane.showMessageDialog(null, "Facturacion total: "+precioxLitro);
            JOptionPane.showMessageDialog(null, "Facuras mayor a $600: "+facturamayor600);
            
        }

    
        
    }
    
}