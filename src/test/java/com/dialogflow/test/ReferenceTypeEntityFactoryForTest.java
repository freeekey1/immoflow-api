package com.dialogflow.test;

import com.dialogflow.bean.jpa.ReferenceTypeEntity;

public class ReferenceTypeEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ReferenceTypeEntity newReferenceTypeEntity() {

		Integer id = mockValues.nextInteger();

		ReferenceTypeEntity referenceTypeEntity = new ReferenceTypeEntity();
		referenceTypeEntity.setId(id);
		return referenceTypeEntity;
	}
	
}
