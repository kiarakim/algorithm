package algorithm.algorithm.java_standard.functionalInterface;

import java.util.Comparator;

public class ComparatorUse {
	public static void main(String[] args) {
		Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);

		System.out.println(comparator.compare(6, 3));
	}
}
