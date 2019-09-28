package com.dev.phone;

public class Contact {
	private String name;
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", group=" + group + "]";
	}
	private long number;
	private String group;
	
	public static Contact createObj() {
		Contact c = new Contact();
		return c;
	}
	
	Contact(){
	
	}
	
	Contact(String name,long number,String group){
		this.name=name;
		this.number=number;
		this.group=group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

}
