package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.abcdelivery.entities.Restaurante;
import br.com.abcdelivery.interfaces.InterfaceRestauranteDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class RestauranteDAO implements InterfaceRestauranteDAO{

		private Connection connection; 

		public RestauranteDAO() {
			this.connection = ConnectionFactory.getConnection();
		}

	@Override
	public String adiconaRestaurante(Restaurante restaurante) {
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
	public List<Restaurante> listarClientes() {
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
	public String atualizaRestaurante(Restaurante restaurante) {
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
	public String deletarRestaurante(String CNPJ) {
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
