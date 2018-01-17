package com.dialogflow.test;

import com.dialogflow.bean.jpa.DossierEntity;

public class DossierEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public DossierEntity newDossierEntity() {

		Integer id = mockValues.nextInteger();

		DossierEntity dossierEntity = new DossierEntity();
		dossierEntity.setId(id);
		return dossierEntity;
	}
	
}
