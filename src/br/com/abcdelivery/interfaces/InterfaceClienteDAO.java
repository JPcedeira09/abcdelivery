package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Cliente;

public interface InterfaceClienteDAO {

	public String adiconaCliente(Cliente cliente);
	
	public List<Cliente> listarClientes();
	
	public String  atualizaCliente(Cliente cliente);
	
	public String deletarCliente(String CPF);
	
}
