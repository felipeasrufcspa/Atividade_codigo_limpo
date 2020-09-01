package control_Clientes;

import java.io.IOException;

import model_Clientes.ClienteEmpresa;
import view_Clientes.Cadastro;

public class APP {
public static void main(String[] args) throws IOException {
	ClienteEmpresa cli = new ClienteEmpresa();
	
	Cadastro ja = new Cadastro();
	ja.setVisible(true);
	ClienteEempresaControl cc = new ClienteEempresaControl(ja, cli);
	
	
	
}


}
