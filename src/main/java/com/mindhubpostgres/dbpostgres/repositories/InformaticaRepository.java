package com.mindhubpostgres.dbpostgres.repositories;

import com.mindhubpostgres.dbpostgres.models.Informatica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformaticaRepository  extends JpaRepository<Informatica, Long> {
	// Puedes agregar consultas personalizadas aquí si es necesario
}