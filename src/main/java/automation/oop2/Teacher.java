package automation.oop2;

public class Teacher extends Person {

	private double salary;
	private String subjectMatter;
	private byte yearOfExperience;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubjectMatter() {
		return subjectMatter;
	}

	public void setSubjectMatter(String subjectMatter) {
		this.subjectMatter = subjectMatter;
	}

	public byte getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(byte yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

}
