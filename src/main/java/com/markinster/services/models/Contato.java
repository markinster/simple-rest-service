package com.markinster.services.models;

import java.util.Date;

public class Contato {
	private String nome;
	private String fone;
	private String cor;
	private Date data;

	public Contato() {

	}

	public Contato(String nome, String fone, String cor) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.cor = cor;
		this.data = new Date();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
