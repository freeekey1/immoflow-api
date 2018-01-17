package com.dialogflow.test;

import com.dialogflow.bean.Bien;

public class BienFactoryForTest {

	private MockValues mockValues = new MockValues();
	
	public Bien newBien() {

		Integer id = mockValues.nextInteger();

		Bien bien = new Bien();
		bien.setId(id);
		return bien;
	}
	
}
