package com.pankaj.designpattern.bridge;

/*
 * This is the abstraction
 * It represents a First In First Out Collection
 */
public interface FifoCollection<T> {
	
	//Adds element to the collection
	void offer(T element);
	
	//Removes and returns first element from the collection
	T poll();

}
