package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {
	
	private String fName;
	private String lName;
	
	public PersonV2(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "PersonV2 [fName=" + fName + ", lName=" + lName + "]";
	}
	
	

}
