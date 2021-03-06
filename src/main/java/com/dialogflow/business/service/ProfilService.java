/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.business.service;

import java.util.List;

import com.dialogflow.bean.Profil;

/**
 * Business Service Interface for entity Profil.
 */
public interface ProfilService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Profil findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Profil> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Profil save(Profil entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Profil update(Profil entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Profil create(Profil entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}
