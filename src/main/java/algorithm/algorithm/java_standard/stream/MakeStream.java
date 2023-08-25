package algorithm.algorithm.java_standard.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		char file = 'b';
		int unit = 1;
		char i = (char)(file - unit);

		System.out.println(i);

		// 1 ~ 5까지 출력
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// Stream<Integer> intStream1 = list.stream();
		// intStream1.forEach(System.out::println);

		// 범위를 사용해서 1 ~ 5까지 출력
		// IntStream intStream2 = IntStream.rangeClosed(1,5);
		// intStream2.limit(5).forEach(System.out::println);

		// 난수 5개 출력
		// IntStream intStream3 = new Random().ints();
		// intStream3.limit(5).forEach(System.out::println);

		// 난수 5개 출력
		// IntStream intStream4 = new Random().ints(5);
		// intStream4.forEach(System.out::println);

		// 범위를 사용해서 난수 5개 출력
		// IntStream intStream5 = new Random().ints(5, 100);
		// intStream5.limit(5).forEach(System.out::println);

		// 자바의 정석 821
	}
}
