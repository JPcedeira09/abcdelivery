package br.com.abcdelivery.entities;

public class Restaurante {

	private String CNPJ;
	private String nome;
	private String classificacao;
	private int id_cardapio;
	private int id_endereco;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public int getId_cardapio() {
		return id_cardapio;
	}
	public void setId_cardapio(int id_cardapio) {
		this.id_cardapio = id_cardapio;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	
	public Restaurante(String cNPJ, String nome, String classificacao, int id_cardapio, int id_endereco) {
		super();
		CNPJ = cNPJ;
		this.nome = nome;
		this.classificacao = classificacao;
		this.id_cardapio = id_cardapio;
		this.id_endereco = id_endereco;
	}
	
	
	
}
