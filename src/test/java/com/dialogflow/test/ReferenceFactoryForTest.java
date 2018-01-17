package com.dialogflow.test;

import com.dialogflow.bean.Reference;

public class ReferenceFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Reference newReference() {

		Integer id = mockValues.nextInteger();

		Reference reference = new Reference();
		reference.setId(id);
		return reference;
	}
	
}
