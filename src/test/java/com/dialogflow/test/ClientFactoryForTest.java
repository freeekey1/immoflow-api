package com.dialogflow.test;

import com.dialogflow.bean.Client;

public class ClientFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Client newClient() {

		Integer id = mockValues.nextInteger();

		Client client = new Client();
		client.setId(id);
		return client;
	}
	
}
