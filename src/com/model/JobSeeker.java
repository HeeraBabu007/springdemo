package com.model;

public class JobSeeker {
	private int js_id;
	private String name;
	
	
	
	public JobSeeker() {
		System.out.println("New Object creating by Application*");
	}
	public int getJs_id() {
		return js_id;
	}
	public void setJs_id(int js_id) {
		this.js_id = js_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void diplay()
	{
		System.out.println("*****Displaying Job Seeker info******");
		System.out.println("Name of Job Seeker: "+this.getName()+" and Id: "+this.getJs_id());
	}
}
