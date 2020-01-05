package com.pankaj.designpattern.dynamicproxy;

import java.lang.reflect.Proxy;

// Factory to get image objects
public class ImageFactory {
	
	// We will provide proxy to caller instead of real objects
	
	public static Image getImage(String name) {
		
		return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(name));
		
	}

}
