package study;

public class Lambda01 {

	public int max(int a, int b) {
		return a > b ? a : b;
	}
	// (a, b) -> a > b ? a : b

	public void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	// (name, i) -> System.out.println(name + "=" + i)

	public int square(int x) {
		return x * x;
	}

	// x -> x * x

	public int roll() {
		return (int)(Math.random() * 6);
	}
	// () -> (int)Math.random() * 6

}
