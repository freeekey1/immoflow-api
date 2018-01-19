/*
 * Created on 16 janv. 2018 ( Time 22:12:12 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.dialogflow.bean.Bien;
import com.dialogflow.bean.jpa.BienEntity;
import com.dialogflow.business.service.mapping.BienServiceMapper;
import com.dialogflow.data.repository.jpa.BienJpaRepository;
import com.dialogflow.test.BienFactoryForTest;
import com.dialogflow.test.BienEntityFactoryForTest;
import com.dialogflow.test.MockValues;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Test : Implementation of BienService
 */
@RunWith(MockitoJUnitRunner.class)
public class BienServiceImplTest {

	@InjectMocks
	private BienServiceImpl bienService;
	@Mock
	private BienJpaRepository bienJpaRepository;
	@Mock
	private BienServiceMapper bienServiceMapper;
	
	private BienFactoryForTest bienFactoryForTest = new BienFactoryForTest();

	private BienEntityFactoryForTest bienEntityFactoryForTest = new BienEntityFactoryForTest();

	private MockValues mockValues = new MockValues();
	
	@Test
	public void findById() {
		// Given
		Integer id = mockValues.nextInteger();
		
		BienEntity bienEntity = bienJpaRepository.findOne(id);
		
		Bien bien = bienFactoryForTest.newBien();
		when(bienServiceMapper.mapBienEntityToBien(bienEntity)).thenReturn(bien);

		// When
		Bien bienFound = bienService.findById(id);

		// Then
		assertEquals(bien.getId(),bienFound.getId());
	}

	@Test
	public void findAll() {
		// Given
		List<BienEntity> bienEntitys = new ArrayList<BienEntity>();
		BienEntity bienEntity1 = bienEntityFactoryForTest.newBienEntity();
		bienEntitys.add(bienEntity1);
		BienEntity bienEntity2 = bienEntityFactoryForTest.newBienEntity();
		bienEntitys.add(bienEntity2);
		when(bienJpaRepository.findAll()).thenReturn(bienEntitys);
		
		Bien bien1 = bienFactoryForTest.newBien();
		when(bienServiceMapper.mapBienEntityToBien(bienEntity1)).thenReturn(bien1);
		Bien bien2 = bienFactoryForTest.newBien();
		when(bienServiceMapper.mapBienEntityToBien(bienEntity2)).thenReturn(bien2);

		// When
		List<Bien> biensFounds = bienService.findAll();

		// Then
		assertTrue(bien1 == biensFounds.get(0));
		assertTrue(bien2 == biensFounds.get(1));
	}

	@Test
	public void create() {
		// Given
		Bien bien = bienFactoryForTest.newBien();

		BienEntity bienEntity = bienEntityFactoryForTest.newBienEntity();
		when(bienJpaRepository.findOne(bien.getId())).thenReturn(null);
		
		bienEntity = new BienEntity();
		bienServiceMapper.mapBienToBienEntity(bien, bienEntity);
		BienEntity bienEntitySaved = bienJpaRepository.save(bienEntity);
		
		Bien bienSaved = bienFactoryForTest.newBien();
		when(bienServiceMapper.mapBienEntityToBien(bienEntitySaved)).thenReturn(bienSaved);

		// When
		Bien bienResult = bienService.create(bien);

		// Then
		assertTrue(bienResult == bienSaved);
	}

	@Test
	public void createKOExists() {
		// Given
		Bien bien = bienFactoryForTest.newBien();

		BienEntity bienEntity = bienEntityFactoryForTest.newBienEntity();
		when(bienJpaRepository.findOne(bien.getId())).thenReturn(bienEntity);

		// When
		Exception exception = null;
		try {
			bienService.create(bien);
		} catch(Exception e) {
			exception = e;
		}

		// Then
		assertTrue(exception instanceof IllegalStateException);
		assertEquals("already.exists", exception.getMessage());
	}

	@Test
	public void update() {
		// Given
		Bien bien = bienFactoryForTest.newBien();

		BienEntity bienEntity = bienEntityFactoryForTest.newBienEntity();
		when(bienJpaRepository.findOne(bien.getId())).thenReturn(bienEntity);
		
		BienEntity bienEntitySaved = bienEntityFactoryForTest.newBienEntity();
		when(bienJpaRepository.save(bienEntity)).thenReturn(bienEntitySaved);
		
		Bien bienSaved = bienFactoryForTest.newBien();
		when(bienServiceMapper.mapBienEntityToBien(bienEntitySaved)).thenReturn(bienSaved);

		// When
		Bien bienResult = bienService.update(bien);

		// Then
		verify(bienServiceMapper).mapBienToBienEntity(bien, bienEntity);
		assertTrue(bienResult == bienSaved);
	}

	@Test
	public void delete() {
		// Given
		Integer id = mockValues.nextInteger();

		// When
		bienService.delete(id);

		// Then
		verify(bienJpaRepository).delete(id);
		
	}
	
	@Test
	@Ignore
	public void CountLibreByProjet() {
		Long projet = 5l;
		Long i =bienService.CountLibreByProjet(projet);
		System.out.println(i);
		//Assert.assertNotSame((Integer) 94, i);
		
		
	}

}
