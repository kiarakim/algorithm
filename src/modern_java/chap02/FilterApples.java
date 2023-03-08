package modern_java.chap02;

import java.util.Arrays;
import java.util.List;

public class FilterApples {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, "green"),
			new Apple(155, "green"),
			new Apple(120, "red")
		);
		prettyPrintApple(inventory, new AppleFancyFormatter());
	}

	public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
		for(Apple apple : inventory){
			String output = formatter.accept(apple);
			System.out.println(output);
		}
	}
}
