package com.dialogflow.test;

import com.dialogflow.bean.jpa.UtilisateurTrancheEntity;

public class UtilisateurTrancheEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public UtilisateurTrancheEntity newUtilisateurTrancheEntity() {

		Integer id = mockValues.nextInteger();

		UtilisateurTrancheEntity utilisateurTrancheEntity = new UtilisateurTrancheEntity();
		utilisateurTrancheEntity.setId(id);
		return utilisateurTrancheEntity;
	}
	
}
