package com.softWalter.cursoMC.domain.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softWalter.cursoMC.domain.enties.Cliente;
import com.softWalter.cursoMC.domain.repositories.ClienteRepository;
import com.softWalter.cursoMC.domain.usecase.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
			return obj.orElseThrow(() -> new 
					ObjectNotFoundException("Objeto não encontrado! Id: "
					+ id + " ,Tipo: "+ Cliente.class.getName()));
		
		
	}
}
