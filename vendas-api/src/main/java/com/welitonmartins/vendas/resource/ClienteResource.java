package com.welitonmartins.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welitonmartins.vendas.model.Cliente;
import com.welitonmartins.vendas.repository.ClienteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
}
