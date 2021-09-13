
import javax.swing.JOptionPane;

public class Teste01 {
    public static void main(String[] args) {
        
        String n1=JOptionPane.showInputDialog("Digite a cotação do dolar em Reais:");
        n1 = n1.replace(",", ".");
        Double cotacao = Double.parseDouble(n1);      

        String n2=JOptionPane.showInputDialog("Digite a quantidade de dólares:");
        Double dolares = Double.parseDouble(n2);
        
        Double reais= cotacao * dolares;
        
        JOptionPane.showMessageDialog(null,"Você tem em reais: R$" + reais);

    }
    
}
