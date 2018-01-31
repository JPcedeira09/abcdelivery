package br.com.abcdelivery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory conexaoUtil ;

	/*
	 * Retorna uma nova conexão caso não haja nenhuma intancia com o banco de dados ;
	 * */
	public static ConnectionFactory getInstance(){

		if (conexaoUtil == null ){
			conexaoUtil = new ConnectionFactory();
		}
		return conexaoUtil ; 
	}

	/*
	 * Retorna conexão com o banco de dados speds;
	 * */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/motorize", "root", "");	

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;

		}
		//jpmysql09@
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}
}
