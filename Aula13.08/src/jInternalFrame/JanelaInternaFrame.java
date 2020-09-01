package jInternalFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaInternaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInternaFrame frame = new JanelaInternaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	int cont = 0;

	public JanelaInternaFrame() {
		setTitle("Janela Interna com Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JInternalFrame jin = new JInternalFrame("Janela interna");		
//				jin.setBounds(cont,cont,300,200);
//				cont += 20;
//				jin.setResizable(false);
//				jin.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
//				JLabel labelNome = new JLabel("Nome");
//				jin.getContentPane().add(labelNome);
//				jin.setVisible(true);
//				jin.setMaximizable(true);
//				jin.setClosable(true);
//				contentPane.add(jin);
//				contentPane.repaint();

				JanelaInterna ji = new JanelaInterna();
				ji.setVisible(true);
				contentPane.add(ji);
				contentPane.repaint();
			}
		});
		btnAbrir.setBounds(188, 98, 89, 23);
		contentPane.add(btnAbrir);
	}
}
