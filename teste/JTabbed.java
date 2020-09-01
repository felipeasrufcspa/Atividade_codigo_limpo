package jTabbed;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.Tab;
import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class JTabbed extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTabbed frame = new JTabbed();
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
	public JTabbed() {
		setDefaultCloseOperation(JTabbed.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tab = new JTabbedPane();
		tab.setSize(450,300);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l1 = new JLabel("Nome");
		p1.add(l1);
		tab.add("Guia 1",l1);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l2 = new JLabel("Nome");
		p2.add(l2);
		tab.add("Guia 2",l2);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l3 = new JLabel("Nome");
		p3.add(l3);
		tab.add("Guia 3",l3);
		
		tab.setVisible(true);
		contentPane.add(tab);
		
		
	}

}
