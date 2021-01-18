package Condicionales;

import javax.swing.JOptionPane;

/**
 * condmultiples
 */
public class condmultiples {

    public static void main(String[] args) {
        

      int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero entre 1-5"));

      switch (dato) {
          case 1: 
            JOptionPane.showMessageDialog(null, "Numero 1");
              
              break;
          case 2:
          JOptionPane.showMessageDialog(null, "Numero 2");
          break;

          case 3:
          JOptionPane.showMessageDialog(null, "Numero 3");
          break;
          case 4:
          JOptionPane.showMessageDialog(null, "Numero 4");
          break;
          case 5:
          JOptionPane.showMessageDialog(null, "Numero 5");
          break;
      
          default:

          JOptionPane.showMessageDialog(null, "Erro we");
              break;
      }
    }
}