/*
 * Created on 16 janv. 2018 ( Time 22:40:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.listitem;

import com.dialogflow.bean.DossierClient;
import com.dialogflow.web.common.ListItem;

public class DossierClientListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public DossierClientListItem(DossierClient dossierClient) {
		super();

		this.value = ""
			 + dossierClient.getId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = dossierClient.toString();
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getLabel() {
		return label;
	}

}
