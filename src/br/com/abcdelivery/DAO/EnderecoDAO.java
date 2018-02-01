package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.abcdelivery.entities.Endereco;
import br.com.abcdelivery.interfaces.InterfaceEnderecoDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class EnderecoDAO implements InterfaceEnderecoDAO{
	
		private Connection connection; 

		public EnderecoDAO() {
			this.connection = ConnectionFactory.getConnection();
		}
		
		
	@Override
	public String adiconaEndereco(Endereco endereco) {
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
	public List<Endereco> listarEndereco() {
		String query = "";

		try {
			PreparedStatement statement = connection.prepareStatement(query);

			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String atualizaEndereco(Endereco endereco) {
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
	public String deletarEndereco(String id_endereco) {
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
