package algorithm.algorithm.modern_java.chap06;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static modern_java.chap04.CaloricLevel.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import modern_java.chap04.CaloricLevel;
import modern_java.chap04.Dish;
import modern_java.chap04.Dishes;
import modern_java.chap04.Type;

public class Application {
	public static void main(String[] args) {
		List<Dish> menu = Dishes.menu();

		String shortMenu = menu.stream()
			.map(Dish::getName)
			.collect(joining(", "));

		Map<Type, List<Dish>> dishedByType = menu.stream()
			.collect(groupingBy(Dish::getType));

		Map<Type, List<Dish>> caloricDishesByType = menu.stream()
			.collect(groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));

		Map<Type, Optional<Dish>> mostCaloricByTypeOptional = menu.stream()
			.collect(groupingBy(Dish::getType, maxBy(comparingInt(Dish::getCalories))));

		Map<Type, Dish> mostCaloricByType = menu.stream()
			.collect(groupingBy(Dish::getType,
				collectingAndThen(
					maxBy(comparingInt(Dish::getCalories)),
					Optional::get
				)));

		Map<Type, Set<CaloricLevel>> caloricLevelByType = menu.stream()
			.collect(groupingBy(Dish::getType, mapping(dish -> {
					if (dish.getCalories() <= 400)
						return DIET;
					if (dish.getCalories() <= 700)
						return DIET;
					return FAT;
				},
				toSet())));

		Map<Type, Set<CaloricLevel>> caloricLevelByTypeNew = menu.stream()
			.collect(groupingBy(Dish::getType, mapping(dish -> {
					if (dish.getCalories() <= 400)
						return DIET;
					if (dish.getCalories() <= 700)
						return DIET;
					return FAT;
				},
				toCollection(HashSet::new))));

		int a = 0;
	}
}
