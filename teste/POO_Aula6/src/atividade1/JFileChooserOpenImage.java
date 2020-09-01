package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FileChooserUI;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JFileChooserOpenImage extends JFrame {

	private JPanel contentPane;
	private JLabel lblLabelImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserOpenImage frame = new JFileChooserOpenImage();
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
	public JFileChooserOpenImage() {
		setTitle("JFileChooser Open2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirImagem = new JButton("Abrir Imagem");
		btnAbrirImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				jfc.setDialogTitle("Selecionar Imagem");
				int opt = jfc.showOpenDialog(contentPane);
				if(opt == JFileChooser.APPROVE_OPTION){
					//lblLabelImage.setIcon(new ImageIcon(jfc.getSelectedFile().getAbsolutePath()));
					try {
						lblLabelImage.setIcon(new ImageIcon(ImageIO.read(jfc.getSelectedFile()).getScaledInstance
								(lblLabelImage.getWidth(), lblLabelImage.getHeight(), BufferedImage.TYPE_INT_RGB)));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnAbrirImagem.setBounds(25, 21, 119, 23);
		contentPane.add(btnAbrirImagem);
		
		lblLabelImage = new JLabel("");
		lblLabelImage.setBounds(154, 21, 255, 214);
		contentPane.add(lblLabelImage);
	}

}
