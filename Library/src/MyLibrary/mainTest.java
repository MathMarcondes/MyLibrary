package MyLibrary;
import java.util.Scanner;

public class mainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Birthdate: ");
		String birthdate = sc.next();
		System.out.println("Address: ");
		String address = sc.next();
		System.out.println("Phone: ");
		String phone = sc.next();
		System.out.println("Id: ");
		int id = sc.nextInt();
		
		Client c = new Client(name, birthdate, address, phone, id);
		
		
			}
}
