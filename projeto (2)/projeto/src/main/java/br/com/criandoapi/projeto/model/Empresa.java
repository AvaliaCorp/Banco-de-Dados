package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private String id;
	
	@Column(name = "email_comercial", length = 45, nullable = true)
	private String email_comercial;
	
	@Column(name = "senha", length = 45, nullable = true)
	private String senha;
	
	@Column (name = "CNPJ" , length = 45, nullable = false)
	private String cnpj;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail_comercial() {
		return email_comercial;
	}

	public void setEmail_comercial(String email_comercial) {
		this.email_comercial = email_comercial;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
