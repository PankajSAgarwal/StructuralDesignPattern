package com.pankaj.designpattern.proxy.virtualproxy;

import javafx.geometry.Point2D;

// Proxy Class . static proxy


public class ImageProxy implements Image{
	
	private String name;
	private BitmapImage image;
	private Point2D location;
	
	public ImageProxy(String name) {
		
		this.name = name;
		
	}

	@Override
	public void setLocation(Point2D point2d) {
		
		if(image != null) {
			image.setLocation(point2d);
		}else {
			location = point2d;
		}
		
	}

	@Override
	public Point2D getLocation() {
		if(image != null) {
			
			image.getLocation();
			
		}
		return location;
	}

	// This will be rendered by real object so needs an Object of Bitmap Image here
	@Override
	public void render() {
		
		if(image == null) {
			
			image = new BitmapImage(name);
			if(location != null) {
				image.setLocation(location);
			}
		}
		
		image.render();
		
	}

}
