/*
 * Created on 16 janv. 2018 ( Time 22:40:45 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.Tranche;

/**
 * Business Service Interface for entity Tranche.
 */
public interface TrancheService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Tranche findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Tranche> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Tranche save(Tranche entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Tranche update(Tranche entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Tranche create(Tranche entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}
