import javax.swing.*;

public class Teste03 {
    public static void main(String[] args) {
        Double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("preço unitário"));
        Double quantidadeDeVendas = Double.parseDouble(JOptionPane.showInputDialog("quantidade de vendas"));
        Double porcentagemDeCaluculo = (precoUnitario * quantidadeDeVendas) * 0.05;
        JOptionPane.showMessageDialog(null,"a comissão é de " + porcentagemDeCaluculo);
    }
}
