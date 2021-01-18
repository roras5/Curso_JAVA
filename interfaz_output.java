import javax.swing.JOptionPane;

public class interfaz_output{

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");// solo para string 
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));



        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null,"La letra es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);




    }
}