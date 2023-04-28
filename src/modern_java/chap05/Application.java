package modern_java.chap05;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		);

		// 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오.
		List<Transaction> transactions2011 = transactions.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(comparing(Transaction::getValue))
			.collect(toList());

		// 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
		List<String> cities = transactions.stream()
			.map(t -> t.getTrader().getCity())
			.distinct()
			.collect(toList());

		// 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
		List<Trader> cambridgeTraders = transactions.stream()
			.map(Transaction::getTrader)
			.filter(trader -> trader.getCity().equals("Cambridge"))
			.distinct()
			.sorted(comparing(Trader::getName))
			.collect(toList());

		// 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.
		String allTraders = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.distinct()
			.sorted(comparing(String::new))
			.collect(joining());

		// 밀라노에 거래자가 있는가?
		Boolean isTraderInMilan = transactions.stream()
			.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

		// 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
		transactions.stream()
			.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getValue)
			.forEach(System.out::println);

		// 전체 트랜잭션 중 최댓값은 얼마인가?
		Optional<Integer> maxValue = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer::max);

		// 전체 트랜잭션 중 최솟값을 얼마인가?
		Optional<Transaction> minValue = transactions.stream()
			.min(Comparator.comparing(Transaction::getValue));

		OptionalInt optionalInt = transactions.stream()
			.mapToInt(Transaction::getValue)
			.max();

		int max = optionalInt.orElse(1);

		Stream<int[]> pythagorean =
			IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a ->
					IntStream.rangeClosed(a, 100)
						.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
						.mapToObj(b ->
							new int[] {a, b, (int)Math.sqrt(a * a + b * b)})
				);

		pythagorean.limit(5)
			.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

		Stream<double[]> pythagoean2 =
			IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100)
					.mapToObj(
						b -> new double[] {a, b, Math.sqrt(a * a + b * b)})
					.filter(t -> t[2] % 1 == 0)
				);

		Stream<String> words = Stream.of("Modern", "Java", "In", "Action");
		words.map(String::toUpperCase)
			.forEach(System.out::println);

		Stream<String> values =
			Stream.of("congif", "home", "user")
				.flatMap(key -> Stream.ofNullable(System.getProperty(key)));
		long valueCount = values.count();

		Stream.iterate(new int[] {0, 1},
				t -> new int[] {t[1], t[0] + t[1]})
			.limit(10)
			.map(t -> t[0])
			.forEach(t -> System.out.print(t + " "));

		System.out.println();
		IntStream.iterate(0, n -> n + 4)
			.takeWhile(n -> n < 100)
			.forEach(n -> System.out.print(n + " "));

		int a = 0;
	}
}
