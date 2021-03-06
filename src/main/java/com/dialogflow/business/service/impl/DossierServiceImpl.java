/*
 * Created on 16 janv. 2018 ( Time 22:12:13 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.dialogflow.bean.Dossier;
import com.dialogflow.bean.jpa.DossierEntity;
import com.dialogflow.business.service.DossierService;
import com.dialogflow.business.service.mapping.DossierServiceMapper;
import com.dialogflow.data.repository.jpa.DossierJpaRepository;
import com.dialogflow.object.VenteObject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of DossierService
 */
@Component
@Transactional
public class DossierServiceImpl implements DossierService {

	@Resource
	private DossierJpaRepository dossierJpaRepository;

	@Resource
	private DossierServiceMapper dossierServiceMapper;
	
	@Override
	public Dossier findById(Integer id) {
		DossierEntity dossierEntity = dossierJpaRepository.findOne(id);
		return dossierServiceMapper.mapDossierEntityToDossier(dossierEntity);
	}

	@Override
	public List<Dossier> findAll() {
		Iterable<DossierEntity> entities = dossierJpaRepository.findAll();
		List<Dossier> beans = new ArrayList<Dossier>();
		for(DossierEntity dossierEntity : entities) {
			beans.add(dossierServiceMapper.mapDossierEntityToDossier(dossierEntity));
		}
		return beans;
	}

	@Override
	public Dossier save(Dossier dossier) {
		return update(dossier) ;
	}

	@Override
	public Dossier create(Dossier dossier) {
		DossierEntity dossierEntity = dossierJpaRepository.findOne(dossier.getId());
		if( dossierEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		dossierEntity = new DossierEntity();
		dossierServiceMapper.mapDossierToDossierEntity(dossier, dossierEntity);
		DossierEntity dossierEntitySaved = dossierJpaRepository.save(dossierEntity);
		return dossierServiceMapper.mapDossierEntityToDossier(dossierEntitySaved);
	}

	@Override
	public Dossier update(Dossier dossier) {
		DossierEntity dossierEntity = dossierJpaRepository.findOne(dossier.getId());
		dossierServiceMapper.mapDossierToDossierEntity(dossier, dossierEntity);
		DossierEntity dossierEntitySaved = dossierJpaRepository.save(dossierEntity);
		return dossierServiceMapper.mapDossierEntityToDossier(dossierEntitySaved);
	}

	@Override
	public void delete(Integer id) {
		dossierJpaRepository.delete(id);
	}

	public DossierJpaRepository getDossierJpaRepository() {
		return dossierJpaRepository;
	}

	public void setDossierJpaRepository(DossierJpaRepository dossierJpaRepository) {
		this.dossierJpaRepository = dossierJpaRepository;
	}

	public DossierServiceMapper getDossierServiceMapper() {
		return dossierServiceMapper;
	}

	public void setDossierServiceMapper(DossierServiceMapper dossierServiceMapper) {
		this.dossierServiceMapper = dossierServiceMapper;
	}

	@Override
	public VenteObject ventesParProjet(Long projet) {
		VenteObject vo = new VenteObject();
		Object[] bean =  dossierJpaRepository.ventesParProjet(projet);
		if(bean != null) {
			vo.setNombreVente(((BigDecimal)bean[0]).longValue());
			vo.setId(((BigDecimal)bean[2]).longValue());
			vo.setChiffreAffaire(((BigDecimal)bean[3]).longValue());
		}
		return vo;
	}

}
