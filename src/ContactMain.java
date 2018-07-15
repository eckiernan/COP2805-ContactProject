
public class ContactMain {

	public static void main(String[] args) {

		
		Address myAddress = new Address(1101, "West Sligh Ave.", "Tampa", "Florida", 33604, "United States");
		Telephone myTelephone = new Telephone(352, 2235078);
		
		Person contact1 = new Person(myAddress, "Elizabeth", "Kiernan", myTelephone, "ekiernan1@mail.valenciacollege.edu");
		
		System.out.println(contact1.toString());


	}

}
