package br.com.abcdelivery.entities;

public class Endereco {

	private int id_endereco;
	private String CEP;
	private String bairro;
	private String cidade;
	private String estado;
	
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Endereco(int id_endereco, String cEP, String bairro, String cidade, String estado) {
		super();
		this.id_endereco = id_endereco;
		CEP = cEP;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
}
