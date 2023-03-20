package model;

public class Fornecedor {
	private String nome;
	private String CNPJ;
	private String dataNascimento;
	private String endereco;

	public Fornecedor (String nome, String CNPJ, String dataNascimento, String endereco) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCPF(String CNPJ) {
		CNPJ = CNPJ;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}