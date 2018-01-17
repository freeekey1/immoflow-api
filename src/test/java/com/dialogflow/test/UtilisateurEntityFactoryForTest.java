package com.dialogflow.test;

import com.dialogflow.bean.jpa.UtilisateurEntity;

public class UtilisateurEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public UtilisateurEntity newUtilisateurEntity() {

		Integer id = mockValues.nextInteger();

		UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
		utilisateurEntity.setId(id);
		return utilisateurEntity;
	}
	
}
