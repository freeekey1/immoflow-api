package com.dialogflow.test;

import com.dialogflow.bean.jpa.DossierClientEntity;

public class DossierClientEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public DossierClientEntity newDossierClientEntity() {

		Integer id = mockValues.nextInteger();

		DossierClientEntity dossierClientEntity = new DossierClientEntity();
		dossierClientEntity.setId(id);
		return dossierClientEntity;
	}
	
}
