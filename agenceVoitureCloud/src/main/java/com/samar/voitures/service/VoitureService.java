package com.samar.voitures.service;

import java.util.List;


import org.springframework.data.domain.Page;

import com.samar.voitures.dto.VoitureDTO;
import com.samar.voitures.entities.Marque;
import com.samar.voitures.entities.Voiture;

public interface VoitureService {
	
	
	
	VoitureDTO saveVoiture(VoitureDTO v);
	VoitureDTO getVoiture(Long id);
	List<VoitureDTO> getAllVoitures();

	
	VoitureDTO updateVoiture(VoitureDTO v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	
	Page<Voiture> getAllVoituresParPage(int page, int size);
	List<Voiture> findByModeleVoiture(String nom);
	List<Voiture> findByModeleVoitureContains(String nom);
	List<Voiture> findByModeleVoiturePrixVoiture (String nom, Double prix);
	List<Voiture> findByMarque (Marque marque);
	List<Voiture> findByMarqueIdMarque(Long id);
	VoitureDTO convertEntityToDto (Voiture voiture);
	Voiture convertDtoToEntity(VoitureDTO voitureDTO);



	

	}
