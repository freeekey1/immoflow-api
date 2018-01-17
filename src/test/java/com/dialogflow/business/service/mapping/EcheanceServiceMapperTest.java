/*
 * Created on 16 janv. 2018 ( Time 22:12:13 )
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
import com.dialogflow.bean.Echeance;
import com.dialogflow.bean.jpa.EcheanceEntity;
import com.dialogflow.bean.jpa.DossierEntity;
import com.dialogflow.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class EcheanceServiceMapperTest {

	private EcheanceServiceMapper echeanceServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		echeanceServiceMapper = new EcheanceServiceMapper();
		echeanceServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'EcheanceEntity' to 'Echeance'
	 * @param echeanceEntity
	 */
	@Test
	public void testMapEcheanceEntityToEcheance() {
		// Given
		EcheanceEntity echeanceEntity = new EcheanceEntity();
		echeanceEntity.setNumero(mockValues.nextInteger());
		echeanceEntity.setDateEcheance(mockValues.nextDate());
		echeanceEntity.setMontant(mockValues.nextFloat());
		echeanceEntity.setObservation(mockValues.nextString(500));
		echeanceEntity.setPourcentage(mockValues.nextFloat());
		echeanceEntity.setDateCreation(mockValues.nextDate());
		echeanceEntity.setDateMaj(mockValues.nextDate());
		echeanceEntity.setDossier(new DossierEntity());
		echeanceEntity.getDossier().setId(mockValues.nextInteger());
		
		// When
		Echeance echeance = echeanceServiceMapper.mapEcheanceEntityToEcheance(echeanceEntity);
		
		// Then
		assertEquals(echeanceEntity.getNumero(), echeance.getNumero());
		assertEquals(echeanceEntity.getDateEcheance(), echeance.getDateEcheance());
		assertEquals(echeanceEntity.getMontant(), echeance.getMontant());
		assertEquals(echeanceEntity.getObservation(), echeance.getObservation());
		assertEquals(echeanceEntity.getPourcentage(), echeance.getPourcentage());
		assertEquals(echeanceEntity.getDateCreation(), echeance.getDateCreation());
		assertEquals(echeanceEntity.getDateMaj(), echeance.getDateMaj());
		assertEquals(echeanceEntity.getDossier().getId(), echeance.getRefDossier());
	}
	
	/**
	 * Test : Mapping from 'Echeance' to 'EcheanceEntity'
	 */
	@Test
	public void testMapEcheanceToEcheanceEntity() {
		// Given
		Echeance echeance = new Echeance();
		echeance.setNumero(mockValues.nextInteger());
		echeance.setDateEcheance(mockValues.nextDate());
		echeance.setMontant(mockValues.nextFloat());
		echeance.setObservation(mockValues.nextString(500));
		echeance.setPourcentage(mockValues.nextFloat());
		echeance.setDateCreation(mockValues.nextDate());
		echeance.setDateMaj(mockValues.nextDate());
		echeance.setRefDossier(mockValues.nextInteger());

		EcheanceEntity echeanceEntity = new EcheanceEntity();
		
		// When
		echeanceServiceMapper.mapEcheanceToEcheanceEntity(echeance, echeanceEntity);
		
		// Then
		assertEquals(echeance.getNumero(), echeanceEntity.getNumero());
		assertEquals(echeance.getDateEcheance(), echeanceEntity.getDateEcheance());
		assertEquals(echeance.getMontant(), echeanceEntity.getMontant());
		assertEquals(echeance.getObservation(), echeanceEntity.getObservation());
		assertEquals(echeance.getPourcentage(), echeanceEntity.getPourcentage());
		assertEquals(echeance.getDateCreation(), echeanceEntity.getDateCreation());
		assertEquals(echeance.getDateMaj(), echeanceEntity.getDateMaj());
		assertEquals(echeance.getRefDossier(), echeanceEntity.getDossier().getId());
	}

}