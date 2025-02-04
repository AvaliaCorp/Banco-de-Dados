package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, String>{ // CrudRepositoy já um repositorio pronto já, 
																	//com alguns atributos necessário primeiro parametro é a classe principal, o segundo é o tipo do ID, identificador, 

}
