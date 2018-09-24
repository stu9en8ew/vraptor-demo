package br.com.caelum.vraptor.service;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.model.Produto;


public class ProdutosService {

	@Inject
	private ProdutoDao produtoDAO;
	
	public void update(Produto produto) {
		produtoDAO.update(produto);
	}

	public void delete(Integer id) {
		produtoDAO.delete(id);
	}

	public void salvar(Produto produto) {
		produtoDAO.salvar(produto);
	}

	public List<Produto> lista() {
		return produtoDAO.lista();
	}

}
