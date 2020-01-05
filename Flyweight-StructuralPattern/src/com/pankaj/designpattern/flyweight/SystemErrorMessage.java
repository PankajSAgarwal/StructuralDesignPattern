package com.pankaj.designpattern.flyweight;

// A concrete flyweight . Instance is shared. 
public class SystemErrorMessage implements ErrorMessage {
	
	// some error message $errorCode
	private String messageTemplate;
	
	//http://somedomain.com/help?error=
	private String helpUrlBase;
	
	
	public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
		super();
		this.messageTemplate = messageTemplate;
		this.helpUrlBase = helpUrlBase;
	}

	public String getMessageTemplate() {
		return messageTemplate;
	}

	public void setMessageTemplate(String messageTemplate) {
		this.messageTemplate = messageTemplate;
	}

	public String getHelpUrlBase() {
		return helpUrlBase;
	}

	public void setHelpUrlBase(String helpUrlBase) {
		this.helpUrlBase = helpUrlBase;
	}

	

	@Override
	public String getText(String code) {
		// TODO Auto-generated method stub
		return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
	}

}
