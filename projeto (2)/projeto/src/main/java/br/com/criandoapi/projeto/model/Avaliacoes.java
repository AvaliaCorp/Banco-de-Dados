package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Fazendo Referencia a entidade do banco de dados.
@Table(name ="avaliacao") // Fazendo referencia a tabela avaliacao , a classe avaliacoes agora é a tabela avaliacao do banco de dados.
public class Avaliacoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // comando usado para gerar o ID automático, como o auto_increment no banco de dados.
	@Column(name = "id_avaliacao") // Fazendo referencia a coluna/atributo do banco de dados, logo a declaração de variavel abaixo, recebe o elemento da coluna id_avaliacao do banco de dados
	private Integer id_avaliacao;
	
	@Column(name = "id_usuario")
	private String id_usuario;
	
	@Column(name = "titulo", length = 45, nullable = true) // length é o tamanho da variavel, e nullable é o mesmo do not null em mysql.
	private String titulo;
	
	@Column (name = "nota" , columnDefinition = "REAL", nullable = false) // columnDefinition é pra definir o tipo da variavel.Lembrando que o nome deve ser o mesmo que está no banco de dados
	private Float nota;
	
	@Column (name = "texto" , length = 1000, nullable = true)
	private String texto;

	public Integer getId_avaliacao() { // Getters e Setters abaixo.
		return id_avaliacao;
	}

	public void setId_avaliacao(Integer id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
