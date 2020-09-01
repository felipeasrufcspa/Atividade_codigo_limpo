package Atividade1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class Questao5 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	int array=5;
	private int acerto = 0;
	private int erro = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Questao5 dialog = new Questao5();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Questao5() {
		setBounds(100, 100, 322, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quest\u00F5es Encadeadas ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(59, 54, 184, 23);
		contentPanel.add(lblNewLabel);
		
		{
			JButton okButton = new JButton("Iniciar");
			okButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					for (int i =0;i<array;i++) {
						Questao4 dialog = new Questao4 ();
						dialog.setVisible(true);
					}
				
					
				}
			});
			okButton.setBounds(101, 100, 85, 32);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
	}
}
