package com.softWalter.cursoMC.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softWalter.cursoMC.domain.enties.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
