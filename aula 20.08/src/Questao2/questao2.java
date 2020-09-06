package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;

public class questao2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public questao2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setResizable(false);
		setContentPane(contentPane);
		// jsplite para poder utilizar dois panel no mesmo contane
		JSplitPane DoisPanel = new JSplitPane();
		contentPane.add(DoisPanel, BorderLayout.CENTER);
		// lendo a imgem com imageIcon
		ImageIcon img = new ImageIcon(getClass().getResource("/icons/homer2.jpg"));
		
		
		// instanciando as variaveis para conseguir o nome,altura e largur da imagem 
		String name = "homer2.jpg";
		int altura = img.getIconHeight();
		int largura = img.getIconWidth();
		
		JLabel Imagem = new JLabel("");
		Imagem.setIcon(img);
		
		
		//label dos paineis 
		JScrollPane scrollPane = new JScrollPane(Imagem);
		DoisPanel.setLeftComponent(scrollPane);
		
		JPanel panel_1 = new JPanel();
		DoisPanel.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da Imagem:"+ name);
		lblNewLabel.setBounds(10, 11, 191, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Largura da Imagem: "+largura);
		lblNewLabel_1.setBounds(10, 94, 181, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura da Imagem: "+ altura);
		lblNewLabel_2.setBounds(10, 184, 181, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);//saindo da aplica��o
			}
		});
		panel.add(btnNewButton);
	}
}