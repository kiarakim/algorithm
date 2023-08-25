package algorithm.algorithm.modern_java.chap02;

import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;

public class FilterApples {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, "green"),
			new Apple(155, "green"),
			new Apple(120, "red")
		);
		//1단계 : 코드 전달
		// inventory.sort(new AppleComparator());

		//2단계 : 익명 클래스 사용
		// inventory.sort(new Comparator<Apple>() {
		// 	@Override
		// 	public int compare(Apple a1, Apple a2) {
		// 		return Integer.compare(a1.getWeight(), a2.getWeight());
		// 	}
		// });

		//3단계 : 람파 표현식 사용
		// inventory.sort(comparing(apple -> apple.getWeight()));

		//4단계 : 메서드 참조 사용
		inventory.sort(comparing(Apple::getWeight));

		for (Apple apple : inventory) {
			System.out.println(apple.getWeight());
		}
	}

	// public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
	// 	for (Apple apple : inventory) {
	// 		String output = formatter.accept(apple);
	// 		System.out.println(output);
	// 	}
	// }
}
