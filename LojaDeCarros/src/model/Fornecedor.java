package model;

public class Fornecedor {
	private String empresa;
	private String CNPJ;
	private String endereco;

	public Fornecedor (String nome, String CNPJ, String endereco) {
		this.empresa = empresa;
		this.CNPJ = CNPJ;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return empresa;
	}

	public void setNome(String nome) {
		this.empresa = empresa;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCPF(String CNPJ) {
		CNPJ = CNPJ;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}