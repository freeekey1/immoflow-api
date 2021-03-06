/*
 * Created on 16 janv. 2018 ( Time 22:40:45 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.listitem;

import com.dialogflow.bean.UtilisateurTranche;
import com.dialogflow.web.common.ListItem;

public class UtilisateurTrancheListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public UtilisateurTrancheListItem(UtilisateurTranche utilisateurTranche) {
		super();

		this.value = ""
			 + utilisateurTranche.getId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = utilisateurTranche.toString();
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
