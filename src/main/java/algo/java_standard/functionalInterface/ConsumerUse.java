package algo.java_standard.functionalInterface;

import java.util.function.Consumer;

public class ConsumerUse {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (num) -> System.out.println(num * 10);

		consumer.accept(123);
		consumer.accept(432);
	}
}
