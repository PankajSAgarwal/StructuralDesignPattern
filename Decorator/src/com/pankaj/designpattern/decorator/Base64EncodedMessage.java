package com.pankaj.designpattern.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {
	
	private Message msg;
	

	public Base64EncodedMessage(Message msg) {
		super();
		this.msg = msg;
	}


	@Override
	public String getContent() {
		
		// Be wary of charset!! This is platform dependent
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}

}
