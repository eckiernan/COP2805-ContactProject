
public class Person {
	Address streetAddress;
	Telephone phoneNumber;
	private String firstName;
	private String lastName;
	private String emailAddress;

	public Person(Address address, String first, String last, Telephone phone, String email) {
		firstName = first;
		lastName = last;
		streetAddress = address;
		phoneNumber = phone;
		emailAddress = email;
	}

	public Address getAddress() {
		return streetAddress;
	}

	public void setAddress(int number, String name, String city, String state, int code, String country) {
		streetAddress = getAddress();
	}

	public Telephone getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int area, int local) {
		phoneNumber = getPhoneNumber();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		lastName = last;
	}

	public String getEmail() {
		return emailAddress;
	}

	public void setEmail(String email) {
		emailAddress = email;
	}

	public String toString() {
		String result;
		result = firstName + " " + lastName + "\n" + streetAddress + " \n" + phoneNumber + "\n" + emailAddress;
		return result;
	}

	static int contactsCreated = 0;
	static String toString;

}
