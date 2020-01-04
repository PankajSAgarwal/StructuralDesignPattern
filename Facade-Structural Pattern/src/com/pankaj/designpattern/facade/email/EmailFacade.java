package com.pankaj.designpattern.facade.email;

import com.pankaj.designpattern.facade.Order;
import com.pankaj.designpattern.facade.email.Template.TemplateType;

// facade provides simple methods for client to use
public class EmailFacade {

	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		
		Email email = Email.getBuilder()
						.withTemplate(template)
						.withStationary(stationary)
						.forObject(order)
						.build();
		
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
