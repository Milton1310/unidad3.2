import java.util.Scanner;

public class ejemplo20 {

    public static void main (String[]args) {

        int edad;
        Scanner dato = new Scanner(System.in);

        System.out.println("dame tu edad");

        edad = dato.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }

    }
}
