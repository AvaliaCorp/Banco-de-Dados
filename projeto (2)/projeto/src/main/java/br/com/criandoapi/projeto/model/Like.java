package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "likes")
public class Like {
	
	@Id
	@Column(name="id_usuario",  columnDefinition = "TEXT")
	private String id_usario;
	
	@Column(name= "id_comentario")
	private Integer id_comentario;
	
	@Column(name= "id_avaliacao")
	private Integer id_avaliacao;

	public String getId_usario() {
		return id_usario;
	}

	public void setId_usario(String id_usario) {
		this.id_usario = id_usario;
	}

	public Integer getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(Integer id_comentario) {
		this.id_comentario = id_comentario;
	}

	public Integer getId_avaliacao() {
		return id_avaliacao;
	}

	public void setId_avaliacao(Integer id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}
	
	
}
