package com.dialogflow.test;

import com.dialogflow.bean.Projet;

public class ProjetFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Projet newProjet() {

		Integer id = mockValues.nextInteger();

		Projet projet = new Projet();
		projet.setId(id.longValue());
		return projet;
	}
	
}
