package com.pankaj.designpattern.proxy.virtualproxy;
import javafx.geometry.Point2D;

// Interface implemented by proxy and concrete class
public interface Image {
	
	void setLocation(Point2D point2D);
	
	Point2D getLocation();
	
	void render();

}
