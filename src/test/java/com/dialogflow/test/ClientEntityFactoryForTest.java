package com.dialogflow.test;

import com.dialogflow.bean.jpa.ClientEntity;

public class ClientEntityFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public ClientEntity newClientEntity() {

		Integer id = mockValues.nextInteger();

		ClientEntity clientEntity = new ClientEntity();
		clientEntity.setId(id);
		return clientEntity;
	}
	
}
