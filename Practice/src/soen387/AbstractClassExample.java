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

/*
Abstract class in Java Important Points:

01. abstract keyword is used to create an abstract class in java.
02. Abstract class in java can’t be instantiated.
03. We can use abstract keyword to create an abstract method, an abstract method doesn’t have body.
04. If a class have abstract methods, then the class should also be abstract using abstract keyword, else it will not compile.
05. It’s not necessary for an abstract class to have abstract method. We can mark a class as abstract even if it doesn’t declare any abstract methods.
06. If abstract class doesn’t have any method implementation, its better to use interface because java doesn’t support multiple class inheritance.
07. The subclass of abstract class in java must implement all the abstract methods unless the subclass is also an abstract class.
08. All the methods in an interface are implicitly abstract unless the interface methods are static or default. Static methods and default methods in interfaces are added in Java 8, for more details read Java 8 interface changes.
09. Java Abstract class can implement interfaces without even providing the implementation of interface methods.
10. Java Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.
11. We can run abstract class in java like any other class if it has main() method.
12. That’s all for an abstract class in Java. If I missed anything important, please let us know through comments.
*/
