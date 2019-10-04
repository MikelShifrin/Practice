package soen387;

public class AbstractClassChild extends AbstractClassExample{

	private int id;
	
	public AbstractClassChild(String name, String gender, int id) {
		super(name, gender);
		this.id = id;
	}

	@Override
	public double getPay() {
		
		return 0;
	}

	@Override
	public void doIt(int count) {
		
		
	}

}
