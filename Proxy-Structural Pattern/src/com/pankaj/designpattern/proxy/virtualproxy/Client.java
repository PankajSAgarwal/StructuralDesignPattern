package com.pankaj.designpattern.proxy.virtualproxy;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {
		
		Image img = ImageFactory.getImage("A1.bmp");
		
		img.setLocation(new Point2D(10, 10));
		
		// This provided by proxy
		System.out.println("Image Location :" + img.getLocation());
		
		System.out.println("Rendering image now....");
		
		// This rendered by real object 
		img.render();

	}

}
