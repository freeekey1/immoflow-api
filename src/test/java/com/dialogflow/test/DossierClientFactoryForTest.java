package com.dialogflow.test;

import com.dialogflow.bean.DossierClient;

public class DossierClientFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public DossierClient newDossierClient() {

		Integer id = mockValues.nextInteger();

		DossierClient dossierClient = new DossierClient();
		dossierClient.setId(id);
		return dossierClient;
	}
	
}
