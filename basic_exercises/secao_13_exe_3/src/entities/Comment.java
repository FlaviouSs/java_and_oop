package entities;

public class Comment {
	private String text;
	
	// Constructors
	
	public Comment() {
		
	}

	public Comment(String text) {
		this.text = text;
	}

	// Getters and Setters Methods
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
