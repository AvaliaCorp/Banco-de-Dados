package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.Comentario;

public interface IComentario extends CrudRepository<Comentario, Integer>{ 

}
