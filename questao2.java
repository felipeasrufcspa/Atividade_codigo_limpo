package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class questao2 extends JFrame {
	private JPanel contentPane;

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

	public questao2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setResizable(false);
		setContentPane(contentPane);
		
		JSplitPane jSplitPane = new JSplitPane();
		contentPane.add(jSplitPane, BorderLayout.CENTER);
		
		//lendo a imagem
		ImageIcon carregaImagem = new ImageIcon(getClass().getResource("/icons/homer2.jpg"));
		
		String name = "homer2.jpg";
		int altura = carregaImagem.getIconHeight();
		int largura = carregaImagem.getIconWidth();
		
		JLabel Imagem = new JLabel("");
		Imagem.setIcon(carregaImagem);
		
		//label dos paineis 
		JScrollPane scrollPane = new JScrollPane(Imagem);
		jSplitPane.setLeftComponent(scrollPane);
		
		JPanel panelTop = new JPanel();
		jSplitPane.setRightComponent(panelTop);
		panelTop.setLayout(null);
		
		JPanel panelDown = new JPanel();
		contentPane.add(panelDown, BorderLayout.SOUTH);
		
		JLabel lblnome = new JLabel("Nome da Imagem:"+ name);
		lblnome.setBounds(10, 11, 191, 14);
		panelDown.add(lblnome);
		
		JLabel lblLargura = new JLabel("Largura da Imagem: "+largura);
		lblLargura.setBounds(10, 94, 181, 14);
		panelDown.add(lblLargura);
		
		JLabel lblAltura = new JLabel("Altura da Imagem: "+ altura);
		lblAltura.setBounds(10, 184, 181, 14);
		panelDown.add(lblAltura);
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		panelDown.add(botaoSair);
	}
}
