package atividade1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CaixaComNomeDoAluno {
	
	public static void main(String[] args) {
		
			String nome = (String) JOptionPane.showInputDialog(null, "Informe o seu primeiro nome: ", "Entrada de Dados", 3, new ImageIcon(CaixaComNomeDoAluno.class.getResource("/figuras/informacao.png")), null, null);
			
			JOptionPane.showMessageDialog(null, "Nome do estudante: " + nome, "Saída", 2, new ImageIcon(CaixaComNomeDoAluno.class.getResource("/figuras/informacao.png")));
	
	}
}
