package br.com.abcdelivery.interfaces;

import java.util.List;

import br.com.abcdelivery.entities.Endereco;

public interface InterfaceEnderecoDAO {

	public String adiconaEndereco(Endereco endereco);
	
	public List<Endereco> listarEndereco();
	
	public String  atualizaEndereco(Endereco endereco);
	
	public String deletarEndereco(String id_endereco);
	
}
