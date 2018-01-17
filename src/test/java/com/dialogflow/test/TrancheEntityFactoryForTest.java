package com.dialogflow.test;

import com.dialogflow.bean.jpa.TrancheEntity;

public class TrancheEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public TrancheEntity newTrancheEntity() {

		Integer id = mockValues.nextInteger();

		TrancheEntity trancheEntity = new TrancheEntity();
		trancheEntity.setId(id);
		return trancheEntity;
	}
	
}
