package br.com.abcdelivery.entities;

import java.util.Calendar;

public class Pedido {

	private int id_pedidos;
	private Calendar tempo_de_entrega;
	private double valor;
	private String CPF;
	private String CNPJ;

	public int getId_pedidos() {
		return id_pedidos;
	}
	public void setId_pedidos(int id_pedidos) {
		this.id_pedidos = id_pedidos;
	}
	public Calendar getTempo_de_entrega() {
		return tempo_de_entrega;
	}
	public void setTempo_de_entrega(Calendar tempo_de_entrega) {
		this.tempo_de_entrega = tempo_de_entrega;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Pedido(int id_pedidos, Calendar tempo_de_entrega, double valor, String cPF, String cNPJ) {
		super();
		this.id_pedidos = id_pedidos;
		this.tempo_de_entrega = tempo_de_entrega;
		this.valor = valor;
		CPF = cPF;
		CNPJ = cNPJ;
	}	

}
