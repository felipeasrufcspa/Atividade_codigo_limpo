package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class FileChooserSave extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooserSave frame = new FileChooserSave();
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
	public FileChooserSave() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FileChooserSave.class.getResource("/figuras/icons8-bookmark-book-64.png")));
		setTitle("Editor de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setIcon(new ImageIcon(FileChooserSave.class.getResource("/figuras/icons8-pesquisar-48.png")));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setIcon(new ImageIcon(FileChooserSave.class.getResource("/figuras/icons8-abrir-pasta-48.png")));
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setIcon(new ImageIcon(FileChooserSave.class.getResource("/figuras/icons8-pasta-48.png")));
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc  = new JFileChooser("s:/");
				jfc.setDialogTitle("Selecionar Arquivo");
				int opt = jfc.showOpenDialog(contentPane);
				
				if(opt == JFileChooser.APPROVE_OPTION){
					try {
						FileWriter fw = new FileWriter(jfc.getSelectedFile());
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(textPane.getText());
						bw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		});
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(FileChooserSave.class.getResource("/figuras/icons8-excluir-48.png")));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] options = { "Sim", "Não" };
				int resposta = JOptionPane.showOptionDialog(null, "Deseja Sair?", "Saída", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				//System.out.print(resposta);
				if(resposta == 0){
					System.out.println("tchauzinho");
					
				}
			}
		});
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 424, 230);
		panel.add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
}
