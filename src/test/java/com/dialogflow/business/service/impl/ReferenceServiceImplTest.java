/*
 * Created on 16 janv. 2018 ( Time 22:12:14 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.dialogflow.bean.Reference;
import com.dialogflow.bean.jpa.ReferenceEntity;
import java.util.List;
import com.dialogflow.business.service.mapping.ReferenceServiceMapper;
import com.dialogflow.data.repository.jpa.ReferenceJpaRepository;
import com.dialogflow.test.ReferenceFactoryForTest;
import com.dialogflow.test.ReferenceEntityFactoryForTest;
import com.dialogflow.test.MockValues;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Test : Implementation of ReferenceService
 */
@RunWith(MockitoJUnitRunner.class)
public class ReferenceServiceImplTest {

	@InjectMocks
	private ReferenceServiceImpl referenceService;
	@Mock
	private ReferenceJpaRepository referenceJpaRepository;
	@Mock
	private ReferenceServiceMapper referenceServiceMapper;
	
	private ReferenceFactoryForTest referenceFactoryForTest = new ReferenceFactoryForTest();

	private ReferenceEntityFactoryForTest referenceEntityFactoryForTest = new ReferenceEntityFactoryForTest();

	private MockValues mockValues = new MockValues();
	
	@Test
	public void findById() {
		// Given
		Integer id = mockValues.nextInteger();
		
		ReferenceEntity referenceEntity = referenceJpaRepository.findOne(id);
		
		Reference reference = referenceFactoryForTest.newReference();
		when(referenceServiceMapper.mapReferenceEntityToReference(referenceEntity)).thenReturn(reference);

		// When
		Reference referenceFound = referenceService.findById(id);

		// Then
		assertEquals(reference.getId(),referenceFound.getId());
	}

	@Test
	public void findAll() {
		// Given
		List<ReferenceEntity> referenceEntitys = new ArrayList<ReferenceEntity>();
		ReferenceEntity referenceEntity1 = referenceEntityFactoryForTest.newReferenceEntity();
		referenceEntitys.add(referenceEntity1);
		ReferenceEntity referenceEntity2 = referenceEntityFactoryForTest.newReferenceEntity();
		referenceEntitys.add(referenceEntity2);
		when(referenceJpaRepository.findAll()).thenReturn(referenceEntitys);
		
		Reference reference1 = referenceFactoryForTest.newReference();
		when(referenceServiceMapper.mapReferenceEntityToReference(referenceEntity1)).thenReturn(reference1);
		Reference reference2 = referenceFactoryForTest.newReference();
		when(referenceServiceMapper.mapReferenceEntityToReference(referenceEntity2)).thenReturn(reference2);

		// When
		List<Reference> referencesFounds = referenceService.findAll();

		// Then
		assertTrue(reference1 == referencesFounds.get(0));
		assertTrue(reference2 == referencesFounds.get(1));
	}

	@Test
	public void create() {
		// Given
		Reference reference = referenceFactoryForTest.newReference();

		ReferenceEntity referenceEntity = referenceEntityFactoryForTest.newReferenceEntity();
		when(referenceJpaRepository.findOne(reference.getId())).thenReturn(null);
		
		referenceEntity = new ReferenceEntity();
		referenceServiceMapper.mapReferenceToReferenceEntity(reference, referenceEntity);
		ReferenceEntity referenceEntitySaved = referenceJpaRepository.save(referenceEntity);
		
		Reference referenceSaved = referenceFactoryForTest.newReference();
		when(referenceServiceMapper.mapReferenceEntityToReference(referenceEntitySaved)).thenReturn(referenceSaved);

		// When
		Reference referenceResult = referenceService.create(reference);

		// Then
		assertTrue(referenceResult == referenceSaved);
	}

	@Test
	public void createKOExists() {
		// Given
		Reference reference = referenceFactoryForTest.newReference();

		ReferenceEntity referenceEntity = referenceEntityFactoryForTest.newReferenceEntity();
		when(referenceJpaRepository.findOne(reference.getId())).thenReturn(referenceEntity);

		// When
		Exception exception = null;
		try {
			referenceService.create(reference);
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
		Reference reference = referenceFactoryForTest.newReference();

		ReferenceEntity referenceEntity = referenceEntityFactoryForTest.newReferenceEntity();
		when(referenceJpaRepository.findOne(reference.getId())).thenReturn(referenceEntity);
		
		ReferenceEntity referenceEntitySaved = referenceEntityFactoryForTest.newReferenceEntity();
		when(referenceJpaRepository.save(referenceEntity)).thenReturn(referenceEntitySaved);
		
		Reference referenceSaved = referenceFactoryForTest.newReference();
		when(referenceServiceMapper.mapReferenceEntityToReference(referenceEntitySaved)).thenReturn(referenceSaved);

		// When
		Reference referenceResult = referenceService.update(reference);

		// Then
		verify(referenceServiceMapper).mapReferenceToReferenceEntity(reference, referenceEntity);
		assertTrue(referenceResult == referenceSaved);
	}

	@Test
	public void delete() {
		// Given
		Integer id = mockValues.nextInteger();

		// When
		referenceService.delete(id);

		// Then
		verify(referenceJpaRepository).delete(id);
		
	}

}