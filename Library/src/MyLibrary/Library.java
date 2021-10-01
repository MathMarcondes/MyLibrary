package MyLibrary;

import java.util.Date;
import java.util.Scanner;

public class Library {
	private Date String;
	
	
	protected void registerClient(String name, String birthdate, String adress, int phone) {
		this.updateClienteName(name, phone);
		this.updateClientBirthdate(phone, birthdate);
		this.updateClientAdress(phone, adress);
		this.updateClientPhone(phone, adress);
	}
	
	protected void updateClienteName(String name, int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, put your name and id: ");
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Id: ");
		id = sc.nextInt();
	}
	protected void updateClientAdress(int id, String address) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please to update the Client Adress put your id: ");
		id = sc.nextInt();
		System.out.print("Address: ");
		address = sc.next();
	}
	protected void updateClientPhone(int id, String phone) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Update Client Phone put ID: ");
		id = sc.nextInt();
		System.out.print("Phone: ");
		phone = sc.next();
	}
	protected void updateClientBirthdate(int id, String birthdate) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To update client Birthdate put your id: ");
		id = sc.hashCode();
		System.out.println("Your birthdate: ");
		birthdate = sc.next();
	}
	protected void getBorrowings() {
		
	}
	protected void getBorrowings(int Client) {
		
	}
	protected void borrow(int Client, int item) {
		
	}
	protected void borrow(int Client, int item[]) {
		
	}

	public Date getString() {
		return String;
	}

	public void setString(Date string) {
		String = string;
	}
}	
