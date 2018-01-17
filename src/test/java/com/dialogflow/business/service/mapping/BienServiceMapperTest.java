/*
 * Created on 16 janv. 2018 ( Time 22:12:12 )
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
import com.dialogflow.bean.Bien;
import com.dialogflow.bean.jpa.BienEntity;
import com.dialogflow.bean.jpa.ReferenceEntity;
import com.dialogflow.bean.jpa.TrancheEntity;
import com.dialogflow.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class BienServiceMapperTest {

	private BienServiceMapper bienServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		bienServiceMapper = new BienServiceMapper();
		bienServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'BienEntity' to 'Bien'
	 * @param bienEntity
	 */
	@Test
	public void testMapBienEntityToBien() {
		// Given
		BienEntity bienEntity = new BienEntity();
		bienEntity.setDenomination(mockValues.nextString(100));
		bienEntity.setSupProv(mockValues.nextFloat());
		bienEntity.setSupFinale(mockValues.nextFloat());
		bienEntity.setTf(mockValues.nextString(100));
		bienEntity.setTfMere(mockValues.nextString(100));
		bienEntity.setEtat(mockValues.nextString(100));
		bienEntity.setPrixHt(mockValues.nextFloat());
		bienEntity.setPrixTtc(mockValues.nextFloat());
		bienEntity.setDateLivraison(mockValues.nextDate());
		bienEntity.setIlot(mockValues.nextString(100));
		bienEntity.setTantieme(mockValues.nextString(100));
		bienEntity.setQuotePart(mockValues.nextString(100));
		bienEntity.setDatePermisHabiter(mockValues.nextDate());
		bienEntity.setMntTva(mockValues.nextFloat());
		bienEntity.setEchMnt1(mockValues.nextFloat());
		bienEntity.setEchMnt2(mockValues.nextFloat());
		bienEntity.setEchMnt3(mockValues.nextFloat());
		bienEntity.setEchMnt4(mockValues.nextFloat());
		bienEntity.setEchDelai1(mockValues.nextInteger());
		bienEntity.setEchDelai2(mockValues.nextInteger());
		bienEntity.setEchDelai3(mockValues.nextInteger());
		bienEntity.setEchDelai4(mockValues.nextInteger());
		bienEntity.setTypeBien(mockValues.nextString(30));
		bienEntity.setNiveau(mockValues.nextString(30));
		bienEntity.setNumBien(mockValues.nextString(30));
		bienEntity.setImmeuble(mockValues.nextString(30));
		bienEntity.setOrientation(mockValues.nextString(30));
		bienEntity.setSupBalcon(mockValues.nextFloat());
		bienEntity.setDateCreation(mockValues.nextDate());
		bienEntity.setDateMaj(mockValues.nextDate());
		bienEntity.setFraisDossier(mockValues.nextFloat());
		bienEntity.setLivrable(mockValues.nextString(12));
		bienEntity.setDateFacturation(mockValues.nextDate());
		bienEntity.setNumCadastrale(mockValues.nextString(30));
		bienEntity.setProprieteDite(mockValues.nextString(30));
		bienEntity.setSupInterieur(mockValues.nextFloat());
		bienEntity.setSupCouverte(mockValues.nextFloat());
		bienEntity.setStockFinal(mockValues.nextString(30));
		bienEntity.setDateFactFinal(mockValues.nextDate());
		bienEntity.setReference(new ReferenceEntity());
		bienEntity.getReference().setId(mockValues.nextInteger());
		bienEntity.setTranche(new TrancheEntity());
		bienEntity.getTranche().setId(mockValues.nextInteger());
		
		// When
		Bien bien = bienServiceMapper.mapBienEntityToBien(bienEntity);
		
		// Then
		assertEquals(bienEntity.getDenomination(), bien.getDenomination());
		assertEquals(bienEntity.getSupProv(), bien.getSupProv());
		assertEquals(bienEntity.getSupFinale(), bien.getSupFinale());
		assertEquals(bienEntity.getTf(), bien.getTf());
		assertEquals(bienEntity.getTfMere(), bien.getTfMere());
		assertEquals(bienEntity.getEtat(), bien.getEtat());
		assertEquals(bienEntity.getPrixHt(), bien.getPrixHt());
		assertEquals(bienEntity.getPrixTtc(), bien.getPrixTtc());
		assertEquals(bienEntity.getDateLivraison(), bien.getDateLivraison());
		assertEquals(bienEntity.getIlot(), bien.getIlot());
		assertEquals(bienEntity.getTantieme(), bien.getTantieme());
		assertEquals(bienEntity.getQuotePart(), bien.getQuotePart());
		assertEquals(bienEntity.getDatePermisHabiter(), bien.getDatePermisHabiter());
		assertEquals(bienEntity.getMntTva(), bien.getMntTva());
		assertEquals(bienEntity.getEchMnt1(), bien.getEchMnt1());
		assertEquals(bienEntity.getEchMnt2(), bien.getEchMnt2());
		assertEquals(bienEntity.getEchMnt3(), bien.getEchMnt3());
		assertEquals(bienEntity.getEchMnt4(), bien.getEchMnt4());
		assertEquals(bienEntity.getEchDelai1(), bien.getEchDelai1());
		assertEquals(bienEntity.getEchDelai2(), bien.getEchDelai2());
		assertEquals(bienEntity.getEchDelai3(), bien.getEchDelai3());
		assertEquals(bienEntity.getEchDelai4(), bien.getEchDelai4());
		assertEquals(bienEntity.getTypeBien(), bien.getTypeBien());
		assertEquals(bienEntity.getNiveau(), bien.getNiveau());
		assertEquals(bienEntity.getNumBien(), bien.getNumBien());
		assertEquals(bienEntity.getImmeuble(), bien.getImmeuble());
		assertEquals(bienEntity.getOrientation(), bien.getOrientation());
		assertEquals(bienEntity.getSupBalcon(), bien.getSupBalcon());
		assertEquals(bienEntity.getDateCreation(), bien.getDateCreation());
		assertEquals(bienEntity.getDateMaj(), bien.getDateMaj());
		assertEquals(bienEntity.getFraisDossier(), bien.getFraisDossier());
		assertEquals(bienEntity.getLivrable(), bien.getLivrable());
		assertEquals(bienEntity.getDateFacturation(), bien.getDateFacturation());
		assertEquals(bienEntity.getNumCadastrale(), bien.getNumCadastrale());
		assertEquals(bienEntity.getProprieteDite(), bien.getProprieteDite());
		assertEquals(bienEntity.getSupInterieur(), bien.getSupInterieur());
		assertEquals(bienEntity.getSupCouverte(), bien.getSupCouverte());
		assertEquals(bienEntity.getStockFinal(), bien.getStockFinal());
		assertEquals(bienEntity.getDateFactFinal(), bien.getDateFactFinal());
		assertEquals(bienEntity.getReference().getId(), bien.getBienReference());
		assertEquals(bienEntity.getTranche().getId(), bien.getRefTranche());
	}
	
	/**
	 * Test : Mapping from 'Bien' to 'BienEntity'
	 */
	@Test
	public void testMapBienToBienEntity() {
		// Given
		Bien bien = new Bien();
		bien.setDenomination(mockValues.nextString(100));
		bien.setSupProv(mockValues.nextFloat());
		bien.setSupFinale(mockValues.nextFloat());
		bien.setTf(mockValues.nextString(100));
		bien.setTfMere(mockValues.nextString(100));
		bien.setEtat(mockValues.nextString(100));
		bien.setPrixHt(mockValues.nextFloat());
		bien.setPrixTtc(mockValues.nextFloat());
		bien.setDateLivraison(mockValues.nextDate());
		bien.setIlot(mockValues.nextString(100));
		bien.setTantieme(mockValues.nextString(100));
		bien.setQuotePart(mockValues.nextString(100));
		bien.setDatePermisHabiter(mockValues.nextDate());
		bien.setMntTva(mockValues.nextFloat());
		bien.setEchMnt1(mockValues.nextFloat());
		bien.setEchMnt2(mockValues.nextFloat());
		bien.setEchMnt3(mockValues.nextFloat());
		bien.setEchMnt4(mockValues.nextFloat());
		bien.setEchDelai1(mockValues.nextInteger());
		bien.setEchDelai2(mockValues.nextInteger());
		bien.setEchDelai3(mockValues.nextInteger());
		bien.setEchDelai4(mockValues.nextInteger());
		bien.setTypeBien(mockValues.nextString(30));
		bien.setNiveau(mockValues.nextString(30));
		bien.setNumBien(mockValues.nextString(30));
		bien.setImmeuble(mockValues.nextString(30));
		bien.setOrientation(mockValues.nextString(30));
		bien.setSupBalcon(mockValues.nextFloat());
		bien.setDateCreation(mockValues.nextDate());
		bien.setDateMaj(mockValues.nextDate());
		bien.setFraisDossier(mockValues.nextFloat());
		bien.setLivrable(mockValues.nextString(12));
		bien.setDateFacturation(mockValues.nextDate());
		bien.setNumCadastrale(mockValues.nextString(30));
		bien.setProprieteDite(mockValues.nextString(30));
		bien.setSupInterieur(mockValues.nextFloat());
		bien.setSupCouverte(mockValues.nextFloat());
		bien.setStockFinal(mockValues.nextString(30));
		bien.setDateFactFinal(mockValues.nextDate());
		bien.setBienReference(mockValues.nextInteger());
		bien.setRefTranche(mockValues.nextInteger());

		BienEntity bienEntity = new BienEntity();
		
		// When
		bienServiceMapper.mapBienToBienEntity(bien, bienEntity);
		
		// Then
		assertEquals(bien.getDenomination(), bienEntity.getDenomination());
		assertEquals(bien.getSupProv(), bienEntity.getSupProv());
		assertEquals(bien.getSupFinale(), bienEntity.getSupFinale());
		assertEquals(bien.getTf(), bienEntity.getTf());
		assertEquals(bien.getTfMere(), bienEntity.getTfMere());
		assertEquals(bien.getEtat(), bienEntity.getEtat());
		assertEquals(bien.getPrixHt(), bienEntity.getPrixHt());
		assertEquals(bien.getPrixTtc(), bienEntity.getPrixTtc());
		assertEquals(bien.getDateLivraison(), bienEntity.getDateLivraison());
		assertEquals(bien.getIlot(), bienEntity.getIlot());
		assertEquals(bien.getTantieme(), bienEntity.getTantieme());
		assertEquals(bien.getQuotePart(), bienEntity.getQuotePart());
		assertEquals(bien.getDatePermisHabiter(), bienEntity.getDatePermisHabiter());
		assertEquals(bien.getMntTva(), bienEntity.getMntTva());
		assertEquals(bien.getEchMnt1(), bienEntity.getEchMnt1());
		assertEquals(bien.getEchMnt2(), bienEntity.getEchMnt2());
		assertEquals(bien.getEchMnt3(), bienEntity.getEchMnt3());
		assertEquals(bien.getEchMnt4(), bienEntity.getEchMnt4());
		assertEquals(bien.getEchDelai1(), bienEntity.getEchDelai1());
		assertEquals(bien.getEchDelai2(), bienEntity.getEchDelai2());
		assertEquals(bien.getEchDelai3(), bienEntity.getEchDelai3());
		assertEquals(bien.getEchDelai4(), bienEntity.getEchDelai4());
		assertEquals(bien.getTypeBien(), bienEntity.getTypeBien());
		assertEquals(bien.getNiveau(), bienEntity.getNiveau());
		assertEquals(bien.getNumBien(), bienEntity.getNumBien());
		assertEquals(bien.getImmeuble(), bienEntity.getImmeuble());
		assertEquals(bien.getOrientation(), bienEntity.getOrientation());
		assertEquals(bien.getSupBalcon(), bienEntity.getSupBalcon());
		assertEquals(bien.getDateCreation(), bienEntity.getDateCreation());
		assertEquals(bien.getDateMaj(), bienEntity.getDateMaj());
		assertEquals(bien.getFraisDossier(), bienEntity.getFraisDossier());
		assertEquals(bien.getLivrable(), bienEntity.getLivrable());
		assertEquals(bien.getDateFacturation(), bienEntity.getDateFacturation());
		assertEquals(bien.getNumCadastrale(), bienEntity.getNumCadastrale());
		assertEquals(bien.getProprieteDite(), bienEntity.getProprieteDite());
		assertEquals(bien.getSupInterieur(), bienEntity.getSupInterieur());
		assertEquals(bien.getSupCouverte(), bienEntity.getSupCouverte());
		assertEquals(bien.getStockFinal(), bienEntity.getStockFinal());
		assertEquals(bien.getDateFactFinal(), bienEntity.getDateFactFinal());
		assertEquals(bien.getBienReference(), bienEntity.getReference().getId());
		assertEquals(bien.getRefTranche(), bienEntity.getTranche().getId());
	}

}