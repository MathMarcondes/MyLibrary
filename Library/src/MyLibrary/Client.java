package MyLibrary;

public class Client extends Library {
	private String name;
	private String birthdate;
	private String address;
	private String phone;
	private int id;
	
	public Client(String name, String birthdate, String address, String phone, int id) {
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.phone = phone;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void Client() {
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Birthdate: " + getBirthdate());
		System.out.println("Phone: " + getPhone());
	}
	
	
	
}
