package br.com.criandoapi.projeto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.IAvaliacoes;
import br.com.criandoapi.projeto.DAO.IComentario;
import br.com.criandoapi.projeto.DAO.IEmpresa;
import br.com.criandoapi.projeto.DAO.ILike;
import br.com.criandoapi.projeto.DAO.IResposta;
import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.Avaliacoes;
import br.com.criandoapi.projeto.model.Comentario;
import br.com.criandoapi.projeto.model.Empresa;
import br.com.criandoapi.projeto.model.Like;
import br.com.criandoapi.projeto.model.Resposta;
import br.com.criandoapi.projeto.model.Usuario;

// Classe de controle geral
@RestController
public class UsuarioController  {

	@Autowired
	private IUsuario dao;
	
	@Autowired //Iniciar automaticamente a partir do autowired, quando é identificado pelo Spring
	private IEmpresa emp;
	
	@Autowired
	private IAvaliacoes ava;
	
	@Autowired
	private IComentario com;
	
	@Autowired
	private IResposta res;
	
	@Autowired
	private ILike lik;
	
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios() {
		return (List<Usuario>) dao.findAll();
	}
	
	@GetMapping("/empresas") // Criando um endereço para acessar a API no navegador local.
	public List<Empresa> listaEmpresas(){
		return (List<Empresa>) emp.findAll(); //findAll é para retornar as intancias, valores da lista.
	}
	
	@GetMapping("/avaliacoes")
	public List<Avaliacoes> listaAvaliacoes(){ // Criando uma lista do tipo Avaliacoes e retornando após.
		return (List<Avaliacoes>) ava.findAll();
	}
	
	@GetMapping("/comentarios")
	public List<Comentario> listaComentarios() {
		return (List<Comentario>) com.findAll();
	}
	
	@GetMapping("/respostas")
	public List<Resposta> listaRespostas(){
		return (List<Resposta>) res.findAll();
	}
	
	@GetMapping("/likes")
	public List<Like> listaLikes(){
		return (List<Like>) lik.findAll();
	}
	
}
