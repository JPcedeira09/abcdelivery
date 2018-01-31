package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Cliente;

public interface IntefaceClienteDAO {

	public void adiconaCliente(Cliente cliente);
	
	public List<Cliente> listarClientes();
	
	public void atualizaCliente(Cliente cliente);
	
	public void deletarCliente(String CPF);
	
}
