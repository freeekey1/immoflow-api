/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.ReferenceType;

/**
 * Business Service Interface for entity ReferenceType.
 */
public interface ReferenceTypeService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	ReferenceType findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<ReferenceType> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	ReferenceType save(ReferenceType entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	ReferenceType update(ReferenceType entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	ReferenceType create(ReferenceType entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}
