import java.util.Scanner;
public class ejemplo23 {
    public static void main (String[]args){
        int numero;

        Scanner entradaNumero = new Scanner(System.in);

        System.out.println("Introduce un numero");

        numero = entradaNumero.nextInt();

        if(numero == 0){
           System.out.println("Su numero es cero");
        }
        if(numero > 0){
           System.out.println("Su numero es positivo");
        }
        if(numero < 0){
           System.out.println("Su numero es negativo");
        }


    }
}
