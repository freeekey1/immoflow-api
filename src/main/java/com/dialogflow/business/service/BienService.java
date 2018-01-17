/*
 * Created on 16 janv. 2018 ( Time 22:40:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.Bien;

/**
 * Business Service Interface for entity Bien.
 */
public interface BienService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Bien findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Bien> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Bien save(Bien entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Bien update(Bien entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Bien create(Bien entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );

	Long CountLibreByProjet(Long projet);

}