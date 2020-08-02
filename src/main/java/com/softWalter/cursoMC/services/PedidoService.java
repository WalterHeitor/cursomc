package com.softWalter.cursoMC.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softWalter.cursoMC.domain.Pedido;
import com.softWalter.cursoMC.repositories.PedidoRepository;
import com.softWalter.cursoMC.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
			return obj.orElseThrow(() -> new 
					ObjectNotFoundException("Objeto não encontrado! Id: "
					+ id + " ,Tipo: "+ Pedido.class.getName()));
		
		
	}
}
