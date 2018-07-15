
public class Telephone {
	
	private int areaCode;
	private int localNumber;
	
	public Telephone(int area, int local){
		areaCode = area;
		localNumber = local;
	}
	
	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int area){
		if (area >= 111 & area <= 999) {
			areaCode = area;
		}
	}

	public int getLocalNumber(){
		return localNumber;
	}

	public void setLocalNumber(int local){
		if (local >= 1111111 && local <= 9999999){
			localNumber = local;
		}
	}

	public String toString() {
		String result;
		result = "(" + areaCode + ") " + localNumber;
		return result;
	}
}
