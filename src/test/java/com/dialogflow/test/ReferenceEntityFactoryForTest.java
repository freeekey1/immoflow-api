package com.dialogflow.test;

import com.dialogflow.bean.jpa.ReferenceEntity;

public class ReferenceEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ReferenceEntity newReferenceEntity() {

		Integer id = mockValues.nextInteger();

		ReferenceEntity referenceEntity = new ReferenceEntity();
		referenceEntity.setId(id);
		return referenceEntity;
	}
	
}
