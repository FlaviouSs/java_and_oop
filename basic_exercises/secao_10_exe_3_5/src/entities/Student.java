package entities;

public class Student {
	private String name;
	private double grade_first_semester;
	private double grade_second_semester;
	
	// Constructors
	
	public Student(String name, double grade_first_semester, double grade_second_semester) {
		this.name = name;
		this.grade_first_semester = grade_first_semester;
		this.grade_second_semester = grade_second_semester;
	}

	// Getters and Setter Methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade_first_semester() {
		return grade_first_semester;
	}

	public void setGrade_first_semester(double grade_first_semester) {
		this.grade_first_semester = grade_first_semester;
	}

	public double getGrade_second_semester() {
		return grade_second_semester;
	}

	public void setGrade_second_semester(double grade_second_semester) {
		this.grade_second_semester = grade_second_semester;
	}
	
}
