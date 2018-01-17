package com.dialogflow.test;

import com.dialogflow.bean.Profil;

public class ProfilFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Profil newProfil() {

		Integer id = mockValues.nextInteger();

		Profil profil = new Profil();
		profil.setId(id);
		return profil;
	}
	
}
