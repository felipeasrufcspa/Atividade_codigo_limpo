package Questao3;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class questao1_if extends JInternalFrame {

	private JFrame frmProntuarioMedico;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao1_if window = new questao1_if();
					window.frmProntuarioMedico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void questao1() throws ParseException {
		frmProntuarioMedico = new JFrame();
		frmProntuarioMedico.setTitle("Prontu\u00E1rio M\u00E9dico");
		frmProntuarioMedico.setBounds(100, 100, 548, 330);
		frmProntuarioMedico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProntuarioMedico.setResizable(false);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		frmProntuarioMedico.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_dados = new JPanel();
		panel_dados.setBackground(new Color(0, 153, 255));
		tabbedPane.addTab("Dados Pessoais", new ImageIcon(questao1_if.class.getResource("/icons/registo-medico.png")), panel_dados, null);
		tabbedPane.setBackgroundAt(0, new Color(51, 153, 255));
		panel_dados.setLayout(new MigLayout("", "[][][][][grow][][grow][][grow]", "[][][][][][][][][][][][][][][][][][][][][][][][][bottom]"));
		
		JLabel lblNewLabel = new JLabel("Nome:");
		panel_dados.add(lblNewLabel, "flowx,cell 0 0,alignx left");
		
		textField = new JTextField();
		panel_dados.add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cep:");
		panel_dados.add(lblNewLabel_4, "cell 3 0,alignx trailing");
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		panel_dados.add(formattedTextField_3, "cell 4 0,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Rua:");
		panel_dados.add(lblNewLabel_5, "cell 5 0,alignx trailing");
		
		textField_4 = new JTextField();
		panel_dados.add(textField_4, "cell 6 0,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimeto:");
		panel_dados.add(lblNewLabel_1, "flowx,cell 0 1");
		
		JLabel lblNewLabel_6 = new JLabel("Bairro:");
		panel_dados.add(lblNewLabel_6, "cell 3 1,alignx trailing");
		
		textField_5 = new JTextField();
		panel_dados.add(textField_5, "cell 4 1,growx");
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade:");
		panel_dados.add(lblNewLabel_7, "cell 5 1,alignx trailing");
		
		textField_6 = new JTextField();
		panel_dados.add(textField_6, "cell 6 1,growx");
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Profiss\u00E3o :");
		panel_dados.add(lblNewLabel_3, "flowx,cell 0 3");
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		panel_dados.add(lblNewLabel_2, "cell 3 3");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_dados.add(rdbtnNewRadioButton, "flowx,cell 4 3");
		
		JLabel lblNewLabel_21 = new JLabel("Cpf:");
		panel_dados.add(lblNewLabel_21, "cell 3 6");
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
		panel_dados.add(formattedTextField_4, "cell 4 6,growx");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_dados.add(rdbtnNewRadioButton_1, "cell 4 3");
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		panel_dados.add(formattedTextField_2, "cell 0 1,growx");
		
		textField_2 = new JTextField();
		panel_dados.add(textField_2, "cell 0 3,growx");
		textField_2.setColumns(10);
		
		
		JPanel panel_anmnese = new JPanel();
		panel_anmnese.setBackground(new Color(255, 255, 102));
		tabbedPane.addTab("Anamnese", new ImageIcon(questao1_if.class.getResource("/icons/anamnese.png")), panel_anmnese, null);
		panel_anmnese.setLayout(new MigLayout("", "[grow]", "[][][][grow][][][grow][]"));
		
		JLabel lblNewLabel_8 = new JLabel("Queija Principal:");
		panel_anmnese.add(lblNewLabel_8, "flowx,cell 0 0");
		
		JTextPane textPane = new JTextPane();
		panel_anmnese.add(textPane, "cell 0 0,growx");
		
		JLabel lblNewLabel_9 = new JLabel("Evolu\u00E7\u00E3o da Queija");
		panel_anmnese.add(lblNewLabel_9, "cell 0 1");
		
		JLabel lblNewLabel_10 = new JLabel("Como come\u00E7ou: ");
		panel_anmnese.add(lblNewLabel_10, "cell 0 2");
		
		JTextPane textPane_1 = new JTextPane();
		panel_anmnese.add(textPane_1, "cell 0 3,grow");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Repetino ");
		buttonGroup_1.add(chckbxNewCheckBox);
		panel_anmnese.add(chckbxNewCheckBox, "flowx,cell 0 4");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Gradual");
		buttonGroup_1.add(chckbxNewCheckBox_1);
		panel_anmnese.add(chckbxNewCheckBox_1, "cell 0 4");
		
		JLabel lblNewLabel_11 = new JLabel("Quais Tranforma\u00E7\u00F4es ocorreram :");
		panel_anmnese.add(lblNewLabel_11, "cell 0 5");
		
		JTextPane textPane_2 = new JTextPane();
		panel_anmnese.add(textPane_2, "cell 0 6,grow");
		tabbedPane.setBackgroundAt(1, new Color(255, 255, 102));
	
		
		JPanel panel_exames = new JPanel();
		panel_exames.setBackground(new Color(51, 255, 153));
		tabbedPane.addTab("Exames ", new ImageIcon(questao1_if.class.getResource("/icons/registros-medicos.png")), panel_exames, null);
		panel_exames.setLayout(new MigLayout("", "[grow][grow]", "[][][grow][]"));
		
		JLabel lblNewLabel_12 = new JLabel("Exames dispon\u00EDveis:");
		panel_exames.add(lblNewLabel_12, "flowx,cell 0 0");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Tomografia ", "Sangue", "Raio X","Mapeamento genetico" }));
		panel_exames.add(comboBox, "cell 0 0,growx");
		
		JLabel lblNewLabel_14 = new JLabel("Data do Exame:");
		panel_exames.add(lblNewLabel_14, "flowx,cell 1 0");
		
		JLabel lblNewLabel_13 = new JLabel("Procedimentos  Para realiza\u00E7\u00E3o do Exame:");
		panel_exames.add(lblNewLabel_13, "cell 0 1,alignx left");
		
		JLabel lblNewLabel_15 = new JLabel("Hora do Exame:");
		panel_exames.add(lblNewLabel_15, "flowx,cell 1 1");
		
		JTextPane textPane_3 = new JTextPane();
		panel_exames.add(textPane_3, "cell 0 2,grow");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		panel_exames.add(formattedTextField, "cell 1 0,growx");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##h##min##s")));
		panel_exames.add(formattedTextField_1, "cell 1 1,growx");
		tabbedPane.setBackgroundAt(2, new Color(51, 255, 153));
		
		
		JPanel panel_tratamento = new JPanel();
		panel_tratamento.setBackground(new Color(204, 153, 255));
		tabbedPane.addTab(" Tratamento", new ImageIcon(questao1_if.class.getResource("/icons/medico.png")), panel_tratamento, null);
		panel_tratamento.setLayout(new MigLayout("", "[grow][grow][][grow]", "[][][][grow][]"));
		
		JLabel lblNewLabel_16 = new JLabel(" Doen\u00E7a:");
		panel_tratamento.add(lblNewLabel_16, "flowx,cell 0 0,alignx left");
		
		textField_7 = new JTextField();
		panel_tratamento.add(textField_7, "cell 0 0,alignx left");
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel(" Tratamento escolhido:");
		panel_tratamento.add(lblNewLabel_17, "cell 0 0");
		
		textField_8 = new JTextField();
		panel_tratamento.add(textField_8, "cell 0 0,growx");
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel(" Numeros de exames realizados:");
		panel_tratamento.add(lblNewLabel_18, "flowx,cell 0 1");
		
		textField_9 = new JTextField();
		panel_tratamento.add(textField_9, "cell 0 1,growx");
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel(" Descri\u00E7\u00E3o do tratamento:");
		panel_tratamento.add(lblNewLabel_19, "cell 0 2");
		
		JTextPane textPane_4 = new JTextPane();
		panel_tratamento.add(textPane_4, "flowy,cell 0 3,grow");
		
		JLabel lblNewLabel_20 = new JLabel(" Descri\u00E7\u00E3o da Doen\u00E7a :");
		panel_tratamento.add(lblNewLabel_20, "cell 0 3,alignx left");
		
		JTextPane textPane_5 = new JTextPane();
		panel_tratamento.add(textPane_5, "cell 0 3,grow");
		tabbedPane.setBackgroundAt(3, new Color(204, 153, 255));
		
		JMenuBar menuBar = new JMenuBar();
		frmProntuarioMedico.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mnMenuItem = new JMenuItem("Sair");
		mnMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setIcon(new ImageIcon(questao1_if.class.getResource("/icons/ok1.png")));
		mnMenu.add(mntmNewMenuItem);
		mnMenuItem.setIcon(new ImageIcon(questao1_if.class.getResource("/icons/clean.png")));
		mnMenu.add(mnMenuItem);
	}

}
