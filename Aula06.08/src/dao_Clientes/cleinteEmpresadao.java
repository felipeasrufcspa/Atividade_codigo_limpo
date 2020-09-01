package dao_Clientes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model_Clientes.ClienteEmpresa;
public class cleinteEmpresadao {

	private ClienteEmpresa cli;
	 public cleinteEmpresadao() {
		 
	 }
	 public void SalvarCliente (ClienteEmpresa c) {
		 FileWriter fw ;
		 try {
			 fw = new FileWriter("CadastroArquivo.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			
			bw.write(c.toString());
			
			fw.close();
			bw.close();
			
		 }catch (IOException e) {
			 e.printStackTrace();
		 }
		 
	 }
}
