package Atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Questao6 extends JFrame {

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao6 frame = new Questao6();
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
	public Questao6() {
		setTitle("Selecionador de Imagem ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Arquivo = new JMenu("Arquivo");
		menuBar.add(Arquivo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser();
				jf.setDialogTitle("Selecionando Imagem");
				int op = jf.showOpenDialog(contentPane);//abrir jdialog 
				try {
					label.setIcon(new ImageIcon(ImageIO.read(jf.getSelectedFile()).getScaledInstance(label.getWidth(), label.getHeight(), BufferedImage.TYPE_INT_RGB)));
					//lendo a imagem 
				} catch (IOException exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(Questao6.class.getResource("/icons/open.png")));
		Arquivo.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Questao6.class.getResource("/icons/exit.png")));
		Arquivo.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		label = new JLabel("");
		label.setBounds(200, 20, 240, 217);
		contentPane.add(label);
	}

}
