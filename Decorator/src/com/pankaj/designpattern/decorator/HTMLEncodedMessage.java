package com.pankaj.designpattern.decorator;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

// Decorator : Implements component interface
@SuppressWarnings("deprecation")
public class HTMLEncodedMessage implements Message {
	
	private Message msg;
	
	
	public HTMLEncodedMessage(Message msg) {
		super();
		this.msg = msg;
	}


	@SuppressWarnings("deprecation")
	@Override
	public String getContent() {
		
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

}
