
public class Clerk extends Person {

	private double salary;
	private String employmentGrade;
	private int employmentGradeNumber;

	public Clerk(Address address, String first, String last, Telephone phone, String email, double salary,
			String employmentGrade, int employmentGradeNumber) {
		super(address, first, last, phone, email);
		setSalary(salary);
		setEmploymentGrade(employmentGrade);
		setEmploymentGradeNumber(employmentGradeNumber);

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Clerk)) {
			return false;
		}

		boolean result = false;

		if (this.getSalary() == ((Clerk) obj).getSalary()
				&& this.getEmploymentGrade() == ((Clerk) obj).getEmploymentGrade()
				&& this.getEmploymentGradeNumber() == ((Clerk) obj).getEmploymentGradeNumber()) {
			result = true;
		}
		return result;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmploymentGrade() {
		return employmentGrade;
	}

	public void setEmploymentGrade(String employmentGrade) {
		this.employmentGrade = employmentGrade;
	}

	public int getEmploymentGradeNumber() {
		return employmentGradeNumber;
	}

	public void setEmploymentGradeNumber(int employmentGradeNumber) {
		this.employmentGradeNumber = employmentGradeNumber;
	}

	public String toString() {
		String result;

		result = super.toString() + "\nSalary: $" + salary + "\nEmploymentGrade: " + employmentGrade + "-"
				+ employmentGradeNumber + "\n";

		return result;

	}

}
