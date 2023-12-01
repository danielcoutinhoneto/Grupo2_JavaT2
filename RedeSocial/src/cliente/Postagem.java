package cliente;

import java.util.ArrayList;

public class Postagem {
	
	private int pontuacao;
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	private String conteudo;
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	private ArrayList <Postagem> ListagemdePostagem;

}
