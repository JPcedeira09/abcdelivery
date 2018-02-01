package br.com.abcdelivery.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.abcdelivery.entities.Pedido;
import br.com.abcdelivery.interfaces.InterfacePedidoDAO;
import br.com.abcdelivery.util.ConnectionFactory;

public class PedidoDAO implements InterfacePedidoDAO{

		private Connection connection; 

		public PedidoDAO() {
			this.connection = ConnectionFactory.getConnection();
		}

	@Override
	public String adiconaPedido(Pedido pedido) {
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
	public List<Pedido> listarPedido() {
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
	public String atualizaPedido(Pedido pedido) {
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
	public String deletarPedido(String id_pedido) {
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
