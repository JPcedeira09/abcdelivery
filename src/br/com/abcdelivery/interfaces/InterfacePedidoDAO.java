package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Pedido;

public interface InterfacePedidoDAO {

	public String adiconaPedido(Pedido pedido);
	
	public List<Pedido> listarPedido();
	
	public String  atualizaPedido(Pedido pedido);
	
	public String deletarPedido(String id_pedido);
	
}
