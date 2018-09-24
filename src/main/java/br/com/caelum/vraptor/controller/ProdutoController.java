package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.service.ProdutosService;

@Controller
public class ProdutoController {
	
	@Inject
	ProdutosService produtoService;
	
	
	@Path("/form")
	public void form() {
		
	}
	
	@Path("/produto/adiciona")
	public void adiciona(Produto produto, Result result) {
		produtoService.salvar(produto);
		result.redirectTo(ProdutoController.class).lista();
	}
	
	
	@Path("/lista")
	public List<Produto> lista() {
		
		return produtoService.lista();
		
	}

}
