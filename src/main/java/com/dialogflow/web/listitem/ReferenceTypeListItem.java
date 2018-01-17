/*
 * Created on 16 janv. 2018 ( Time 22:40:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.listitem;

import com.dialogflow.bean.ReferenceType;
import com.dialogflow.web.common.ListItem;

public class ReferenceTypeListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public ReferenceTypeListItem(ReferenceType referenceType) {
		super();

		this.value = ""
			 + referenceType.getId()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = referenceType.toString();
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
