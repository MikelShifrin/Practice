package soen387;

public abstract class AbstractClassExample {
	private String name;
	private String gender;
	
	public AbstractClassExample(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public String toString() {
		return "Name: " + this.name + " Gender: " + this.gender;
	}
	public void changeName(String name) {
		this.name = name;
	}
	
	public abstract double getPay();
	public abstract void doIt(int count);
	
}
