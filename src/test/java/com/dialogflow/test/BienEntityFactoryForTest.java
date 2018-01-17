package com.dialogflow.test;

import com.dialogflow.bean.jpa.BienEntity;

public class BienEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public BienEntity newBienEntity() {

		Integer id = mockValues.nextInteger();

		BienEntity bienEntity = new BienEntity();
		bienEntity.setId(id);
		return bienEntity;
	}
	
}
