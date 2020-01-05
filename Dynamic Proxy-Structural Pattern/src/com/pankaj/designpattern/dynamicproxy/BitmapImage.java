package com.pankaj.designpattern.dynamicproxy;

import javafx.geometry.Point2D;

// Concrete class providing the actual functionality
public class BitmapImage implements Image {

	private Point2D location;
	private String name;
	
	public BitmapImage(String fileName) {
		
		// Loads image from file on disk
		
		System.out.println("Loaded from disk :" + fileName);
		this.name =  fileName;
	}
	
	@Override
	public void setLocation(Point2D point2d) {
		location = point2d;

	}

	@Override
	public Point2D getLocation() {
		
		return location;
	}

	@Override
	public void render() {
		// renders to the screen
		
		System.out.println("Rendered image to the screen " + this.name);

	}

}
