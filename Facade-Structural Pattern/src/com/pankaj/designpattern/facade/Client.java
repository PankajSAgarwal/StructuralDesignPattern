package com.pankaj.designpattern.facade;

import com.pankaj.designpattern.facade.email.EmailFacade;
// Below imports needed when using without facade
//import com.pankaj.designpattern.facade.email.Email;
//import com.pankaj.designpattern.facade.email.EmailFacade;
//import com.pankaj.designpattern.facade.email.Mailer;
//import com.pankaj.designpattern.facade.email.Stationary;
//import com.pankaj.designpattern.facade.email.StationaryFactory;
//import com.pankaj.designpattern.facade.email.Template;
//import com.pankaj.designpattern.facade.email.Template.TemplateType;
//import com.pankaj.designpattern.facade.email.TemplateFactory;

public class Client {

	public static void main(String[] args) {
		
		Order order = new Order("101", 99.99);
		
		EmailFacade facade = new EmailFacade();
		
		// With facade
		
		boolean result = facade.sendOrderEmail(order);
		
		// Without facade
		//boolean result = sendOrderEmailWithoutFacade(order);
		
		System.out.println("Order Email " +(result? "sent!":"NOT sent..."));
		
	}
	
//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		
//		Email email = Email.getBuilder()
//						.withTemplate(template)
//						.withStationary(stationary)
//						.forObject(order)
//						.build();
//		
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}

}
