package entities;

public class Employee {
	public String name;
	public double gross_salary;
	public double tax;
	
	public double netSalary() {
		return gross_salary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.gross_salary += (this.gross_salary * percentage) / 100;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f%n", netSalary());
	}
	
}
