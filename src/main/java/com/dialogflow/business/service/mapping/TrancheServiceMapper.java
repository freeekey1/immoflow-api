/*
 * Created on 16 janv. 2018 ( Time 22:12:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import com.dialogflow.bean.Tranche;
import com.dialogflow.bean.jpa.TrancheEntity;
import com.dialogflow.bean.jpa.ProjetEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class TrancheServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public TrancheServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'TrancheEntity' to 'Tranche'
	 * @param trancheEntity
	 */
	public Tranche mapTrancheEntityToTranche(TrancheEntity trancheEntity) {
		if(trancheEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Tranche tranche = map(trancheEntity, Tranche.class);

		//--- Link mapping ( link to Projet )
		if(trancheEntity.getProjet() != null) {
			tranche.setRefProjet(trancheEntity.getProjet().getId());
		}
		return tranche;
	}
	
	/**
	 * Mapping from 'Tranche' to 'TrancheEntity'
	 * @param tranche
	 * @param trancheEntity
	 */
	public void mapTrancheToTrancheEntity(Tranche tranche, TrancheEntity trancheEntity) {
		if(tranche == null) {
			return;
		}

		//--- Generic mapping 
		map(tranche, trancheEntity);

		//--- Link mapping ( link : tranche )
		if( hasLinkToProjet(tranche) ) {
			ProjetEntity projet1 = new ProjetEntity();
			projet1.setId( tranche.getRefProjet() );
			trancheEntity.setProjet( projet1 );
		} else {
			trancheEntity.setProjet( null );
		}

	}
	
	/**
	 * Verify that Projet id is valid.
	 * @param Projet Projet
	 * @return boolean
	 */
	private boolean hasLinkToProjet(Tranche tranche) {
		if(tranche.getRefProjet() != null) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}