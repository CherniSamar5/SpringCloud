package com.samar.voitures.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarqueDTO {

	
	private Long idMarque;
	private String nomMarque;
	private String descriptionMarque;
	
}
