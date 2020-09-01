package view_Clientes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

	private JPanel Cadastro;
	private JTextField fielcodigo;
	private JTextField fielnome;
	private JTextField Fieldcnpj;
	private JTextField FieldEndereco;
	private JButton sair;
	private JButton salvar;

	public JButton getSair() {
		return sair;
	}

	public void setSair(JButton sair) {
		this.sair = sair;
	}

	public JButton getSalvar() {
		return salvar;
	}

	public void setSalvar(JButton salvar) {
		this.salvar = salvar;
	}

	/**
	 * Launch the application.
	 */
	
	

	public JPanel getCadastro() {
		return Cadastro;
	}

	public void setCadastro(JPanel cadastro) {
		Cadastro = cadastro;
	}

	public JTextField getFielcodigo() {
		return fielcodigo;
	}

	public void setFielcodigo(JTextField fielcodigo) {
		this.fielcodigo = fielcodigo;
	}

	public JTextField getFielnome() {
		return fielnome;
	}

	public void setFielnome(JTextField fielnome) {
		this.fielnome = fielnome;
	}

	public JTextField getFieldcnpj() {
		return Fieldcnpj;
	}

	public void setFielcnpj(JTextField fieldcnpj) {
		Fieldcnpj = fieldcnpj;
	}

	public JTextField getFieldEndereco() {
		return FieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		FieldEndereco = fieldEndereco;
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Cadastro() throws IOException {
		setTitle("Cadastro Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 354);
		Cadastro = new JPanel();
		Cadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		Cadastro.setLayout(new BorderLayout(0, 0));
		setContentPane(Cadastro);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 51));
		Cadastro.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new MigLayout("", "[100px][85px]", "[80px]"));
		
		JLabel imagem = new JLabel("");
		imagem.setBounds(0, 0, 100, 80);
		imagem.setIcon(new ImageIcon (ImageIO.read(Cadastro.class.getResource("/icons/internet.png")).getScaledInstance(imagem.getWidth(), imagem.getHeight(),BufferedImage.TYPE_INT_RGB)));
		imagem.setAlignmentY(Component.TOP_ALIGNMENT);
		
		panel1.add(imagem, "cell 0 0,alignx left,aligny top");
		
		JLabel lblNewLabel = new JLabel("Cadastro Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel1.add(lblNewLabel, "cell 1 0,alignx left,aligny center");
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(204, 255, 153));
		Cadastro.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[100px][]", "[][][][][][15][][]"));
		
		JLabel Labelcodigo = new JLabel("C\u00F3digo");
		panel2.add(Labelcodigo, "cell 0 0");
		
		JLabel LabelNome = new JLabel("Nome");
		panel2.add(LabelNome, "cell 1 0");
		
		fielcodigo = new JTextField();
		panel2.add(fielcodigo, "cell 0 1,growx");
		fielcodigo.setColumns(10);
		
		fielnome = new JTextField();
		panel2.add(fielnome, "cell 1 1,pushx , growx,alignx left");
		fielnome.setColumns(10);
		
		JLabel LabelCnpj = new JLabel("Cnpj");
		panel2.add(LabelCnpj, "cell 0 2");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		panel2.add(labelEndereco, "cell 1 2");
		
		Fieldcnpj = new JTextField();
		panel2.add(Fieldcnpj, "cell 0 3,growx");
		Fieldcnpj.setColumns(10);
		
		FieldEndereco = new JTextField();
		panel2.add(FieldEndereco, "cell 1 3,growx");
		FieldEndereco.setColumns(10);
		
		salvar = new JButton("Salvar");
		salvar.setIcon(new ImageIcon(Cadastro.class.getResource("/icons/salve-.png")));
		panel2.add(salvar, "cell 0 7,split 2");
		
		sair = new JButton("Sair");
		sair.setIcon(new ImageIcon(Cadastro.class.getResource("/icons/saida.png")));
		panel2.add(sair, "cell 1 7");
	}

}
