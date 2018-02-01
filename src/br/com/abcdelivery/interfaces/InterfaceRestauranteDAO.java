package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Restaurante;

public interface InterfaceRestauranteDAO {

	public String adiconaRestaurante(Restaurante restaurante);
	
	public List<Restaurante> listarClientes();
	
	public String  atualizaRestaurante(Restaurante restaurante);
	
	public String deletarRestaurante(String CNPJ);
	
}
