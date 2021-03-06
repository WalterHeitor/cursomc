package com.softWalter.cursoMC.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softWalter.cursoMC.domain.Categoria;
import com.softWalter.cursoMC.repositories.CategoriaRepository;
import com.softWalter.cursoMC.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(() -> new 
					ObjectNotFoundException("Objeto não encontrado! Id: "
					+ id + " ,Tipo: "+ Categoria.class.getName()));
		
		
	}
}
