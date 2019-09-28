package com.dev.phone;

import java.util.HashMap;
import java.util.Scanner;

public class ContactFun {

	static HashMap<String,Contact> hm= new HashMap<String,Contact>();
	static Scanner sc=new Scanner(System.in);

	static Contact c = new Contact("ashwini",7348936903L,"friends");
	static Contact c1 = new Contact("bhavya",9945610987L,"family");
	static Contact c2 = new Contact("deepika",7353069533L,"school");
	static Contact c3 = new Contact("sarika",7985871235L,"college");


	public static void showContacts() {
		hm.put(c.getName(),c);
		hm.put(c1.getName(),c1);
		hm.put(c2.getName(),c2);
		hm.put(c3.getName(),c3);
		System.out.println("The contacts are = "+hm);
		ContactData.display();
	}

	public static void search() {

		System.out.println("Contact names:--");
		String name=sc.next();
		System.out.println("----------------------------------------------");
		for(Contact c:hm.values()) {
			if(c.getName().equals(name)) {
				System.out.println("name is found");
				System.out.println(hm.get(name).toString());
				call1();

			}else if(c.getName()!=name){
				System.out.println("not found");
				search();
			}
		}
	}

	public static void call1() {
		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("press 3 to go back to menu");
		int enterValue=sc.nextInt();
		switch(enterValue) {
		case 1:call();
		break;
		case 2:message();
		break;
		case 3:ContactData.display();
		break;
		default:System.out.println("Entered wrongly");
		}
	}



	public static void opearte() {
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to delete contact");
		System.out.println("Press 3 to edit contact");
		int values = sc.nextInt();
		switch(values) {
		case 1:insert();
		break;
		case 2:delete();
		break;
		case 3:update();
		break;
		default:System.out.println("invalid");

		}

	}

	public static void call() {
		long number=sc.nextLong();
		for(Contact e:hm.values()) {
			if(e.getNumber()==number) {
				System.out.println("call connected");
				break;
			}else if(e.getNumber()!=number) {
				System.out.println("invalid phonenumber");
			}
			else {
				search();
			}
		}
	}

	public static void message() {
		System.out.println("enter name");
		
		String name=sc.next();
		for(Contact c:hm.values()) {
			if(c.getName().equals(name)) {
				System.out.println("enter message");
				String message = sc.next();
				System.out.println("sending message");
				call1();
			}else if(c.getName()!=name) {
				System.out.println("enter correct name");
				message();
			}else {
				call1();
			}
		}

	}

	public static void insert() {
		String name=sc.next();
		Long number=sc.nextLong();
		String group=sc.next();
		Contact cc = Contact.createObj();
		cc.setName(name);
		cc.setNumber(number);
		cc.setGroup(group);
		System.out.println(hm.put(name, cc));
		showContacts();
		opearte();

	}
	public static void delete() {
		System.out.println("Enter name to remove data:");
		String name=sc.next();
		System.out.println(hm.remove(name));
		showContacts();
		opearte();

	}
	public static void  update() {
		System.out.println("enter name to update");
		String name=sc.next();
		long number=sc.nextLong();
		String group=sc.next();
		Contact c9 =Contact.createObj();
		System.out.println("enter name to update");
		hm.get(name);

		c9.setName(name);
		c9.setNumber(number);
		c9.setGroup(group);
		hm.put(name, c9);
		System.out.println(hm.put(name, c9));
		showContacts();
		opearte();


	}

}
