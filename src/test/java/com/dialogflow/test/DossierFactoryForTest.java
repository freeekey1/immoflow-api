package com.dialogflow.test;

import com.dialogflow.bean.Dossier;

public class DossierFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Dossier newDossier() {

		Integer id = mockValues.nextInteger();

		Dossier dossier = new Dossier();
		dossier.setId(id);
		return dossier;
	}
	
}
