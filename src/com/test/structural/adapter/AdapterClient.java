package com.test.structural.adapter;

public class AdapterClient {
	public static void main(String[] args) {
		EmployeeAdapter adapter = new EmployeeAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		String card = businessCardDesigner.designCard(adapter);
		System.out.println(card);
	}
	
	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Aditya Sethy");
		employee.setJobTitle("Scientist");
		employee.setOfficeLocation("Plano, TX");
	}
}
