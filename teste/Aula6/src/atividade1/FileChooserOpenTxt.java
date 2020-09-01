package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class FileChooserOpenTxt extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooserOpenTxt frame = new FileChooserOpenTxt();
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
	public FileChooserOpenTxt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser jfc  = new JFileChooser("s:/");
				jfc.setDialogTitle("Selecionar Arquivo");
				int opt = jfc.showOpenDialog(contentPane);
				
				if(opt == JFileChooser.APPROVE_OPTION){
					
					try {
						FileReader fr = new FileReader(jfc.getSelectedFile());
						BufferedReader br = new BufferedReader(fr);
						String linha = null;
						
						try {
							while((linha = br.readLine())!=null){
								
								textPane.setText(textPane.getText()+" "+linha+"\n");
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					
					lblNewLabel.setText(jfc.getSelectedFile().getAbsolutePath());
				}
				
			}
		});
		btnAbrir.setBounds(10, 11, 89, 45);
		contentPane.add(btnAbrir);
		
		lblNewLabel = new JLabel("Arquivo");
		lblNewLabel.setBounds(23, 191, 385, 36);
		contentPane.add(lblNewLabel);
		
		textPane = new JTextPane();
		textPane.setBounds(148, 11, 276, 139);
		contentPane.add(textPane);
	}
}
