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
import com.dialogflow.bean.Utilisateur;
import com.dialogflow.bean.jpa.UtilisateurEntity;
import com.dialogflow.bean.jpa.ProfilEntity;
import com.dialogflow.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class UtilisateurServiceMapperTest {

	private UtilisateurServiceMapper utilisateurServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		utilisateurServiceMapper = new UtilisateurServiceMapper();
		utilisateurServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'UtilisateurEntity' to 'Utilisateur'
	 * @param utilisateurEntity
	 */
	@Test
	public void testMapUtilisateurEntityToUtilisateur() {
		// Given
		UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
		utilisateurEntity.setNom(mockValues.nextString(100));
		utilisateurEntity.setPrenom(mockValues.nextString(100));
		utilisateurEntity.setLogin(mockValues.nextString(100));
		utilisateurEntity.setPassword(mockValues.nextString(100));
		utilisateurEntity.setDateCreation(mockValues.nextDate());
		utilisateurEntity.setDateMaj(mockValues.nextDate());
		utilisateurEntity.setProfil(new ProfilEntity());
		utilisateurEntity.getProfil().setId(mockValues.nextInteger());
		
		// When
		Utilisateur utilisateur = utilisateurServiceMapper.mapUtilisateurEntityToUtilisateur(utilisateurEntity);
		
		// Then
		assertEquals(utilisateurEntity.getNom(), utilisateur.getNom());
		assertEquals(utilisateurEntity.getPrenom(), utilisateur.getPrenom());
		assertEquals(utilisateurEntity.getLogin(), utilisateur.getLogin());
		assertEquals(utilisateurEntity.getPassword(), utilisateur.getPassword());
		assertEquals(utilisateurEntity.getDateCreation(), utilisateur.getDateCreation());
		assertEquals(utilisateurEntity.getDateMaj(), utilisateur.getDateMaj());
		assertEquals(utilisateurEntity.getProfil().getId(), utilisateur.getRefProfil());
	}
	
	/**
	 * Test : Mapping from 'Utilisateur' to 'UtilisateurEntity'
	 */
	@Test
	public void testMapUtilisateurToUtilisateurEntity() {
		// Given
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(mockValues.nextString(100));
		utilisateur.setPrenom(mockValues.nextString(100));
		utilisateur.setLogin(mockValues.nextString(100));
		utilisateur.setPassword(mockValues.nextString(100));
		utilisateur.setDateCreation(mockValues.nextDate());
		utilisateur.setDateMaj(mockValues.nextDate());
		utilisateur.setRefProfil(mockValues.nextInteger());

		UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
		
		// When
		utilisateurServiceMapper.mapUtilisateurToUtilisateurEntity(utilisateur, utilisateurEntity);
		
		// Then
		assertEquals(utilisateur.getNom(), utilisateurEntity.getNom());
		assertEquals(utilisateur.getPrenom(), utilisateurEntity.getPrenom());
		assertEquals(utilisateur.getLogin(), utilisateurEntity.getLogin());
		assertEquals(utilisateur.getPassword(), utilisateurEntity.getPassword());
		assertEquals(utilisateur.getDateCreation(), utilisateurEntity.getDateCreation());
		assertEquals(utilisateur.getDateMaj(), utilisateurEntity.getDateMaj());
		assertEquals(utilisateur.getRefProfil(), utilisateurEntity.getProfil().getId());
	}

}