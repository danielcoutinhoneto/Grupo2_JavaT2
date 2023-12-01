package cliente;

import java.util.ArrayList;
import java.util.Date;

public class Sessao {
	
	private Usuario donoSessao;
	
	private Date dataHoraInicio;
	
	private Date dataHoraFim;
	
	private ArrayList<Usuario> usuarios;
	
	private ArrayList<Amizade> amizades;

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public Sessao(ArrayList<Usuario> usuarios, ArrayList<Amizade> amizades, Usuario donoSessao) {
		super();
		this.donoSessao = donoSessao;
		this.dataHoraInicio = new Date();;
		this.usuarios = usuarios;
		this.amizades = amizades;
	}

	public Usuario getDonoSessao() {
		return donoSessao;
	}

	public void setDonoSessao(Usuario donoSessao) {
		this.donoSessao = donoSessao;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Amizade> getAmizades() {
		return amizades;
	}

	public void setAmizades(ArrayList<Amizade> amizades) {
		this.amizades = amizades;
	}
	
	public void menu() {
		this.amizades = amizades;
	}
	
	

}
