package atividade1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class JFileChoser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLabel;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChoser frame = new JFileChoser();
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
	public JFileChoser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc = new JFileChooser();
				jfc.setDialogTitle("Selecionar Arquivo");
				int opt = jfc.showOpenDialog(contentPane);
				
				if (opt == JFileChooser.APPROVE_OPTION){
					
					try {
						FileReader fr = new FileReader(jfc.getSelectedFile());
						BufferedReader br = new BufferedReader(fr);
						
						String linha = null;
						textPane.setText("");
						while((linha = br.readLine()) != null){
							textPane.setText(textPane.getText()+" "+linha+"\n");							
						}
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					lblLabel.setText(jfc.getSelectedFile().toString());
				}
				
			}
		});
		btnAbrir.setBounds(24, 22, 89, 23);
		contentPane.add(btnAbrir);
		
		lblLabel = new JLabel("");
		lblLabel.setBounds(172, 204, 235, 23);
		contentPane.add(lblLabel);
		
		textPane = new JTextPane();
		textPane.setBounds(172, 22, 241, 152);
		contentPane.add(textPane);
	}
}
