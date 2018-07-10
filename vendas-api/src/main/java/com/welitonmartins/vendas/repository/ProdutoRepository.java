package com.welitonmartins.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welitonmartins.vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
