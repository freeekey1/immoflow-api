/*
 * Created on 16 janv. 2018 ( Time 22:12:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import com.dialogflow.bean.Echeance;
import com.dialogflow.bean.jpa.EcheanceEntity;
import com.dialogflow.bean.jpa.DossierEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class EcheanceServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public EcheanceServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'EcheanceEntity' to 'Echeance'
	 * @param echeanceEntity
	 */
	public Echeance mapEcheanceEntityToEcheance(EcheanceEntity echeanceEntity) {
		if(echeanceEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Echeance echeance = map(echeanceEntity, Echeance.class);

		//--- Link mapping ( link to Dossier )
		if(echeanceEntity.getDossier() != null) {
			echeance.setRefDossier(echeanceEntity.getDossier().getId());
		}
		return echeance;
	}
	
	/**
	 * Mapping from 'Echeance' to 'EcheanceEntity'
	 * @param echeance
	 * @param echeanceEntity
	 */
	public void mapEcheanceToEcheanceEntity(Echeance echeance, EcheanceEntity echeanceEntity) {
		if(echeance == null) {
			return;
		}

		//--- Generic mapping 
		map(echeance, echeanceEntity);

		//--- Link mapping ( link : echeance )
		if( hasLinkToDossier(echeance) ) {
			DossierEntity dossier1 = new DossierEntity();
			dossier1.setId( echeance.getRefDossier() );
			echeanceEntity.setDossier( dossier1 );
		} else {
			echeanceEntity.setDossier( null );
		}

	}
	
	/**
	 * Verify that Dossier id is valid.
	 * @param Dossier Dossier
	 * @return boolean
	 */
	private boolean hasLinkToDossier(Echeance echeance) {
		if(echeance.getRefDossier() != null) {
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