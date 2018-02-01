package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.abcdelivery.entities.Item;
import br.com.abcdelivery.interfaces.InterfaceItemDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class ItemDAO implements InterfaceItemDAO{

		private Connection connection; 

		public ItemDAO() {
			this.connection = ConnectionFactory.getConnection();
		}

	@Override
	public String adiconaItem(Item item) {
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
	public List<Item> listarItem() {
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
	public String atualizaItem(Item item) {
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
	public String deletarItem(String id_item) {
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
