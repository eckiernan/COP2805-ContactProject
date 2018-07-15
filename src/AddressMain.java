
public class AddressMain {

	public static void main(String[] args) {
		Address tampa = new Address (1101, "West Sligh Ave.", "Tampa", "Florida", 33604, "United States");
		Address sanDiego = new Address (2920, "Zoo Dr.", "San Diego", "California", 92101, "United States");
		Address cincinnati = new Address (3400, "Vine St.", "Cincinnati", "Ohio", 45220, "United States");
		Address washington = new Address (3001, "Connecticut Ave. NW,", "Washington", "DC", 20008, "United States");
		
		System.out.println("1. " + tampa.toString());
		System.out.println("2. " + sanDiego.toString());
		System.out.println("3. " + cincinnati.toString());
		System.out.println("4. " + washington.toString());

	}

}
