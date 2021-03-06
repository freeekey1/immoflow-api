/*
 * Created on 16 janv. 2018 ( Time 22:12:14 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.dialogflow.bean.Recette;
import com.dialogflow.bean.jpa.RecetteEntity;
import com.dialogflow.business.service.RecetteService;
import com.dialogflow.business.service.mapping.RecetteServiceMapper;
import com.dialogflow.data.repository.jpa.RecetteJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of RecetteService
 */
@Component
@Transactional
public class RecetteServiceImpl implements RecetteService {

	@Resource
	private RecetteJpaRepository recetteJpaRepository;

	@Resource
	private RecetteServiceMapper recetteServiceMapper;
	
	@Override
	public Recette findById(Integer id) {
		RecetteEntity recetteEntity = recetteJpaRepository.findOne(id);
		return recetteServiceMapper.mapRecetteEntityToRecette(recetteEntity);
	}

	@Override
	public List<Recette> findAll() {
		Iterable<RecetteEntity> entities = recetteJpaRepository.findAll();
		List<Recette> beans = new ArrayList<Recette>();
		for(RecetteEntity recetteEntity : entities) {
			beans.add(recetteServiceMapper.mapRecetteEntityToRecette(recetteEntity));
		}
		return beans;
	}

	@Override
	public Recette save(Recette recette) {
		return update(recette) ;
	}

	@Override
	public Recette create(Recette recette) {
		RecetteEntity recetteEntity = recetteJpaRepository.findOne(recette.getId());
		if( recetteEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		recetteEntity = new RecetteEntity();
		recetteServiceMapper.mapRecetteToRecetteEntity(recette, recetteEntity);
		RecetteEntity recetteEntitySaved = recetteJpaRepository.save(recetteEntity);
		return recetteServiceMapper.mapRecetteEntityToRecette(recetteEntitySaved);
	}

	@Override
	public Recette update(Recette recette) {
		RecetteEntity recetteEntity = recetteJpaRepository.findOne(recette.getId());
		recetteServiceMapper.mapRecetteToRecetteEntity(recette, recetteEntity);
		RecetteEntity recetteEntitySaved = recetteJpaRepository.save(recetteEntity);
		return recetteServiceMapper.mapRecetteEntityToRecette(recetteEntitySaved);
	}

	@Override
	public void delete(Integer id) {
		recetteJpaRepository.delete(id);
	}

	public RecetteJpaRepository getRecetteJpaRepository() {
		return recetteJpaRepository;
	}

	public void setRecetteJpaRepository(RecetteJpaRepository recetteJpaRepository) {
		this.recetteJpaRepository = recetteJpaRepository;
	}

	public RecetteServiceMapper getRecetteServiceMapper() {
		return recetteServiceMapper;
	}

	public void setRecetteServiceMapper(RecetteServiceMapper recetteServiceMapper) {
		this.recetteServiceMapper = recetteServiceMapper;
	}

}
