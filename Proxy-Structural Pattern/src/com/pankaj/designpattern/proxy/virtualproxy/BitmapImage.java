package com.pankaj.designpattern.proxy.virtualproxy;

import javafx.geometry.Point2D;

// Concrete class providing actual implemnetation

public class BitmapImage implements Image {
	
	private Point2D location;
	private String name;

	
	public BitmapImage(String fileName) {
		
		// Loads image from file on disk
		super();
		System.out.println("Loaded file from disk " + fileName);
		this.name = fileName;
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
		// Renders to screen;
		System.out.println("Rendered " + this.name);

	}

}
