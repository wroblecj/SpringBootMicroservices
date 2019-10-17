package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchById(int id) 
	{
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("40.70");
		specimenDTO.setLongitude("-65.42");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimentDTO) 
	{
		
	}
}
