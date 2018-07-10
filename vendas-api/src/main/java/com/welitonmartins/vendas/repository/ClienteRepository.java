package com.welitonmartins.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welitonmartins.vendas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
