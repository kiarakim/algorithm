package java_standard.functionalInterface;

import java.util.function.Predicate;

public class PredicateUse {
	public static void main(String[] args) {
		Predicate<Integer> predicate1 = (num) -> num > 10;
		Predicate<Integer> predicate2 = (num) -> num < 30;

		boolean result1 = predicate1.and(predicate2).test(25);
		boolean result2 = predicate1.and(predicate2).test(41);

		System.out.println("25 : " + result1);
		System.out.println("41 : " + result2);

	}
}
