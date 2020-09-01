package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FileChooserOpenImg extends JFrame {

	private JPanel contentPane;
	private final JButton btnAbrirImagem = new JButton("Abrir Imagem");
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooserOpenImg frame = new FileChooserOpenImg();
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
	public FileChooserOpenImg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnAbrirImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser jfc = new JFileChooser();
				jfc.setDialogTitle("Selecionando Imagens");
				int opt = jfc.showOpenDialog(contentPane);
				
				if(opt == JFileChooser.APPROVE_OPTION){
					
					try {
						label.setIcon(new ImageIcon(ImageIO.read(jfc.getSelectedFile()).getScaledInstance(label.getWidth(), label.getHeight(), BufferedImage.SCALE_SMOOTH)));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//ImageIcon ic = new ImageIcon(jfc.getSelectedFile().getAbsolutePath());
					//label.setIcon(ic);
				}
			}
		});
		btnAbrirImagem.setBounds(10, 11, 120, 31);
		contentPane.add(btnAbrirImagem);
		
		label = new JLabel("");
		label.setBounds(166, 19, 240, 217);
		contentPane.add(label);
	}

}
