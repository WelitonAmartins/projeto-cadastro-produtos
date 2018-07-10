package com.welitonmartins.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welitonmartins.vendas.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
