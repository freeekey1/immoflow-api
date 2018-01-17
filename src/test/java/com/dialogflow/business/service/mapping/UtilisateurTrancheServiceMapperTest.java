/*
 * Created on 16 janv. 2018 ( Time 22:12:15 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import com.dialogflow.bean.UtilisateurTranche;
import com.dialogflow.bean.jpa.UtilisateurTrancheEntity;
import com.dialogflow.bean.jpa.TrancheEntity;
import com.dialogflow.bean.jpa.UtilisateurEntity;
import com.dialogflow.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class UtilisateurTrancheServiceMapperTest {

	private UtilisateurTrancheServiceMapper utilisateurTrancheServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		utilisateurTrancheServiceMapper = new UtilisateurTrancheServiceMapper();
		utilisateurTrancheServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'UtilisateurTrancheEntity' to 'UtilisateurTranche'
	 * @param utilisateurTrancheEntity
	 */
	@Test
	public void testMapUtilisateurTrancheEntityToUtilisateurTranche() {
		// Given
		UtilisateurTrancheEntity utilisateurTrancheEntity = new UtilisateurTrancheEntity();
		utilisateurTrancheEntity.setDateCreation(mockValues.nextDate());
		utilisateurTrancheEntity.setDateMaj(mockValues.nextDate());
		utilisateurTrancheEntity.setTranche(new TrancheEntity());
		utilisateurTrancheEntity.getTranche().setId(mockValues.nextInteger());
		utilisateurTrancheEntity.setUtilisateur(new UtilisateurEntity());
		utilisateurTrancheEntity.getUtilisateur().setId(mockValues.nextInteger());
		
		// When
		UtilisateurTranche utilisateurTranche = utilisateurTrancheServiceMapper.mapUtilisateurTrancheEntityToUtilisateurTranche(utilisateurTrancheEntity);
		
		// Then
		assertEquals(utilisateurTrancheEntity.getDateCreation(), utilisateurTranche.getDateCreation());
		assertEquals(utilisateurTrancheEntity.getDateMaj(), utilisateurTranche.getDateMaj());
		assertEquals(utilisateurTrancheEntity.getTranche().getId(), utilisateurTranche.getRefTranche());
		assertEquals(utilisateurTrancheEntity.getUtilisateur().getId(), utilisateurTranche.getRefUtilisateur());
	}
	
	/**
	 * Test : Mapping from 'UtilisateurTranche' to 'UtilisateurTrancheEntity'
	 */
	@Test
	public void testMapUtilisateurTrancheToUtilisateurTrancheEntity() {
		// Given
		UtilisateurTranche utilisateurTranche = new UtilisateurTranche();
		utilisateurTranche.setDateCreation(mockValues.nextDate());
		utilisateurTranche.setDateMaj(mockValues.nextDate());
		utilisateurTranche.setRefTranche(mockValues.nextInteger());
		utilisateurTranche.setRefUtilisateur(mockValues.nextInteger());

		UtilisateurTrancheEntity utilisateurTrancheEntity = new UtilisateurTrancheEntity();
		
		// When
		utilisateurTrancheServiceMapper.mapUtilisateurTrancheToUtilisateurTrancheEntity(utilisateurTranche, utilisateurTrancheEntity);
		
		// Then
		assertEquals(utilisateurTranche.getDateCreation(), utilisateurTrancheEntity.getDateCreation());
		assertEquals(utilisateurTranche.getDateMaj(), utilisateurTrancheEntity.getDateMaj());
		assertEquals(utilisateurTranche.getRefTranche(), utilisateurTrancheEntity.getTranche().getId());
		assertEquals(utilisateurTranche.getRefUtilisateur(), utilisateurTrancheEntity.getUtilisateur().getId());
	}

}