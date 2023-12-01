package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	private int listaPostagens;
	private Amizade amizade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getListaPostagens() {
		return listaPostagens;
	}
	public void setListaPostagens(int listaPostagens) {
		this.listaPostagens = listaPostagens;
	}
	
	public Amizade getAmizade() {
		return amizade;
	}
	public void setAmizade(Amizade amizade) {
		this.amizade = amizade;
	}
	
	public void criarAmizade(Usuario usuario) {
		this.amizade.setUsuario2(usuario);
	}
}

	