package br.com.abcdelivery.entities;

public class Cliente {

	private String CPF;
	private String nome; 
	private String senha; 
	private String cel; 
	private String tel;
	private String email;
	private int id_endereco;


	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public Cliente(String cPF, String nome, String senha, String cel, String tel, String email, int id_endereco) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.senha = senha;
		this.cel = cel;
		this.tel = tel;
		this.email = email;
		this.id_endereco = id_endereco;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", nome=" + nome + ", senha=" + senha + ", cel=" + cel + ", tel=" + tel
				+ ", email=" + email + ", id_endereco=" + id_endereco + "]";
	}



}
