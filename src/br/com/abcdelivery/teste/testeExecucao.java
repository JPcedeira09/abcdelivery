package br.com.abcdelivery.teste;

import java.util.List;

import br.com.abcdelivery.DAO.ClienteDAO;
import br.com.abcdelivery.entities.Cliente;

public class testeExecucao {

	static ClienteDAO dao = new ClienteDAO();
	
	public static void main(String[] args) {
		
		List<Cliente> clientes = dao.listarClientes();
		
		for(Cliente cliente : clientes){
			System.out.println(cliente.toString());
		}
	}
	
}

