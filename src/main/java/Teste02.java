import javax.swing.JOptionPane;

 public class Teste02 {
     public static void main(String[] args) {

         String n1 = JOptionPane.showInputDialog("primeiro numero");
         Double primeironumero = Double.parseDouble(n1);

         String n2 = JOptionPane.showInputDialog("segundo numero");
         Double segundonumero = Double.parseDouble(n2);

         String n3 = JOptionPane.showInputDialog("terceiro numero");
         Double terceironumero = Double.parseDouble(n3);

         String n4 = JOptionPane.showInputDialog("quarto numero");
         Double quartonumero = Double.parseDouble(n4);

         Double resultado = (primeironumero * primeironumero) + (segundonumero * segundonumero) + (terceironumero * terceironumero) + (quartonumero * quartonumero);

         JOptionPane.showMessageDialog(null, "o valor da soma do quadrado dos numeros é:" + resultado);
     }
 }