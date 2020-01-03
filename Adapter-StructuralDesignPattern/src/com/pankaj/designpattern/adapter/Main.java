package com.pankaj.designpattern.adapter;

public class Main {

	public static void main(String[] args) {
		
		/** Using Class/two-way adapter **/
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		/*
		 * populateEmployeeData expects an Adaptee but we passed on a adapter
		 * thats why class adapter is called a two way adapter as well
		 */
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		
		System.out.println("**************************************************************************************************");
		
		/** Using object adapter **/
		
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectadapter = new EmployeeObjectAdapter(employee);
		card = designer.designCard(objectadapter);
		System.out.println(card);
		

	}
	
	public static void populateEmployeeData(Employee employee) {
		employee.setFullName("Pankaj Agarwal");
		employee.setJobTitle("Soultion Architect");
		employee.setOfficeLocation("XYZ");
	}

}
