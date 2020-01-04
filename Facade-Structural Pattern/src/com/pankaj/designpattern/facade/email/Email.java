package com.pankaj.designpattern.facade.email;

public class Email {
	
	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}

}
