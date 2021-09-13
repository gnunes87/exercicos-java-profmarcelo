import javax.swing.*;

public class Teste04 {
    public static void main(String[] args) {
        Double valorInteiro = Double.parseDouble(JOptionPane.showInputDialog("valor inteiro"));
        Double resultado = valorInteiro - 1;
        JOptionPane.showMessageDialog(null, "o antecessor é " + resultado);
    }
}
