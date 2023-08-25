package algorithm.algorithm.modern_java.chap04;

import static java.util.stream.Collectors.*;
import static modern_java.chap04.Type.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		List<Dish> menu = Dishes.menu();

		List<String> threeHighCaloricDishNames = getThreeHighCaloricDishNames(menu);
		System.out.println(threeHighCaloricDishNames);
	}

	private static List<String> getThreeHighCaloricDishNames(List<Dish> menu) {
		return menu.stream()
			.filter(dish -> dish.getCalories() > 300)
			.map(Dish::getName)
			.limit(3)
			.collect(toList());
	}
}
