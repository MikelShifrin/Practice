package soen387;

public class Driver{

	public static void main(String[] args) {
		
		interfaceExample a = new interfaceExample() {
			public void printIt(String text) {
				System.out.println(text);
			}
		};
		
		interfaceExample b = (String text) -> {
			System.out.println(text);
		};

		//(text) -> System.out.println(text);
		
		
		a.printIt("good job");
		b.printIt("stuff");
	}


}
