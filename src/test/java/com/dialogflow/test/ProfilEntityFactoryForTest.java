package com.dialogflow.test;

import com.dialogflow.bean.jpa.ProfilEntity;

public class ProfilEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ProfilEntity newProfilEntity() {

		Integer id = mockValues.nextInteger();

		ProfilEntity profilEntity = new ProfilEntity();
		profilEntity.setId(id);
		return profilEntity;
	}
	
}
