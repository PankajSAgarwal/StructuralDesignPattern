package com.pankaj.designpattern.facade.email;

public class OrderEmailTemplate extends Template {

	@Override
	public String format(Object object) {
		
		return "TEMPLATE";
	}

}
