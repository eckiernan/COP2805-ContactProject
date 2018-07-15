
public class ClerkMain {

	public static void main(String[] args) {

		Address clerk1Address = new Address(1101, "West Sligh Ave.", "Tampa", "Florida", 33604, "United States");
		Telephone clerk1Phone = new Telephone(352, 2235078);
		Clerk clerk1 = new Clerk(clerk1Address, "Elizabeth", "Kiernan", clerk1Phone,
				"ekiernan1@mail.valenciacollege.edu", 15.00, "CR", 2);
		System.out.println(clerk1);

		Address clerk2Address = new Address(1101, "Bay Blvd.", "Tampa", "Florida", 33604, "United States");
		Telephone clerk2Phone = new Telephone(407, 6512345);
		Clerk clerk2 = new Clerk(clerk2Address, "Amy", "West", clerk2Phone, "amyadams@mail.valenciacollege.edu", 14.00,
				"CR", 1);
		System.out.println(clerk2);

		Address clerk3Address = new Address(1101, "Main Street", "Tampa", "Florida", 32801, "United States");
		Telephone clerk3Phone = new Telephone(321, 4426708);
		Clerk clerk3 = new Clerk(clerk3Address, "Theo", "James", clerk3Phone, "theojames@mail.valenciacollege.edu",
				15.00, "CR", 2);
		System.out.println(clerk3);

		if (clerk1.equals(clerk2)) {
			System.out.println("Clerk 1 and Clerk 2 are equal.");
		} else {
			System.out.println("Clerk 1 and Clerk 2 are NOT equal.");
		}

		if (clerk1.equals(clerk3)) {
			System.out.println("Clerk 1 and Clerk 3 are equal.");
		} else {
			System.out.println("Clerk 1 and Clerk 3 are NOT equal.");
		}

		if (clerk2.equals(clerk3)) {
			System.out.println("Clerk 2 and Clerk 3 are equal.");
		} else {
			System.out.println("Clerk 2 and Clerk 3 are NOT equal.");
		}
		System.out.println("\n");

		
		String string = "Pineapple";
		
		System.out.println(clerk1.getClass());
		System.out.println(clerk1Phone.getClass());
		System.out.println(string.getClass());
		
		System.out.println("\n");

		
		
		test(clerk1);
		// test(clerk2);
		// test(clerk3);
	}

	public static void test(Person clerk) {

		if (clerk instanceof Person) {
			System.out.println("Clerk 1 is instance of Person.");
		}
		if (clerk instanceof Clerk) {
			System.out.println("Clerk 1 is instance of Clerk.");
		}

		
	
	
	}

//	public static void getClass (Person clerk1){
//		System.out.println(clerk1.getClass().toString());
//	}

}
