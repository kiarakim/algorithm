package algorithm.algorithm.modern_java.chap05;

public class Trader {
	private final String name;
	private final String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return "trader:" + this.name + " in " + this.city;
	}
}
