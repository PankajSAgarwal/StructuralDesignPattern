package com.pankaj.designpattern.decorator;

public class Client {

	public static void main(String[] args) {
		
		Message m = new TextMessage("The <FORCE> is strong with this one");
		System.out.println(m.getContent());
		
		Message decorator = new HTMLEncodedMessage(m);
		System.out.println(decorator.getContent());
		
		Message base64Decorator =  new Base64EncodedMessage(m);
		System.out.println(base64Decorator.getContent());
	}

}
