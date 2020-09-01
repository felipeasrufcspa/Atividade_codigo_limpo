package model_Clientes;

public class ClienteEmpresa {
 private String codigo;
 private String nome;
 private String cnpj;
 private String endereco;
 
public ClienteEmpresa(String codigo, String nome, String cnpj, String endereco) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.cnpj = cnpj;
	this.endereco = endereco;
}

public ClienteEmpresa() {
	
}


public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String toString () {
	return " ------------------------------------------------------------------------------ \n"+
			"Codigo: "+codigo+"\n"+
			"Nome :"+nome+"\n"+
	        "Cnpj:" +cnpj+"\n"+
			"Endereço:" +endereco+"\n"
			+ " ------------------------------------------------------------------------------ \n";
	
}
 
 
 
}
