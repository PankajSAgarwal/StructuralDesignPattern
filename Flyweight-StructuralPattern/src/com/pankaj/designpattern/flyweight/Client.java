package com.pankaj.designpattern.flyweight;

import com.pankaj.designpattern.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstace().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4506"));
		
		UserBannedErrorMessage msg2 = new UserBannedErrorMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
