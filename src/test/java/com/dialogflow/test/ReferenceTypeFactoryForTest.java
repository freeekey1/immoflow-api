package com.dialogflow.test;

import com.dialogflow.bean.ReferenceType;

public class ReferenceTypeFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ReferenceType newReferenceType() {

		Integer id = mockValues.nextInteger();

		ReferenceType referenceType = new ReferenceType();
		referenceType.setId(id);
		return referenceType;
	}
	
}
