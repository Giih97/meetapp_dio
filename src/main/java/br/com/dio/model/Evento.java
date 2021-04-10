package br.com.dio.model;

import java.io.Serializable;

public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String organizacao;
	private String local;
	private String data;
	private String horario;
	
	public Evento() {
		
	}
	
	public Evento (String nome, String organizacao, String local, String data, String horario) {
		super();
		this.nome = nome;
		this.organizacao = organizacao;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
