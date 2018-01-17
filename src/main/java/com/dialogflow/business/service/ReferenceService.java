/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.Reference;

/**
 * Business Service Interface for entity Reference.
 */
public interface ReferenceService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Reference findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Reference> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Reference save(Reference entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Reference update(Reference entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Reference create(Reference entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}