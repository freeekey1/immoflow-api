/*
 * Created on 16 janv. 2018 ( Time 22:12:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import com.dialogflow.bean.UtilisateurTranche;
import com.dialogflow.bean.jpa.UtilisateurTrancheEntity;
import com.dialogflow.bean.jpa.TrancheEntity;
import com.dialogflow.bean.jpa.UtilisateurEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class UtilisateurTrancheServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public UtilisateurTrancheServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'UtilisateurTrancheEntity' to 'UtilisateurTranche'
	 * @param utilisateurTrancheEntity
	 */
	public UtilisateurTranche mapUtilisateurTrancheEntityToUtilisateurTranche(UtilisateurTrancheEntity utilisateurTrancheEntity) {
		if(utilisateurTrancheEntity == null) {
			return null;
		}

		//--- Generic mapping 
		UtilisateurTranche utilisateurTranche = map(utilisateurTrancheEntity, UtilisateurTranche.class);

		//--- Link mapping ( link to Tranche )
		if(utilisateurTrancheEntity.getTranche() != null) {
			utilisateurTranche.setRefTranche(utilisateurTrancheEntity.getTranche().getId());
		}
		//--- Link mapping ( link to Utilisateur )
		if(utilisateurTrancheEntity.getUtilisateur() != null) {
			utilisateurTranche.setRefUtilisateur(utilisateurTrancheEntity.getUtilisateur().getId());
		}
		return utilisateurTranche;
	}
	
	/**
	 * Mapping from 'UtilisateurTranche' to 'UtilisateurTrancheEntity'
	 * @param utilisateurTranche
	 * @param utilisateurTrancheEntity
	 */
	public void mapUtilisateurTrancheToUtilisateurTrancheEntity(UtilisateurTranche utilisateurTranche, UtilisateurTrancheEntity utilisateurTrancheEntity) {
		if(utilisateurTranche == null) {
			return;
		}

		//--- Generic mapping 
		map(utilisateurTranche, utilisateurTrancheEntity);

		//--- Link mapping ( link : utilisateurTranche )
		if( hasLinkToTranche(utilisateurTranche) ) {
			TrancheEntity tranche1 = new TrancheEntity();
			tranche1.setId( utilisateurTranche.getRefTranche() );
			utilisateurTrancheEntity.setTranche( tranche1 );
		} else {
			utilisateurTrancheEntity.setTranche( null );
		}

		//--- Link mapping ( link : utilisateurTranche )
		if( hasLinkToUtilisateur(utilisateurTranche) ) {
			UtilisateurEntity utilisateur2 = new UtilisateurEntity();
			utilisateur2.setId( utilisateurTranche.getRefUtilisateur() );
			utilisateurTrancheEntity.setUtilisateur( utilisateur2 );
		} else {
			utilisateurTrancheEntity.setUtilisateur( null );
		}

	}
	
	/**
	 * Verify that Tranche id is valid.
	 * @param Tranche Tranche
	 * @return boolean
	 */
	private boolean hasLinkToTranche(UtilisateurTranche utilisateurTranche) {
		if(utilisateurTranche.getRefTranche() != null) {
			return true;
		}
		return false;
	}

	/**
	 * Verify that Utilisateur id is valid.
	 * @param Utilisateur Utilisateur
	 * @return boolean
	 */
	private boolean hasLinkToUtilisateur(UtilisateurTranche utilisateurTranche) {
		if(utilisateurTranche.getRefUtilisateur() != null) {
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