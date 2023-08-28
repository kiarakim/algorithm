package algo.java_standard.functionalInterface;

@FunctionalInterface
public interface CustomInterface<T> {
	T call();

	default void printDefault() {
		System.out.println("Hello Default");
	}

	// static method 는 존재해도 상관없음
	static void printStatic() {
		System.out.println("Hello Static");
	}
}
