package com.dialogflow.test;

import com.dialogflow.bean.jpa.ProjetEntity;

public class ProjetEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ProjetEntity newProjetEntity() {

		Integer id = mockValues.nextInteger();

		ProjetEntity projetEntity = new ProjetEntity();
		projetEntity.setId(id);
		return projetEntity;
	}
	
}
