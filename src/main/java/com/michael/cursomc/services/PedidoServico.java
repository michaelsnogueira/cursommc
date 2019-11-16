package com.michael.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.cursomc.domain.Pedido;
import com.michael.cursomc.repositories.PedidoRepository;
import com.michael.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoServico {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + 
				", Tipo: " + Pedido.class.getName()));
	}

}
