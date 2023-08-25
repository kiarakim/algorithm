package algorithm.algorithm.java_standard.functionalInterface;

import java.util.function.Function;

public class FunctionUse {
	public static void main(String[] args) {
		Function<String, String> function = (str) -> "Hello " + str;

		System.out.println(function.apply("yeah"));
	}
}
