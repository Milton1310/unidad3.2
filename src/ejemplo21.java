import javax.swing.JOptionPane;
public class ejemplo21 {
    public static void main (String[]args) {
        String entrada;
        int edad;

        entrada = JOptionPane.showInputDialog("Introduce tu edad");

        edad = Integer.parseInt(entrada);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null,"Eres mayor de edad");
        }else {
            JOptionPane.showMessageDialog(null,"Eres menor de edad");
        }


    }
}
