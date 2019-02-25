public abstract class Animal {

	private String name;
	private int numLegs;

	public Animal(String s, int n) {
		this.name = s;
		this.numLegs = n;
	}

	public int getLegs() {
		return this.numLegs;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return this.name + " " + this.numLegs;
	
	}
}
