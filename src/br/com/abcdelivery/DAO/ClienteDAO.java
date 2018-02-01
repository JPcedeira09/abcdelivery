package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.abcdelivery.entities.Cliente;
import br.com.abcdelivery.interfaces.InterfaceClienteDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class ClienteDAO implements InterfaceClienteDAO{

	private Connection connection; 

	public ClienteDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public String adiconaCliente(Cliente cliente) {

		String query = "INSERT INTO mydb.clientes (CPF, nome, senha, telefone, cel, e-mail) VALUES (?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, cliente.getCPF());
			statement.setString(2, cliente.getNome());
			statement.setString(3, cliente.getSenha());
			statement.setString(4, cliente.getTel());
			statement.setString(5, cliente.getCel());
			statement.setString(6, cliente.getEmail());

			statement.executeQuery();

			return "";
		} catch (SQLException e) {
			e.printStackTrace();
			return "";
		}
	}


	@Override
	public List<Cliente> listarClientes() {

		String query = "select * from mydb.clientes";
		
		List<Cliente> clientes = new ArrayList<Cliente>();

		try {

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet resultSet = statement.executeQuery();

			while(resultSet.next()){

				Cliente cliente = new Cliente();

				cliente.setCPF(resultSet.getString("CPF"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setSenha(resultSet.getString("senha"));
				cliente.setCel(resultSet.getString("cel"));
				cliente.setTel(resultSet.getString("telefone"));
				cliente.setEmail(resultSet.getString("email"));

				clientes.add(cliente);
				
				//System.out.println(cliente.toString());
			}

			return clientes;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String atualizaCliente(Cliente cliente) {

		String query = "";

		try {
			PreparedStatement statement = connection.prepareStatement(query);

			return "";
		} catch (SQLException e) {
			e.printStackTrace();
			return "";
		}
	}

	@Override
	public String deletarCliente(String CPF) {

		String query = "";

		try {
			PreparedStatement statement = connection.prepareStatement(query);

			return "";
		} catch (SQLException e) {
			e.printStackTrace();
			return "";
		}
	}



}
