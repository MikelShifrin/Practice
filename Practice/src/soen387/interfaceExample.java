package soen387;

public interface interfaceExample {
	//implicitly public static final String
	String fname = "Bobby";
	public final static String lname = "Brown";
	
	//abstract method same as abstract void printIt(String text); 
	void printIt(String text);
	
	
	static void printItToSystemOut(String text) {
		System.out.println(text);
	}
	
	default public String toString(String text) {
		return text;
	}
}

/*
 * to have a functional interface it can only have 1 abstact method.
 * It can have any number of static and default methods.
 * 
 */