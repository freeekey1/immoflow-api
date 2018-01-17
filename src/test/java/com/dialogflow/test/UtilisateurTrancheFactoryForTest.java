package com.dialogflow.test;

import com.dialogflow.bean.UtilisateurTranche;

public class UtilisateurTrancheFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public UtilisateurTranche newUtilisateurTranche() {

		Integer id = mockValues.nextInteger();

		UtilisateurTranche utilisateurTranche = new UtilisateurTranche();
		utilisateurTranche.setId(id);
		return utilisateurTranche;
	}
	
}
