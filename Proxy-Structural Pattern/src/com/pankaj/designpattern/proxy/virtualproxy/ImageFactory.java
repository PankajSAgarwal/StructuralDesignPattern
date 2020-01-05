package com.pankaj.designpattern.proxy.virtualproxy;

// Factory to get image objects

public class ImageFactory {

	// We will provide proxy to caller instead of real objects
	
	public static Image getImage(String name) {
		
		return new ImageProxy(name);
	}
	
}
