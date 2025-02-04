package br.com.criandoapi.projeto.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "resposta")
public class Resposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "texto", columnDefinition = "TEXT", nullable = true)
	private String texto;
	
	@Column(name="data_resposta", columnDefinition = "DATE", nullable = true)
	private LocalDateTime data_resposta;
	
	@Column (name="id_usuario")
	private String id_usuario;
	
	@Column(name= "id_empresa")
	private String id_empresa;

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

	public LocalDateTime getData_resposta() {
		return data_resposta;
	}

	public void setData_resposta(LocalDateTime data_resposta) {
		this.data_resposta = data_resposta;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}
	
	
	
	

}
