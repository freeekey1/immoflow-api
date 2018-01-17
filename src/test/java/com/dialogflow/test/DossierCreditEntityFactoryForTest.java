package com.dialogflow.test;

import com.dialogflow.bean.jpa.DossierCreditEntity;

public class DossierCreditEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public DossierCreditEntity newDossierCreditEntity() {

		Integer id = mockValues.nextInteger();

		DossierCreditEntity dossierCreditEntity = new DossierCreditEntity();
		dossierCreditEntity.setId(id);
		return dossierCreditEntity;
	}
	
}
