package com.samar.voitures.resstcontrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samar.voitures.dto.VoitureDTO;
import com.samar.voitures.entities.Voiture;
import com.samar.voitures.service.VoitureService;


@RestController
@RequestMapping("/api/voitures")
@CrossOrigin
public class VoitureRestController {

	@Autowired
	private VoitureService voitureService;
	
	@GetMapping
	List<VoitureDTO> getAllVoitures() {

		return this.voitureService.getAllVoitures();
	}
	
	@GetMapping("/{id}")
	VoitureDTO getVoitureById(@PathVariable("id") Long id) {
		return this.voitureService.getVoiture(id);
	}
	
	@PostMapping
	VoitureDTO createNewVoiture(@RequestBody VoitureDTO voitureDTO) {
		return this.voitureService.saveVoiture(voitureDTO); 
	}
	
	@PutMapping("/{id}")
	VoitureDTO updateVoiture(@PathVariable("id") Long id, @RequestBody VoitureDTO voitureDTO) {
		voitureDTO.setIdVoiture(id);
		return this.voitureService.saveVoiture(voitureDTO);
	}
	
	@DeleteMapping("/{id}")
	void deleteVoiture(@PathVariable("id") Long id) {
		this.voitureService.deleteVoitureById(id);
	}
	
	@GetMapping("/voitsMarqs/{idMarq}")
	  public List<Voiture> getVoituresByMarqsId(@PathVariable("idMarq") Long idMarq) {
	    return voitureService.findByMarqueIdMarque(idMarq);
	  }
	


}
