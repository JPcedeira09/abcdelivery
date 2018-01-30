package br.com.abcdelivery.entities;

public class Cardapio {

	private int id_cardapio;
	private String nome; 
	private String classificacao;
	private double preco;
	private String tamanho;
	public int getId_cardapio() {
		return id_cardapio;
	}
	public void setId_cardapio(int id_cardapio) {
		this.id_cardapio = id_cardapio;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public Cardapio(int id_cardapio, String nome, String classificacao, double preco, String tamanho) {
		super();
		this.id_cardapio = id_cardapio;
		this.nome = nome;
		this.classificacao = classificacao;
		this.preco = preco;
		this.tamanho = tamanho;
	}
	
	
	
}
