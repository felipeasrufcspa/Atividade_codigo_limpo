package atividade2;

import javax.swing.JOptionPane;

public class AreaDoRetangulo {
	public static void main(String[] args) {
		int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Largura do triangulo: ", "Entrada de dados", 3));
		int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura do triangulo: ", "Entrada de dados", 3));
		
		int areaRetangulo = largura*altura;
		
		JOptionPane.showMessageDialog(null, areaRetangulo, "Resultado", 1);
	}
}
