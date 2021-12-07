package SistemaVenda.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import SistemaVenda.model.Produto;

public class Repository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public Repository() {
		emf = Persistence.createEntityManagerFactory("vendas");
		em = emf.createEntityManager();
	}
	
	public Produto obterId (int id) {
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, id);
		em.getTransaction().commit();
		return produto;
	}
	
	public void remover(Produto p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List <Produto> ListarProduto(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select produto from Produto produto");
		List <Produto> produtos = consulta.getResultList();
		em.getTransaction().commit();
		return produtos;
	}
	

}
