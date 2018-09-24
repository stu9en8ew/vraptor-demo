package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.caelum.vraptor.model.Produto;


public class ProdutoDao {
	
	
	private EntityManager manager;
	
	protected ProdutoDao() {
		this(null);
	}
	
	@Inject
	public ProdutoDao(EntityManager manager) {
		this.manager = manager;
	}

	public void update(Produto produto) {
		manager.merge(produto);
	}
	
	public void delete(Integer id) {
		manager.remove(id);
	}

	public void salvar(Produto produto) {
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(produto);
		transaction.commit();
		
	}
	
	public List<Produto> lista() {
		List<Produto> produtos = manager.createQuery("from Produto", Produto.class).getResultList();
		return produtos;
	}

}
