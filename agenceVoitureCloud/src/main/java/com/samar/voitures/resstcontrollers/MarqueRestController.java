package com.samar.voitures.resstcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samar.voitures.entities.Marque;
import com.samar.voitures.repos.MarqueRepository;

@RestController
@RequestMapping("/api/marque")
@CrossOrigin("*") 

public class MarqueRestController {
	@Autowired
	MarqueRepository marqueRepository;

	@GetMapping
	public List<Marque> getAllMarque()
	{
	return marqueRepository.findAll();
	}
	@GetMapping("/{id}")
	public Marque getCategorieById(@PathVariable("id") Long id) {
	return marqueRepository.findById(id).get();
	}

}
