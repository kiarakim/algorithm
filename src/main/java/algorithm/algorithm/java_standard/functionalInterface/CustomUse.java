package algorithm.algorithm.java_standard.functionalInterface;

public class CustomUse {
	public static void main(String[] args) {
		CustomInterface<String> customInterface = () -> "Hello Custom";

		String s = customInterface.call();
		System.out.println(s);

		customInterface.printDefault();

		CustomInterface.printStatic();
	}
}
