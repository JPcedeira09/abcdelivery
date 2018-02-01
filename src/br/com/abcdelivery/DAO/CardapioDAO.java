package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.abcdelivery.entities.Cardapio;
import br.com.abcdelivery.interfaces.InterfaceCardapioDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class CardapioDAO implements InterfaceCardapioDAO{

		private Connection connection; 

		public CardapioDAO() {
			this.connection = ConnectionFactory.getConnection();
		}
		
	@Override
	public String adiconaCardapio(Cardapio cardapio) {
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
	public List<Cardapio> listarCardapio() {
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
	public String atualizaCardapio(Cardapio cardapio) {
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
	public String deletarCardapio(String id_Cardapio) {
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
