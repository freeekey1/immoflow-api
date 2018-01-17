package com.dialogflow.test;

import com.dialogflow.bean.jpa.EcheanceEntity;

public class EcheanceEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public EcheanceEntity newEcheanceEntity() {

		Integer id = mockValues.nextInteger();

		EcheanceEntity echeanceEntity = new EcheanceEntity();
		echeanceEntity.setId(id);
		return echeanceEntity;
	}
	
}
