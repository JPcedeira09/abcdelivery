package br.com.abcdelivery.entities;

public class Iten {

	private int id_pedido;
	private int id_cardapio;
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_cardapio() {
		return id_cardapio;
	}
	public void setId_cardapio(int id_cardapio) {
		this.id_cardapio = id_cardapio;
	}
	public Iten(int id_pedido, int id_cardapio) {
		super();
		this.id_pedido = id_pedido;
		this.id_cardapio = id_cardapio;
	}



}
