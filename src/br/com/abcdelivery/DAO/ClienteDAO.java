package br.com.abcdelivery.DAO;

import java.sql.PreparedStatement;
import java.util.List;

import br.com.abcdelivery.entities.Cliente;
import br.com.abcdelivery.interfaces.IntefaceClienteDAO;

public class ClienteDAO implements IntefaceClienteDAO{

	@Override
	public void adiconaCliente(Cliente cliente) {
		
		String query = "INSERT INTO mydb.clientes (CPF, nome, senha, telefone, cel, e-mail) VALUES (?, ?, ?, ?, ?, ?)";
		
		//PreparedStatement statement = 
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizaCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarCliente(String CPF) {
		// TODO Auto-generated method stub
		
	}

	
	
}
