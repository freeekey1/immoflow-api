package com.dialogflow.test;

import com.dialogflow.bean.DossierCredit;

public class DossierCreditFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public DossierCredit newDossierCredit() {

		Integer id = mockValues.nextInteger();

		DossierCredit dossierCredit = new DossierCredit();
		dossierCredit.setId(id);
		return dossierCredit;
	}
	
}
