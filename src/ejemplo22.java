import java.util.Scanner;
public class ejemplo22 {
    public static void main (String[]args){
        int numero,residuo;
        Scanner dato = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = dato.nextInt();

        residuo = numero % 2;

        if (residuo == 0){
            System.out.println("Numero es par");

         }else {
            System.out.println("Numero es inpar");
        }
    }
}
