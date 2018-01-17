package com.dialogflow.test;

import com.dialogflow.bean.Echeance;

public class EcheanceFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Echeance newEcheance() {

		Integer id = mockValues.nextInteger();

		Echeance echeance = new Echeance();
		echeance.setId(id);
		return echeance;
	}
	
}
