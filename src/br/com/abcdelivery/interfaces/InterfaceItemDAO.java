package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Item;

public interface InterfaceItemDAO {

	public String adiconaItem(Item item);
	
	public List<Item> listarItem();
	
	public String  atualizaItem(Item item);
	
	public String deletarItem(String id_item);
	
}
