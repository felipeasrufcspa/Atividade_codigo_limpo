package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Editordetexto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editordetexto frame = new Editordetexto();
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
	public Editordetexto() {
		setTitle("Editor de Texto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Editordetexto.class.getResource("/figuras/list.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfca = new JFileChooser();
				jfca.setDialogTitle("Abrir Arquivo");
				int opt = jfca.showOpenDialog(contentPane);
				
				try {
					FileReader fr = new FileReader(jfca.getSelectedFile());
					BufferedReader br = new BufferedReader(fr);
					
					String line = null;
					textArea.setText("");
					while ((line = br.readLine()) != null){
						textArea.append(line+"\n");
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		mntmAbrir.setIcon(new ImageIcon(Editordetexto.class.getResource("/figuras/open-folder-with-document (1).png")));
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfcs = new JFileChooser();
				jfcs.setDialogTitle("Salvar Arquivo");
				int opt = jfcs.showSaveDialog(contentPane);
				try {
					FileWriter fw = new FileWriter(jfcs.getSelectedFile());
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		mntmSalvar.setIcon(new ImageIcon(Editordetexto.class.getResource("/figuras/save.png")));
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(Editordetexto.class.getResource("/figuras/logout.png")));
		mnArquivo.add(mntmSair);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 21, 434, 240);
		contentPane.add(scrollPane);

		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
