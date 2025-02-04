package br.com.criandoapi.projeto.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "texto", columnDefinition = "TEXT", nullable = true)
	private String texto;
	
	@Column(name = "id_autor", length = 45, nullable = true)
	private String id_autor;
	
	@Column (name = "id_avaliacao")
	private Integer id_avaliacao;
	
	@Column(name= "data_comentario", columnDefinition = "DATE")
	private LocalDateTime data_comentario;
	
	@Column(name= "id_comentario")
	private Integer id_comentario;

	public Integer getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(Integer id_comentario) {
		this.id_comentario = id_comentario;
	}

	public LocalDateTime getData_comentario() {
		return data_comentario;
	}

	public void setData_comentario(LocalDateTime data_comentario) {
		this.data_comentario = data_comentario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getId_autor() {
		return id_autor;
	}

	public void setId_autor(String id_autor) {
		this.id_autor = id_autor;
	}

	public Integer getId_avaliacao() {
		return id_avaliacao;
	}

	public void setId_avaliacao(Integer id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}
}

