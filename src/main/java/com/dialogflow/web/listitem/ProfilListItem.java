/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.listitem;

import com.dialogflow.bean.Profil;
import com.dialogflow.web.common.ListItem;

public class ProfilListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public ProfilListItem(Profil profil) {
		super();

		this.value = ""
			 + profil.getId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = profil.toString();
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
