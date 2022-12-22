package com.softWalter.cursoMC.domain.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softWalter.cursoMC.domain.enties.Categoria;
import com.softWalter.cursoMC.domain.repositories.CategoriaRepository;
import com.softWalter.cursoMC.domain.usecase.exceptions.ObjectNotFoundException;

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
