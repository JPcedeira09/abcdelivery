package br.com.abcdelivery.entities;

public class Item {

	private int numero_pedido;
	private int id_pedido;
	private int id_cardapio;
	
	
	public int getNumero_pedido() {
		return numero_pedido;
	}
	public void setNumero_pedido(int numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
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
	
	public Item(int numero_pedido, int id_pedido, int id_cardapio) {
		super();
		this.numero_pedido = numero_pedido;
		this.id_pedido = id_pedido;
		this.id_cardapio = id_cardapio;
	}




}
