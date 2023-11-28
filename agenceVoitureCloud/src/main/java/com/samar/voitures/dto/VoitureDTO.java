package com.samar.voitures.dto;

import java.util.Date;

import com.samar.voitures.entities.Image;
import com.samar.voitures.entities.Marque;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VoitureDTO {

	private Long idVoiture; 
	private String modeleVoiture;
	private Double prixVoiture;
	private Date dateFabrication;
	private Marque marque;
	private String nomMarque;
	private Image image;

}
