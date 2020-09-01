package Atividade1;

import javax.swing.JOptionPane;

public class Questao2 {
public static void main(String[] args) {
double v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Largura:","Entrada de Dados",2));
double v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "altura:","Entrada de Dados",2));
double area = v1*v2;
 JOptionPane.showMessageDialog(null,"Area:\n"+ area," Resultado",2);

}
}
