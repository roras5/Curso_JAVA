import java.util.Scanner;


public class constantes{


    public static void main(String[] args) {
        
        //variable
        int numero = 10;
         numero = 15;

        System.out.println("Variable: "+numero);

        final int constante = 4;

        System.out.println("Constante: "+ constante);


        //Guardar datos

        Scanner scan = new Scanner(System.in);


        int numerous;

        System.out.println("Digite un numero: ");
        numerous = scan.nextInt();

        System.out.println("El numero es "+numerous);


        char letra;

        System.out.println("Digite una letra: ");
        letra = scan.next().charAt(2);


        System.out.println("La letra es: "+letra);



    }
}