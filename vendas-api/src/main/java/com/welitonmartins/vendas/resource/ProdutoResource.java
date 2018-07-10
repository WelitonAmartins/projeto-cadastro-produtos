package com.welitonmartins.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welitonmartins.vendas.model.Produto;
import com.welitonmartins.vendas.repository.ProdutoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository produtos;
	@GetMapping
	public List<Produto> listar(){
		return produtos.findAll();
	}

}
