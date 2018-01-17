/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.Recette;

/**
 * Business Service Interface for entity Recette.
 */
public interface RecetteService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Recette findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Recette> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Recette save(Recette entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Recette update(Recette entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Recette create(Recette entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}