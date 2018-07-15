
public class Address {

	private int streetNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private int postalCode;
	private String countryName;
	
	public Address (int number, String name, String city, String state, int code, String country){
		streetNumber = number;
		streetName = name;
		cityName = city;
		stateName = state;
		postalCode = code;
		countryName = country;
	}

	public int getStreetNumber(){
		return streetNumber;
	}

	public String getStreetName(){
		return streetName;
	}
	
	public String getCityName(){
		return cityName;
	}

	public String getStateName(){
		return stateName;
	}
	
	public int getPostalCode(){
		return postalCode;
	}

	public String getCountryName(){
		return countryName;
	}

	public String toString(){
		String result;
		result = streetNumber +" " + streetName + " " + cityName + "," + " " + stateName 
				+ " " + postalCode + " "+ countryName;
		return result;
	}

}
