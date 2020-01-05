package com.pankaj.designpattern.flyweight;

// Interface implemented by all Flyweights
public interface ErrorMessage {

	// Get error message
	String getText(String code);
}
