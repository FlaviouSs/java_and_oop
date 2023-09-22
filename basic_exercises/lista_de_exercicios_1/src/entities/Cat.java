package entities;

public class Cat {
	
	// Attributes
	
	public boolean status;
	public String color;
	public int age;
	public String name;
	
	// Constructor
	
	public Cat(String name, int age, String color, boolean status) {
		this.status = status;
		this.color = color;
		this.age = age;
		this.name = name;
	}
	
	// Methods
	
	public void meow() {
		System.out.println("Cat meowied");
	}

	// toString
	
	public String toString() {
		return "Cat [status=" +
				status + ", color=" + 
				color + ", age=" + 
				age + ", name=" + 
				name + "]";
	}	
	
}
