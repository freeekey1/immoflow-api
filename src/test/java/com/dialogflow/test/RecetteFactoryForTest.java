package com.dialogflow.test;

import com.dialogflow.bean.Recette;

public class RecetteFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Recette newRecette() {

		Integer id = mockValues.nextInteger();

		Recette recette = new Recette();
		recette.setId(id);
		return recette;
	}
	
}
