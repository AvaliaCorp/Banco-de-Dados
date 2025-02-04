package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.Empresa;

public interface IEmpresa extends CrudRepository<Empresa, String>{

}