package com.pankaj.designpattern.adapter;

/*
 * A class adapter, works as two-way adapter
 */

public class EmployeeClassAdapter extends Employee implements Customer{

	@Override
	public String getName() {
		
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		
		return this.getOfficeLocation();
	}

}
