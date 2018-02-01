package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Cardapio;

public interface InterfaceCardapioDAO {
	
	public String adiconaCardapio(Cardapio cardapio);
	
	public List<Cardapio> listarCardapio();
	
	public String  atualizaCardapio(Cardapio cardapio);
	
	public String deletarCardapio(String id_Cardapio);
	
}
