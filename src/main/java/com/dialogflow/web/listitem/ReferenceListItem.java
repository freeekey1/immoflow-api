/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.listitem;

import com.dialogflow.bean.Reference;
import com.dialogflow.web.common.ListItem;

public class ReferenceListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public ReferenceListItem(Reference reference) {
		super();

		this.value = ""
			 + reference.getId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = reference.toString();
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