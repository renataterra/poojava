package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cidade")
public class Cidade {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome;
	
	@Column(name="pib")
	private Float pib;
	
	@Column(name="populacao")
	private Integer populacao;
	
	@Column(name="prefeito")
	private String prefeito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPib() {
		return pib;
	}

	public void setPib(Float pib) {
		this.pib = pib;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	public String getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(String prefeito) {
		this.prefeito = prefeito;
	}
}
