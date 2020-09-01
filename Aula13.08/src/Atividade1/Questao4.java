package Atividade1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao4 extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Questao4 dialog = new Questao4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Questao4() {
		ButtonGroup Acompanhamento = new javax.swing.ButtonGroup();
		setBounds(100, 100, 380, 251);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][]", "[][][][][][][][][]"));
		{
			JLabel lblNewLabel = new JLabel("Qual a Reposta pra multiplica\u00E7\u00E3o 5 x5 :");
			getContentPane().add(lblNewLabel, "cell 0 0 6 1");
		}
		{
			JRadioButton button1 = new JRadioButton("10");
			getContentPane().add(button1, "cell 0 1");
			Acompanhamento.add(button1);
			button1.setActionCommand("10");
		}
		{
			JRadioButton button2 = new JRadioButton("15");
			getContentPane().add(button2, "cell 1 1");
			Acompanhamento.add(button2);
			button2.setActionCommand("15");
		}
		{
			JRadioButton button3 = new JRadioButton("20");
			getContentPane().add(button3, "cell 2 1");
			Acompanhamento.add(button3);
			button3.setActionCommand("20");
		}
		{
			JRadioButton button4 = new JRadioButton("25");
			getContentPane().add(button4, "flowx,cell 3 1");
			Acompanhamento.add(button4);
			button4.setActionCommand("25");
		}
		{
			JButton Resultado = new JButton("Resultado");
			Resultado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					switch (Acompanhamento.getSelection().getActionCommand()) {
					case "10":
						JOptionPane.showMessageDialog(null, "Reposta errada!" );
						break;
					case "15" :
						JOptionPane.showMessageDialog(null, "Reposta errada!" );
						break;
					case"20":
						JOptionPane.showMessageDialog(null, "Reposta errada!" );
						break;
					case "25":
						JOptionPane.showMessageDialog(null, "Reposta certa!" );
						break;
					case"70":
						JOptionPane.showMessageDialog(null, "Reposta errada!" );
						break;

					default:
						JOptionPane.showMessageDialog(null, "Nada selecionado! " );
						break;
					}
					
				}
			});
			getContentPane().add(Resultado, "cell 3 5");
			
		}
		{
			JRadioButton button5 = new JRadioButton("70");
			getContentPane().add(button5, "cell 3 1");
			Acompanhamento.add(button5);
			button5.setActionCommand("70");
		}
	}

}
