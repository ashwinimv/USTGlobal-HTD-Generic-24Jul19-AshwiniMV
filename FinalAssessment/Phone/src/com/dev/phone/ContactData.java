package com.dev.phone;

import java.util.Scanner;

public class ContactData {
	static Scanner sc=new Scanner(System.in);
	
	public static void display() {
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact");
		System.out.println("Press 3 to opearte  on contact");
		int value=sc.nextInt();
		switch(value) {
		case 1:ContactFun.showContacts();
				break;
		case 2:ContactFun.search();
				break;
		case 3:ContactFun.opearte();
				break;
		default:System.out.println("invalid input");
		}
	
	}
	
	public static void main(String[] args) {
		display();
	}

}
