package com.pankaj.designpattern.bridge;

// A refined abstraction
public class Queue<T> implements FifoCollection<T>{
	
	private LinkedList<T> list;
	
	

	public Queue(LinkedList<T> list) {
		super();
		this.list = list;
	}



	@Override
	public void offer(T element) {
		list.addLast(element);
		
	}



	@Override
	public T poll() {
		
		return list.removeFirst();
	}

	
	
	

	
}
