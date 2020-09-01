package Atividade1;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Spring;

public class Questao1 {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "nome do estudante:" );
		
		//
		StringBuilder mensagem = new StringBuilder();
		String estudante = (String) JOptionPane.showInputDialog(null, "Nome do estudante","Entrada de Dados ",2,
	    new ImageIcon(Questao1.class.getResource("/icons/informacao.png")), null, null);

		 
		 mensagem.append("Nome do estudante: ").append(estudante).append("!");
		 JOptionPane.showMessageDialog(null,mensagem,"Entrada de Dados ",2);
		
		 
		
	}

}






	
