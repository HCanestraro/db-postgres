package com.mindhubpostgres.dbpostgres.controllers;

import com.mindhubpostgres.dbpostgres.dtos.InformaticaDTO;
import com.mindhubpostgres.dbpostgres.models.Informatica;
import com.mindhubpostgres.dbpostgres.repositories.InformaticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/informatica")
public class InformaticaController {

	private final InformaticaRepository informaticaRepository;

	@Autowired
	public InformaticaController(InformaticaRepository informaticaRepository) {
		this.informaticaRepository = informaticaRepository;
	}

	@GetMapping("/api/informatica")
	public List<InformaticaDTO> getAllInformatica() {
		List<Informatica> informatica = informaticaRepository.findAll();
		// Convierte los modelos en DTO y devuelve la lista

		return null;
	}
		// Implementa otros métodos para crear, actualizar y eliminar entradas de informática
}