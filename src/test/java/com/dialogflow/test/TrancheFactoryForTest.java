package com.dialogflow.test;

import com.dialogflow.bean.Tranche;

public class TrancheFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Tranche newTranche() {

		Integer id = mockValues.nextInteger();

		Tranche tranche = new Tranche();
		tranche.setId(id);
		return tranche;
	}
	
}
