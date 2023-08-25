package algorithm.algorithm.java_standard.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayAndList {
	public static void main(String[] args) {
		String[] strArr = {"aaa", "bbb", "ccc"};
		List<String> strList = Arrays.asList(strArr);

		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);

		// strStream1.sorted().forEach(System.out::println);
		// strStream2.sorted().forEach(System.out::println);

		List<String> sortedList = strStream2.sorted().collect(Collectors.toList());
	}
}
