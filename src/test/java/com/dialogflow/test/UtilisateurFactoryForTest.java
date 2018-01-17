package com.dialogflow.test;

import com.dialogflow.bean.Utilisateur;

public class UtilisateurFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Utilisateur newUtilisateur() {

		Integer id = mockValues.nextInteger();

		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(id);
		return utilisateur;
	}
	
}
