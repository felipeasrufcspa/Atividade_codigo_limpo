package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.Font;

import javax.swing.JTextArea;

public class EditorDeTexto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					EditorDeTexto frame = new EditorDeTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public EditorDeTexto() throws IOException {
		
		setTitle("Editor de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 379);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		menuBar.add(mnMenu);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser(url);
				int opt = jf.showOpenDialog(contentPane);
				if (opt == JFileChooser.APPROVE_OPTION) {
					try {
						FileReader fr = new FileReader(jf.getSelectedFile());
						url = jf.getCurrentDirectory().getAbsolutePath();
						name = jf.getSelectedFile().getName();
						BufferedReader br = new BufferedReader(fr);

						String linha = null;
						try {
							while ((linha = br.readLine()) != null) {
								textArea.setText(textArea.getText() + "" + linha + "\n");
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		mntmAbrir.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMenu.add(mntmAbrir);

		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
		});
		mntmSalvar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnMenu.add(mntmSalvar);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textArea.getText().length() != 0) {
					int op = JOptionPane.showConfirmDialog(contentPane, "Você deseja salvar o arquivo?", "Sair", 1);
					if (op == 0) {
						salvar();
					} else if (op == 1) {
						System.exit(0);
					}

				} else {
					System.exit(0);
				}
			}
		});
		mnMenu.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textArea = new JTextArea(10, 10);
		JScrollPane js = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane.add(js);

	}

	private void salvar() {
		JFileChooser jf = new JFileChooser(url);
		jf.setSelectedFile(new File(name));
		String text = textArea.getText();
		if (text.length() != 0) {
			int opt = jf.showSaveDialog(contentPane);
			if (opt == JFileChooser.APPROVE_OPTION) {
				try {
					File file = new File(jf.getSelectedFile().getAbsolutePath());
					if (file.exists()) {
						int op = JOptionPane.showConfirmDialog(contentPane, "Você deseja sobrescrever o arquivo?", "",
								1);
						if (op == 0) {
							fw = new FileWriter(jf.getSelectedFile(), false);
						}
					} else {
						fw = new FileWriter(jf.getSelectedFile() + ".txt", false);
					}
					fw.write(text);
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else {
			JOptionPane.showConfirmDialog(contentPane, "Texto vazio!", "", 2, 0);
		}

	}

}
