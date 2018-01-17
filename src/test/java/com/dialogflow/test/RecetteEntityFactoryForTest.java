package com.dialogflow.test;

import com.dialogflow.bean.jpa.RecetteEntity;

public class RecetteEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public RecetteEntity newRecetteEntity() {

		Integer id = mockValues.nextInteger();

		RecetteEntity recetteEntity = new RecetteEntity();
		recetteEntity.setId(id);
		return recetteEntity;
	}
	
}
