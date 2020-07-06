package com.softWalter.cursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softWalter.cursoMC.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}