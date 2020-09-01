package Atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class Questao3 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private FileWriter fw;
	private String url, name = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao3 frame = new Questao3();
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
	public Questao3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mnAbrir = new JMenuItem("Abrir");
		mnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Abrir();
			}
			});
		mnAbrir.setIcon(new ImageIcon(Questao3.class.getResource("/icons/open.png")));
		mnArquivo.add(mnAbrir);
		
		JMenuItem mnSalvar = new JMenuItem("Salvar");
		mnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salvar();
			}

		});
		mnSalvar.setIcon(new ImageIcon(Questao3.class.getResource("/icons/save.png")));
		mnArquivo.add(mnSalvar);
		
		JMenuItem mnSair = new JMenuItem("Sair");
		mnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnSair.setIcon(new ImageIcon(Questao3.class.getResource("/icons/exit.png")));
		mnArquivo.add(mnSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea(10, 10);
		JScrollPane js = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane.add(js);
	}
	
	public void Salvar ( ) {
		JFileChooser jf = new JFileChooser(url);
		jf.setSelectedFile(new File(name));
		String texto = textArea.getText();
		if (texto.length() != 0) {
			int opt = jf.showSaveDialog(contentPane);
			if (opt == JFileChooser.APPROVE_OPTION) {
				try {
					File file = new File(jf.getSelectedFile().getAbsolutePath());
					fw = new FileWriter(jf.getSelectedFile() + ".txt", false);						
					fw.write(texto);// gravando o texto
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
	public void Abrir() {
		JFileChooser jfc = new JFileChooser("s:/");
		jfc.setDialogTitle("Selecionar arquivo");
		int opt = jfc.showOpenDialog(contentPane);
		textArea.setText("");

		if (opt == JFileChooser.APPROVE_OPTION) {
			try {
				FileReader fr = new FileReader(jfc.getSelectedFile());
				BufferedReader br = new BufferedReader(fr);

				String linha = null;
				while ((linha = br.readLine()) != null) {
					textArea.setText(textArea.getText() + "" + linha + "\n");
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	

}
