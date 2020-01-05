package com.pankaj.designpattern.dynamicproxy;

import javafx.geometry.Point2D;

//Interface implemented by proxy and concrete object
public interface Image {
	
	void setLocation(Point2D point2d);
	
	Point2D getLocation();
	
	void render();
	

}
