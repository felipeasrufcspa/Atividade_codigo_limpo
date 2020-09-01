package control_Clientes;
import view_Clientes.Cadastro;
import model_Clientes.ClienteEmpresa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao_Clientes.cleinteEmpresadao;
public class ClienteEempresaControl implements ActionListener {

	private ClienteEmpresa cli;
	private Cadastro ja;
	private cleinteEmpresadao clidao;
	 
 
	public ClienteEempresaControl(Cadastro j , ClienteEmpresa c) {
		this.ja = j;
		this.cli = c;
		clidao = new cleinteEmpresadao();
		this.ja.getSair().addActionListener(this);
		this.ja.getSalvar().addActionListener(this);
		
		
	}
	public void Salvar() {
		String cod = this.ja.getFielcodigo().getText();
		String name = this.ja.getFielnome().getText();
		String cnpj = this.ja.getFieldcnpj().getText();
		String end = this.ja.getFieldEndereco().getText();
		
		
		cli.setCnpj(cnpj);
		cli.setCodigo(cod);
		cli.setEndereco(end);
		cli.setNome(name);
		
		clidao.SalvarCliente(cli);
		
	}
	public void sair() {
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("salvar")) {
			Salvar();
		}else if (e.getActionCommand().equals("sair")) {
			sair();
		}
	}
	
}
