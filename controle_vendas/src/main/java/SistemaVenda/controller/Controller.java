package SistemaVenda.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import SistemaVenda.model.Produto;


public class Controller {
	
	private EntityManager conexao = null;
	
	public Controller(EntityManagerFactory emf) {
		conexao = emf.createEntityManager();
	}
	
	public Controller() {	}
	
	public void adicionar(Produto p) {
		conexao.getTransaction().begin();
		conexao.persist(p);
		conexao.getTransaction().commit();	
	}
	
	public void remover(Produto p) {
		conexao.getTransaction().begin();
		conexao.remove(p);
		conexao.getTransaction().commit();
		conexao.close();
	}
	
	public Produto consular(int id) {
		return conexao.find(Produto.class, id);	
	}
}
